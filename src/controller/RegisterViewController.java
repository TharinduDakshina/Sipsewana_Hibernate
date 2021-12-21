package controller;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

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
}
