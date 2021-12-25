package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class UpdateViewController {

    public AnchorPane updateDashBord;
    public AnchorPane UpdateStudentDashBord;
    public ComboBox cmbSelectStudentId;
    public TextField txtStudentName;
    public TextField txtContact;
    public TextField txtGender;
    public ComboBox cmbSelectCourse;
    public TableView tblCourse;
    public TableColumn colCourseName;

    public void updateOnAction(ActionEvent event) {

    }

    public void backOnAction(ActionEvent event) throws IOException {
        URL resource = getClass().getResource("../view/DashBordForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene=new Scene(load);
        Stage window=(Stage) updateDashBord.getScene().getWindow();
        window.setScene(scene);
    }
}
