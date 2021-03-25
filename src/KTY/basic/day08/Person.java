package KTY.basic.day08;

public class Person {
    public static void main(String[] args) {

    }
}

class Per {
    // 멤버변수
    private String name;
    private String gender;
    private int age;
    private int height;
    private int weight;

    // 생성자
    public Per(){
            }

    public Per(String 이름, String 성별, int 나이,
               int 키, int 몸무게){
        this.name = 이름;
        this.gender = 성별;
        this.age = 나이;
        this.height = 키;
        this.weight = 몸무게;
    }
    Per pe = new Per("김씨", "남", 45, 160, 100);

    // setter/ getter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

class Book {

    // 멤버변수
    private String bookname;
    private String writer;
    private String translate;
    private String company;
    private String day;
    private int bprice;
    private int aprice;
    private double discount;
    private int mileage;


    // 생성자
    public Book() {}

    public Book(String bookname, String writer, String translate,
                String company, String day, int bprice,
                double discount) {

        this.bookname= bookname;
        this.writer = writer;
        this.translate = translate;
        this.company = company;
        this.day = day;
        this.bprice = bprice;
        this.discount = discount;

    }


    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getTranslate() {
        return translate;
    }

    public void setTranslate(String translate) {
        this.translate = translate;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getBprice() {
        return bprice;
    }

    public void setBprice(int bprice) {
        this.bprice = bprice;
    }

    public int getAprice() {
        return aprice;
    }

    public void setAprice(int aprice) {
        this.aprice = aprice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}

