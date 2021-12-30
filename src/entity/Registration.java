package entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Registration implements SuperEntity{
    @Id
    private int regNo;
    private Date date;
    private double totalFee;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_Id", referencedColumnName = "id" , nullable = false)
    private Student student;


    @ManyToOne
    @JoinColumn(name = "program_Id" , referencedColumnName = "id" , nullable = false)
    private Programs programs;

    public Registration() {
    }

    public Registration(int regNo, Date date, double totalFee) {
        this.regNo = regNo;
        this.date = date;
        this.totalFee = totalFee;
    }

    public Registration(int regNo, Date date, double totalFee, Student student, Programs programs) {
        this.regNo = regNo;
        this.date = date;
        this.totalFee = totalFee;
        this.student = student;
        this.programs = programs;
    }

    public int getRegNo() {return regNo;}

    public void setRegNo(int regNo) {this.regNo = regNo;}

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
