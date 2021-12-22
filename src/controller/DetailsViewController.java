package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;

public class DetailsViewController {
    public AnchorPane mainDetailsContent;
    public AnchorPane studentDetailContent;
    public TextField txtId;
    public TextField txtName;
    public TextField txtAddress;
    public TextField txtContact;
    public TextField txtGender;
    public TableView tblPrograms;
    public TableColumn colProgramsName;

    public void clearOnAction(ActionEvent event) {
    }

    public void selectProgramOnAction(ActionEvent event) {
    }

    public void selectStudentOnAction(ActionEvent event) {
    }

    public void searchOnAction(KeyEvent keyEvent) {
    }
}
