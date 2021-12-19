package entity;

public class Programs {
    private String id;
    private String program;
    private String duration;
    private double fee;

    public Programs() {
    }

    public Programs(String id, String program, String duration, double fee) {
        this.setId(id);
        this.setProgram(program);
        this.setDuration(duration);
        this.setFee(fee);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
}
