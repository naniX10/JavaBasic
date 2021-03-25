package KTY.basic.day08.hr;

public class Employees {

    // ㅁㅂㅂㅅ
    private int emid;
    private String fn;
    private String ln;
    private String email;
    private String Pno;
    private String hiredate;
    private String jobid;
    private int sal;
    private String commpct;
    private int manid;
    private int departid;

    // 생성자


    public Employees() {
    }

    public Employees(int emid, String fn, String ln, String email,
              String pno, String hiredate, String jobid, int sal,
              String commpct, int manid, int departid) {

        this.emid = emid;
        this.fn = fn;
        this.ln = ln;
        this.email = email;
        this.Pno = pno;
        this.hiredate = hiredate;
        this.jobid = jobid;
        this.sal = sal;
        this.commpct = commpct;
        this.manid = manid;
        this.departid = departid;
    }

    // getter, setter


    public int getEmid() {
        return emid;
    }

    public void setEmid(int emid) {
        this.emid = emid;
    }

    public String getFn() {
        return fn;
    }

    public void setFn(String fn) {
        this.fn = fn;
    }

    public String getLn() {
        return ln;
    }

    public void setLn(String ln) {
        this.ln = ln;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPno() {
        return Pno;
    }

    public void setPno(String pno) {
        Pno = pno;
    }

    public String getHiredate() {
        return hiredate;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }

    public String getJobid() {
        return jobid;
    }

    public void setJobid(String jobid) {
        this.jobid = jobid;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public String getCommpct() {
        return commpct;
    }

    public void setCommpct(String commpct) {
        this.commpct = commpct;
    }

    public int getManid() {
        return manid;
    }

    public void setManid(int manid) {
        this.manid = manid;
    }

    public int getDepartid() {
        return departid;
    }

    public void setDepartid(int departid) {
        this.departid = departid;
    }
}