package dto;

public class RegistrationDTO {
    private int regNo;
    private String date;
    private String fee;

    public RegistrationDTO() {
    }

    public RegistrationDTO(int regNo, String date, String fee) {
        this.setRegNo(regNo);
        this.setDate(date);
        this.setFee(fee);
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "RegistrationDTO{" +
                "regNo=" + regNo +
                ", date='" + date + '\'' +
                ", fee='" + fee + '\'' +
                '}';
    }
}
