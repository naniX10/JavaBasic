package KTY.basic.day08.hr;

public class JobHistory {

    //멤버변수
    private int emid;
    private String startday;
    private String endday;
    private String jobid;
    private int departid;

    //연산자
    public JobHistory() {}

    public JobHistory(int emid, String startday, String endday, String jobid, int departid) {
        this.emid = emid;
        this.startday = startday;
        this.endday = endday;
        this.jobid = jobid;
        this.departid = departid;
    }

    // setter, getter
    public int getEmid() {
        return emid;
    }

    public void setEmid(int emid) {
        this.emid = emid;
    }

    public String getStartday() {
        return startday;
    }

    public void setStartday(String startday) {
        this.startday = startday;
    }

    public String getEndday() {
        return endday;
    }

    public void setEndday(String endday) {
        this.endday = endday;
    }

    public String getJobid() {
        return jobid;
    }

    public void setJobid(String jobid) {
        this.jobid = jobid;
    }

    public int getDepartid() {
        return departid;
    }

    public void setDepartid(int departid) {
        this.departid = departid;
    }
}