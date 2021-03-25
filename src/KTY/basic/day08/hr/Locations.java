package KTY.basic.day08.hr;

public class Locations {

    // 멤버변수
    private int locationsid;
    private String stadd;
    private String poscode;
    private String city;
    private String statepro;
    private String countryid;

    // 연산자
    public Locations() {}

    public Locations(int locationsid, String stadd, String poscode, String city,
               String statepro, String countryid) {
        this.locationsid = locationsid;
        this.stadd = stadd;
        this.poscode = poscode;
        this.city = city;
        this.statepro = statepro;
        this.countryid = countryid;

    }

    // getter, setter

    public int getLocationsid() {
        return locationsid;
    }

    public void setLocationsid(int locationsid) {
        this.locationsid = locationsid;
    }

    public String getStadd() {
        return stadd;
    }

    public void setStadd(String stadd) {
        this.stadd = stadd;
    }

    public String getPoscode() {
        return poscode;
    }

    public void setPoscode(String poscode) {
        this.poscode = poscode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStatepro() {
        return statepro;
    }

    public void setStatepro(String statepro) {
        this.statepro = statepro;
    }

    public String getCountryid() {
        return countryid;
    }

    public void setCountryid(String countryid) {
        this.countryid = countryid;
    }
}