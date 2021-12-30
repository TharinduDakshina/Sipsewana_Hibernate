package controller;

import bo.BOFactory;
import bo.BOType;
import bo.custom.ProgramsBO;
import bo.custom.RegistrationBO;
import bo.custom.impl.RegistrationBOImpl;
import bo.custom.impl.StudentBOImpl;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import dao.custom.impl.RegistrationDAOImpl;
import dto.ProgramDTO;
import dto.RegistrationDTO;
import dto.StudentDTO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.util.List;

public class RegisterStudentViewController {
    public AnchorPane studentContextBord;
    public JFXTextField txtName;
    public JFXTextField txtAddress;
    public JFXTextField txtContact;
    public RadioButton genderMale;
    public ToggleGroup Gender;
    public RadioButton genderFemale;
    public RadioButton genderOther;
    public JFXComboBox cmbCourses;
    public JFXTextField txtId;
    public Label lblRegNumber;
    public Label lblDate;

    ProgramsBO programsBO = BOFactory.getInstance().getBO(BOType.PROGRAMS);
    ObservableList<String> programList= FXCollections.observableArrayList();
    RegistrationBOImpl registrationBO=BOFactory.getInstance().getBO(BOType.REGISTRATION);
    StudentBOImpl studentBO=BOFactory.getInstance().getBO(BOType.STUDENT);
    public void initialize(){
        try {
            loadPrograms();
        } catch (Exception e) {
            new Alert(Alert.AlertType.ERROR,"Syntax Error").show();
            e.printStackTrace();
        }

        generateREINNo();

    }

    private void generateREINNo() {

    }

    private void loadPrograms() throws Exception {
       List<ProgramDTO> all=null;
       all =programsBO.getAll();
        for (ProgramDTO temp:all) {
            programList.add(temp.getProgram());
        }

        cmbCourses.setItems(programList);
    }

    public void registerStudentOnAction(ActionEvent event) throws Exception {
        int regNo=1;
        String date=lblDate.getText();
        String fee="Paid";

        String sId=txtId.getId();
        String sName=txtName.getText();
        String sAddress=txtAddress.getText();
        int contact=Integer.valueOf(txtContact.getText());
        String sGender="Male";

        if (genderFemale.isSelected()){
            sGender="Female";
        }else if(genderOther.isSelected()){
            sGender="other";
        }

        if (registrationBO.add(new RegistrationDTO(
                regNo,date,fee
        )) || studentBO.add(new StudentDTO(
                sId,sName,sAddress,contact,sGender
        ))){
            clearContent();
            new Alert(Alert.AlertType.INFORMATION,"added Student").show();
        }
    }

    private void clearContent() {
        txtId.clear();
        txtName.clear();
        txtContact.clear();
        txtAddress.clear();

    }
}
