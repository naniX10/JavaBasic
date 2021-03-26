package KTY.basic.day09;

public class Phones {
    public static void main(String[] args) {
        Normalphone n = new Normalphone();
        n.sendCall();

        MP3Phone m = new MP3Phone();
        m.playMusic();

        SmartPhone s = new SmartPhone();
        s.takePic();

    }
}

class Normalphone {
    protected void sendCall() {}
    protected void receiveCall() {}
}

interface PhoneInterface{
    void sendcall();
    void receivecall();
}

interface MP3Interface{
    void playMusic();
    void viewMovie();
}

interface SmartPhoneInterface{
    void takePic();
    void surfInternet();
    void playGame();
}

class normalphone implements PhoneInterface { // 만들때마다 다르게 만든다?

    @Override
    public void sendcall(){
        System.out.println("전화 거는 중...");
    }

    @Override
    public void receivecall(){
        System.out.println("전화 받는 중...");
    }
}

class MP3Phone implements PhoneInterface, MP3Interface{
    @Override
    public void sendcall() {
        System.out.println("전화 거는 중...");
    }

    @Override
    public void receivecall() {
        System.out.println("전화 받는 중...");
    }

    @Override
    public void playMusic() {
        System.out.println("음악을 재생합니다");
    }

    @Override
    public void viewMovie() {
        System.out.println("동영상을 재생합니다");
    }

}

class SmartPhone implements PhoneInterface, SmartPhoneInterface{

    @Override
    public void sendcall() {
        System.out.println("전화 거는 중...");
    }

    @Override
    public void receivecall() {
        System.out.println("전화 받는 중...");
    }

    @Override
    public void takePic() {
        System.out.println("사진을 찍습니다");
    }

    @Override
    public void surfInternet() {
        System.out.println("인터넷을 합니다");
    }

    @Override
    public void playGame() {
        System.out.println("게임을 합니다");
    }
}



// 상속 extends : 부모 클래스가 가진 특성과 기능을 변화없이 받음
// 구현 implements : 부모 클래스가 정해준 틀에 맞춰 새롭게 작성
// 따라서 아래처럼 짜는 것은 다소 세련되지 못함

class MP3Phone2 extends Normalphone implements MP3Interface{
    @Override
    public void playMusic() {

    }

    @Override
    public void viewMovie() {

    }

}

