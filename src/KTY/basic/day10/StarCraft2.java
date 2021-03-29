package kty.basic.day10;


public class StarCraft2 {

    // 인터페이스 기반으로 스타크래프트의 유닛을 정의해 봄

    public static void main(String[] args) {

        SCV2 s = new SCV2();
        System.out.println( "SCV의 체력" + s.hp );
        s.atteck();
        s.move();
        s.specialAbility();

        marine2 m = new marine2();
        System.out.println( "해병의 체력" + m.hp );
        m.atteck();
        m.move();
        m.specialAbility();

        firebat2 f = new firebat2();
        System.out.println( "화염방사병의 체력" + f.hp );
        f.atteck();
        f.move();
        f.specialAbility();

        medic2 me = new medic2();
        System.out.println( "의무병의 체력" + me.hp );
        me.atteck();
        me.move();
        me.specialAbility();


    }

}
abstract class unit2 {
    public String name;
    public int hp;
    public int attpo;
    public double movsp;
    public int mineral;
    public int gas;

    public unit2() {
    }

//        public unit(String name, int hp, int attpo, double movsp, int mineral, int gas) {
//            this.name = name;
//            this.hp = hp;
//            this.attpo = attpo;
//            this.movsp = movsp;
//            this.mineral = mineral;
//            this.gas = gas;
//
//        }

//    abstract public void atteck();
//    abstract public void move();
//    abstract public void specialAbility();

}

// 추상클래스에서 정의했던 추상메서드를
// 독립적인 코드들로 분리함 -> 인터페이스

interface Unit2Action{
    abstract public void atteck(); // void 앞의 글자들은 생략 가능!
    abstract public void move();
    abstract public void specialAbility();
}




class SCV2 extends unit2 implements Unit2Action {

    final String attmsg = "이 유닛은 융합 절단기으로 %d의 피해를 입힙니다\n";
    final String movmsg = "이 유닛은 %.2f의 이동속도를 가지고 있습니다\n";
    final String spabmsg = "이 유닛은 자원채취를 할 수 있으며,\n" +
            "테란의 건물들을 건설, 수리할 수 있습니다\n";



    public SCV2() {
        name = "SCV";
        hp = 60;
        attpo = 5;
        movsp = 2.34;
        mineral = 50;
        gas = 0;
    }

    @Override
    public void atteck() {
        System.out.printf("이 유닛은 융합 절단기로 %d의 피해를 입힙니다\n", attpo);
    }

    @Override
    public void move() {
        System.out.printf("이 유닛은 %2f의 이동 속도를 가지고 있습니다\n", movsp);
    }

    @Override
    public void specialAbility() {
        System.out.println("이 유닛은 자원채취를 할 수 있으며,\n" +
                "테란의 건물들을 건설, 수리할 수 있습니다\n");
    }



//    public SCV(String name, int hp, int attpo, double movsp, int mineral, int gas) {
//        super(name, hp, attpo, movsp, mineral, gas);
//    }




} // scv

class marine2 extends unit2 implements Unit2Action{

    final String attmsg = "이 유닛은 가우스 소총으로 %d의 피해를 입힙니다\n";
    final String movmsg = "이 유닛은 %.2f의 이동속도를 가지고 있습니다\n";
    final String spabmsg = "이 유닛은 전투자극제 연구가 완료되었을때,\n" +
            "전투자극제를 사용할 수 있고, 전투자극제 사용시 생명력을 10 소모하여\n" +
            "이동속도가 2.813으로 증가, 공격주기가 9로 감소합니다\n";
    // ↖위에 메세지에서 %를 표현하고 싶으면 %%로 표현가능

    public marine2() {
        name = "해병";
        hp = 40;
        attpo = 6;
        movsp = 1.875;
        mineral = 50;
        gas = 0;
    }

    @Override
    public void atteck() {
        System.out.printf(attmsg, attpo);
    }

    @Override
    public void move() {
        System.out.printf(movmsg, movsp);
    }

    @Override
    public void specialAbility() {
        System.out.println(spabmsg);
    }
} // marine

class firebat2 extends unit2 implements Unit2Action {

    final String attmsg = "이 유닛은 화염방사로 %d의 피해를 입힙니다\n";
    final String movmsg = "이 유닛은 %.2f의 이동속도를 가지고 있습니다\n";
    final String spabmsg = "이 유닛은 전투자극제 연구가 완료되었을때,\n" +
            "전투자극제를 사용할 수 있고, 전투자극제 사용시 생명력을 10 소모하여\n" +
            "이동속도가 2.813으로 증가, 공격주기가 9로 감소합니다\n";


    public firebat2() {
        name = "화염방사병";
        hp = 50;
        attpo = 8 * 2;
        movsp = 1.875;
        mineral = 50;
        gas = 25;
    }


    @Override
    public void atteck() {
        System.out.printf(attmsg, attpo);
    }

    @Override
    public void move() {
        System.out.printf(movmsg, movsp);
    }

    @Override
    public void specialAbility() {
        System.out.println(spabmsg);
    }
}// firebat

class medic2 extends unit2 implements Unit2Action{

    final String attmsg = "이 유닛은 공격할 수 없습니다\n";
    final String movmsg = "이 유닛은 %.2f의 이동속도를 가지고 있습니다\n";
    final String spabmsg = "이 유닛은 다른 유닛을 치료할 수 있고,\n" +
            "회복 연구 완료시, 한 유닛의 해로운 상태이상을 풀어주는 회복을 사용할 수 있습니다\n" +
            "광학조명탄 연구 완료시, 적의 시야를 마비시키는 광학 조명탄을 사용할 수 있습니다\n";



    public medic2() {
        name = "의무관";
        hp = 60;
        attpo = 0;
        movsp = 1.875;
        mineral = 50;
        gas = 25;
    }

    @Override
    public void atteck() {
        System.out.printf(attmsg);
    }

    @Override
    public void move() {
        System.out.printf(movmsg, movsp);
    }

    @Override
    public void specialAbility() {
        System.out.println(spabmsg);
    }


} //medic


