package KTY.basic.day06;

import java.util.Scanner;

public class EX04 {
    public static void main(String[] args) {
        // 12. 생년월일로 나이 계산하는 프로그램!
        int birth;
        int age = 0;
        String year;
        Scanner sc = new Scanner(System.in);

        System.out.println("본인의 생년월일은?");
        birth = sc.nextInt();


        age = 2021 - birth + 1;

        String fmt = "당신의 출생년도는 %s 이고, 당신의 나이는 %d 입니다";
        System.out.println(fmt);

        System.out.printf(fmt, birth, age);

        System.out.println("           \n ");

        // 16. 잔돈을 뭐로 몇개 줘야 하는가?
//        int money, price;
//        int change = 0;
//        Scanner sk = new Scanner(System.in);
//
//        System.out.println("물건의 가격은?");
//        price = sk.nextInt();
//
//        System.out.println("받은 돈은?");
//        money = sk.nextInt();
//
//        change = money - price;

        //change











    }
}
