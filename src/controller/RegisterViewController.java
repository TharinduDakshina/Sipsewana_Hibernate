package controller;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class RegisterViewController {

    public AnchorPane registrationDashBord;
    public AnchorPane changeContent;
    public Label lblDate;

    public void backOnAction(ActionEvent event) throws IOException {
        URL resource = getClass().getResource("../view/DashBordForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene=new Scene(load);
        Stage window=(Stage) registrationDashBord.getScene().getWindow();
        window.setScene(scene);
    }

    public void selectStudentRegOnAction(ActionEvent event) throws IOException {
        this.changeContent.getChildren().clear();
        this.changeContent.getChildren().add(FXMLLoader.load(this.getClass().getResource("../view/RegisterStudentView.fxml")));
    }

    public void selectProgramRegOnAction(ActionEvent event) throws IOException {
        this.changeContent.getChildren().clear();
        this.changeContent.getChildren().add(FXMLLoader.load(this.getClass().getResource("../view/RegistrationProgramView.fxml")));
    }
}
