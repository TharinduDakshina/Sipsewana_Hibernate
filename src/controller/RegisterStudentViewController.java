package controller;

import bo.BOFactory;
import bo.BOType;
import bo.custom.AddRegistrationBO;
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

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
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
    public JFXComboBox cmbProgramId;
    public JFXTextField txtDuration;
    public JFXTextField txtFee;

    ProgramsBO programsBO = BOFactory.getInstance().getBO(BOType.PROGRAMS);
    ObservableList<String> programList= FXCollections.observableArrayList();
    ObservableList<String> programIdList= FXCollections.observableArrayList();
    AddRegistrationBO addRegistrationBO=BOFactory.getInstance().getBO(BOType.ADDREGISTRATION);


    public void initialize(){
        try {
            loadPrograms();
        } catch (Exception e) {
            new Alert(Alert.AlertType.ERROR,"Syntax Error").show();
            e.printStackTrace();
        }

        try {
            loadProgramsId();
        } catch (Exception e) {
            new Alert(Alert.AlertType.ERROR,"Syntax Error load Programs Id").show();
            e.printStackTrace();
        }

        /*generateREINNo();*/
        setDate();
    }

    private void loadProgramsId() throws Exception {
        List<ProgramDTO> all=null;
        all =programsBO.getAll();
        for (ProgramDTO temp:all) {
            programIdList.add(temp.getId());
        }

        cmbProgramId.setItems(programIdList);
    }

    private void setDate() {
        Date date=new Date();
        SimpleDateFormat f=new SimpleDateFormat("YYYY-MM-dd ");
        lblDate.setText(f.format(date));
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
       try {
           int regNo=1;
           String date=String.valueOf(LocalDate.now());

           String pId= String.valueOf(cmbProgramId.getValue());
           System.out.println(pId);
           String pName= String.valueOf(cmbCourses.getValue());
           String duration=txtDuration.getText();
           double fee=Double.valueOf(txtFee.getText());



           List<ProgramDTO> selectProgramDTOList=new ArrayList<>();
           selectProgramDTOList.add(new ProgramDTO(
                   pId,pName,duration,fee
           ));
           selectStudentDTO();
           List<RegistrationDTO> selectRegDTOList=new ArrayList<>();
           for (ProgramDTO temp:selectProgramDTOList) {
               selectRegDTOList.add(new RegistrationDTO(
                       regNo,
                       date,
                       fee,
                       selectStudentDTO(),
                       temp
               ));
           }
           /*-------------------------------------------------*/

           boolean rest=addRegistrationBO.addRegistration(
                   selectStudentDTO(),
                   selectRegDTOList
           );
           if (rest){
               System.out.println("Save");
           }else {
               System.out.println("no");
           }

       }catch (Exception e){
           System.out.println("Exception Error registrationView controller");
       }


       /* if (registrationBO.add(new RegistrationDTO(
                regNo,date,fee
        )) || studentBO.add(new StudentDTO(
                sId,sName,sAddress,contact,sGender
        ))){
            clearContent();
            new Alert(Alert.AlertType.INFORMATION,"added Student").show();
        }*/
    }

    private StudentDTO selectStudentDTO() {
        String sId=txtId.getId();
        String sName=txtName.getText();
        String sAddress=txtAddress.getText();
        int contact=Integer.valueOf(txtContact.getText());
        System.out.println(contact);
        String sGender="Male";

        if (genderFemale.isSelected()){
            sGender="Female";
        }else if(genderOther.isSelected()){
            sGender="other";
        }

        StudentDTO selectStudentDTO=new StudentDTO();
        selectStudentDTO.setId(sId);
        selectStudentDTO.setName(sName);
        selectStudentDTO.setAddress(sAddress);
        selectStudentDTO.setContact(contact);
        selectStudentDTO.setGender(sGender);

        return selectStudentDTO;
    }

    private void clearContent() {
        txtId.clear();
        txtName.clear();
        txtContact.clear();
        txtAddress.clear();
    }
}
