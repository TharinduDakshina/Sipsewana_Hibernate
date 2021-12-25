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
    public JFXTextField txtName;
    public JFXTextField txtAddress;
    public JFXTextField txtContact;
    public Label lblStudentId;
    public Label lblDate;
    public RadioButton genderMale;
    public ToggleGroup Gender;
    public RadioButton genderFemale;
    public RadioButton genderOther;
    public JFXComboBox cmbCourses;
    public TableView tblCourse;
    public TableColumn colCourseName;

    public void btnAddCourse(ActionEvent event) {
    }

    public void btnRemoveCouse(ActionEvent event) {
    }

    public void registerStudentOnAction(ActionEvent event) {
    }

    public void backOnAction(ActionEvent event) throws IOException {
        URL resource = getClass().getResource("../view/DashBordForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene=new Scene(load);
        Stage window=(Stage) registrationDashBord.getScene().getWindow();
        window.setScene(scene);
    }
}
