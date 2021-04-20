package kty.basic.sungjuk;

import java.io.Serializable;

// 직렬화를 지원하기 위해 Serializable 구현해서 정의해야 함!
public class SungJukVO implements Serializable {

    protected String name;
    protected int kor;
    protected int eng;
    protected int mat;
    protected int sum;
    protected double avg;
    protected char grd;


    public SungJukVO(String name, int kor, int eng, int mat) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public char getGrd() {
        return grd;
    }

    public void setGrd(char grd) {
        this.grd = grd;
    }

    @Override
    public String toString() {

        String fmt = "{이름 : '%s', 국어 : %d, 영어 : %d, 수학 : %d\n" +
                "총점 : %d, 평균 : %.1f, 등급 : '%c' \n}";
        String result = String.format(fmt, name, kor, eng, mat, sum, avg, grd);

        return result;
    }

} // clsSJVO

