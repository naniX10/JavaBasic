package KTY.basic.day08.hr;

public class Departments {


    // 멤버변수
    private int departid;
    private String departname;
    private int managerid;
    private int locationid;

    // 연산자
    public Departments() {}

    public Departments(int departid, String departname, int managerid, int locationid) {
        this.departid = departid;
        this.departname = departname;
        this.managerid = managerid;
        this.locationid = locationid;
    }

    // getter , setter


    public int getDepartid() {
        return departid;
    }

    public void setDepartid(int departid) {
        this.departid = departid;
    }

    public String getDepartname() {
        return departname;
    }

    public void setDepartname(String departname) {
        this.departname = departname;
    }

    public int getManagerid() {
        return managerid;
    }

    public void setManagerid(int managerid) {
        this.managerid = managerid;
    }

    public int getLocationid() {
        return locationid;
    }

    public void setLocationid(int locationid) {
        this.locationid = locationid;
    }

}