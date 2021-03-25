package KTY.basic.day08.hr;

public class Jobs {

    // 멤버변수
    private String jobid;
    private String jobtitle;
    private int minsal;
    private int maxsal;

    // 생성자
    public Jobs() {}

    public Jobs(String jobid, String jobtitle, int minsal, int maxsal) {
        this.jobid = jobid;
        this.jobtitle = jobtitle;
        this.minsal = minsal;
        this.maxsal = maxsal;
    }
    //getter, setter


    public String getJobid() {
        return jobid;
    }

    public void setJobid(String jobid) {
        this.jobid = jobid;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public int getMinsal() {
        return minsal;
    }

    public void setMinsal(int minsal) {
        this.minsal = minsal;
    }

    public int getMaxsal() {
        return maxsal;
    }

    public void setMaxsal(int maxsal) {
        this.maxsal = maxsal;
    }
}