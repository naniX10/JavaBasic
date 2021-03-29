package kty.basic.day10;

public class SayHello {
        // 다국어(한글, 영어, 일본어)로 인사하는 프로그램 작성
    public static void main(String[] args) {
        // 다국어 인삿말 하기 - 국가별 인삿말을 개별적으로 작성
        SayHelloKor say1 = new SayHelloKor();
        say1.sayHello();

        SayHelloEng say2 = new SayHelloEng();
        say2.sayHello();

        SayHelloJap say3 = new SayHelloJap();
        say3.sayHello();

        // 다형성을 이용해서 인삿말을 세련되게 하기

        SayHelloService say = new SayHelloKor();
        say.sayHello();

        say = new SayHelloEng();
        say.sayHello();

        say = new SayHelloJap();
        say.sayHello();


    }// main

}// sayhel


interface SayHelloService {      // 인터페이스 하려면  <<<< 이거 쓰고
    void sayHello();             //   <<<< 이거 쓰고
}                                // 아래에 imple~ 랑 Say~~~service 추가하기!
                                 // 그리고 메인 위에 있는거 추가하기!

class SayHelloKor implements SayHelloService{
    @Override
    public void sayHello (){
        System.out.println("안녕하세요, 자바8!");

    } // SH

} // SHK

class SayHelloEng implements SayHelloService{
    @Override
    public void sayHello (){
        System.out.println("Hello, Java8!");

    } // SH

} // SHE

class SayHelloJap implements SayHelloService{
    @Override
    public void sayHello (){
        System.out.println("こんにちは、ジャワ８！！");

    } // SH

}// SHJ





