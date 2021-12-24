package entity;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

public class Registration implements SuperEntity {
    private String regNo;
    private Date date;
    private double totalFee;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Student_Id", referencedColumnName = "id" , nullable = false)
    private Student student;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "program_Id" , referencedColumnName = "id" , nullable = false)
    private Programs programs;
    public Registration() {
    }

    public Registration(String regNo, Date date, double totalFee, Student student, Programs programs) {
        this.regNo = regNo;
        this.date = date;
        this.totalFee = totalFee;
        this.setStudent(student);
        this.setPrograms(programs);
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(double totalFee) {
        this.totalFee = totalFee;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Programs getPrograms() {
        return programs;
    }

    public void setPrograms(Programs programs) {
        this.programs = programs;
    }
}
