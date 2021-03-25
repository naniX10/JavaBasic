package KTY.basic.day08.hr;

public class Countries {

    // ㅁㅂㅂㅅ
    private String countryid;
    private String countryname;
    private int regionid;

    // 연산자


    public Countries() {
    }

    public Countries(String countryid, String countryname, int regionid) {
        this.countryid = countryid;
        this.countryname = countryname;
        this.regionid = regionid;
    }

    // g, s


    public String getCountryid() {
        return countryid;
    }

    public void setCountryid(String countryid) {
        this.countryid = countryid;
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    public int getRegionid() {
        return regionid;
    }

    public void setRegionid(int regionid) {
        this.regionid = regionid;
    }
}