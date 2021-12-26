package dto;

import java.util.Date;

public class RegistrationDTO {
    private String regNo;
    private Date date;
    private double totalFee;

    public RegistrationDTO() {
    }

    public RegistrationDTO(String regNo, Date date, double totalFee) {
        this.setRegNo(regNo);
        this.setDate(date);
        this.setTotalFee(totalFee);
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

    @Override
    public String toString() {
        return "RegistrationDTO{" +
                "regNo='" + regNo + '\'' +
                ", date=" + date +
                ", totalFee=" + totalFee +
                '}';
    }
}
