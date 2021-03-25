package KTY.basic.day08.hr;

public class Regions {

    private int regionid;
    private String regionname;

    public Regions() {
    }

    public Regions(int regionid, String regionname) {
        this.regionid = regionid;
        this.regionname = regionname;
    }

    public int getRegionid() {
        return regionid;
    }

    public void setRegionid(int regionid) {
        this.regionid = regionid;
    }

    public String getRegionname() {
        return regionname;
    }

    public void setRegionname(String regionname) {
        this.regionname = regionname;
    }
}