package KTY.basic.day09;

public class StarCraft {
    public static void main(String[] args) {
        // SCV s = new SCV("SCV", 45, 5, 2.81, 50, 0);
        // scv 유닛을 만들때 마다 초기값을 지정하는 것은 다소 번거로움
        // 즉, 동일한 속성을 가진 유닛을 만들때 마다
        // 매개변수를 통해 객체를 만드는 것은 비효율적임
        // 이런 경우, 생성자 내에서 초기값을 지정하는 것이 나음

        SCV s = new SCV();
        System.out.println( "SCV의 체력" + s.hp );
        s.atteck();
        s.move();
        s.specialAbility();

        marine m = new marine();
        System.out.println( "해병의 체력" + m.hp );
        m.atteck();
        m.move();
        m.specialAbility();

        firebat f = new firebat();
        System.out.println( "화염방사병의 체력" + f.hp );
        f.atteck();
        f.move();
        f.specialAbility();

        medic me = new medic();
        System.out.println( "의무병의 체력" + me.hp );
        me.atteck();
        me.move();
        me.specialAbility();


    }

}
    abstract class unit {
        public String name;
        public int hp;
        public int attpo;
        public double movsp;
        public int mineral;
        public int gas;

        public unit() {
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

        abstract public void atteck();
        abstract public void move();
        abstract public void specialAbility();

    }

class SCV extends unit {

    final String attmsg = "이 유닛은 융합 절단기로 %d의 피해를 입힙니다\n";
    final String movmsg = "이 유닛은 %2f의 이동 속도를 가지고 있습니다\n";
    final String spabmsg = "이 유닛은 자원채취를 할 수 있으며,\n" +
                           "테란의 건물들을 건설, 수리할 수 있습니다\n";

    public SCV() {
        name = "SCV";
        hp = 60;
        attpo = 5;
        movsp = 2.34;
        mineral = 50;
        gas = 0;
    }

//    public SCV(String name, int hp, int attpo, double movsp, int mineral, int gas) {
//        super(name, hp, attpo, movsp, mineral, gas);
//    }


    @Override
    public void atteck() {
        // sout(이 유닛은 융합 절단기로...")
        // 추상메서드를 이용해서 부모클래스에 정의된
        // attack 메서드를 유닛에 맞게 재정의함
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
}
    class marine extends unit {

        final String attmsg = "이 유닛은 가우스 소총으로 %d의 피해를 입힙니다\n";
        final String movmsg = "이 유닛은 %.2f의 이동속도를 가지고 있습니다\n";
        final String spabmsg = "이 유닛은 전투자극제 연구가 완료되었을때,\n" +
                "전투자극제를 사용할 수 있고, 전투자극제 사용시 생명력을 10 소모하여\n" +
                "이동속도가 2.813으로 증가, 공격주기가 9로 감소합니다\n";
                // ↖위에 메세지에서 %를 표현하고 싶으면 %%로 표현가능

        public marine() {
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
    }

    class firebat extends unit {

        final String attmsg = "이 유닛은 화염방사로 %d의 피해를 입힙니다\n";
        final String movmsg = "이 유닛은 %.2f의 이동속도를 가지고 있습니다\n";
        final String spabmsg = "이 유닛은 전투자극제 연구가 완료되었을때,\n" +
                "전투자극제를 사용할 수 있고, 전투자극제 사용시 생명력을 10 소모하여\n" +
                "이동속도가 2.813으로 증가, 공격주기가 9로 감소합니다\n";


        public firebat() {
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
    }

    class medic extends unit{

        final String attmsg = "이 유닛은 공격할 수 없습니다\n";
        final String movmsg = "이 유닛은 %.2f의 이동속도를 가지고 있습니다\n";
        final String spabmsg = "이 유닛은 다른 유닛을 치료할 수 있고,\n" +
                "회복 연구 완료시, 한 유닛의 해로운 상태이상을 풀어주는 회복을 사용할 수 있습니다\n" +
                "광학조명탄 연구 완료시, 적의 시야를 마비시키는 광학 조명탄을 사용할 수 있습니다\n";



        public medic() {
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
    }



