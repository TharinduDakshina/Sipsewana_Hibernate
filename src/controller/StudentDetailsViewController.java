package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class StudentDetailsViewController {

    public AnchorPane StudentDetailContent;
    public TextField txtId;
    public TextField txtName;
    public TextField txtAddress;
    public TextField txtContact;
    public TextField txtGender;
    public TableView tblPrograms;
    public TableColumn colProgramsName;

    public void searchOnAction(KeyEvent keyEvent) {
    }

    public void clearOnAction(ActionEvent event) {
        txtId.clear();
        txtName.clear();
        txtAddress.clear();
        txtContact.clear();
        txtGender.clear();
        tblPrograms.getItems().clear();
    }

}
