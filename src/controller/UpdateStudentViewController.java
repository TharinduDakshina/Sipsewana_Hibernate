package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class UpdateStudentViewController {
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

    public void searchOnAction(ActionEvent event) {
    }
}
