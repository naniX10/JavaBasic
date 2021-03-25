package KTY.basic.day08;

public class Inheritance {
    public static void main(String[] args) {
        // 상속
        // 객체지향 3대 개념의 하나
        // 기존의 클래스에 기능을 추가하거나 재정의 해서
        // 새로운 클래스를 만드는 것을 의미

        // 상속을 이용하면 기존에 만들어둔
        // 클래스의 모든 필드와 메서드를 이용해서
        // 새로운 클래스를 간편하게 만들 수 있음
        // 기존 클래스를 부모/상위/슈퍼 클래스라 하고
        // 새롭게 작성된 클래스를 자식/하위/서브 클래스라고 함


        // 상속의 장점
        // 기존 작성된 클래스를 재활용
        // 클래스의 계층구조 파악 용이
        // 소프트웨어 생산성 증가

        // 형식
        // class 클래스명 extends 부모클래스명 { }
        // 부모 클래스명은 하나밖에 못 씀!!!!!!!!!!!!!

        Tiger2 t = new Tiger2();
        System.out.println(t.eyes);
        System.out.println(t.legs);


    }

}

class Eagle{
    String eyes;
    String mouth;
    String wings;

    public void eat() {}
    public void sleep() {}
    public void fly() {}

}
class Tiger{
    String eyes;
    String mouth;
    String legs;

    public void eat() {}
    public void sleep() {}
    public void run() {}

}

class Goldfish{
    String eyes;
    String mouth;
    String fin;

    public void eat() {}
    public void sleep() {}
    public void swim() {}
}

class Animal{
    String eyes;
    String mouth;

    public void eat() { }
    public void sleep() { }

}
class Eagle2 extends Animal{
    String wings;
    public void fly() {}
}

class Tiger2 extends Animal{
    String legs;
    public void run() {}
}

class Goldfish2 extends Animal{
    String fin;
    public void swim() {}
}



















