package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;

public class ProgramDetailsViewController {
    public AnchorPane programDetailContent;
    public TextField txtProgramId;
    public TextField txtProgramName;
    public TextField txtProgramDuration;
    public TextField txtProgramFee;

    public void SearchOnAction(KeyEvent keyEvent) {
    }

    public void clearOnAction(ActionEvent event) {
    }
}
