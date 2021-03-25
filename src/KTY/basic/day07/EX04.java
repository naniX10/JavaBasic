package KTY.basic.day07;

import java.util.Scanner;

public class EX04 {
    public static void main(String[] args) {

        // 12. 생년월일로 나이 계산하는 프로그램!
        // 현재연도 - 생년년도
        // 생일이 지났으면 그대로 사용
        // 생일이 지나지 않았으면 +1

//        int byear, bmonth, bday; // 생년월일
//        int cyear, cmonth, cday; // 현재년월일
//
//
//        Scanner sc = new Scanner(System.in);
//
//
//        System.out.println("태어난 년도는?");
//        byear = sc.nextInt();
//
//        System.out.println("태어난 날은 몇월?");
//        bmonth = sc.nextInt();
//
//        System.out.println("태어난 때는 몇일?");
//        bday = sc.nextInt();
//
//         현재 년 월 일 설정
//        cyear = 2021;
//        cmonth = 3;
//        cday = 24;

        // 나이 계산
//        int age = cyear - byear;
//        if(cmonth > bmonth && cday > bday) // 생일이 지났는지의 여부
//            age = age - 1;
//        else
//            age = age ;
//
//        String fmt = "현재 : %d년 %d월 %d일 \n" +
//                "생일 : %d년 %d월 %d일 \n" +
//                "나이 : %d세";
//
//        System.out.printf(fmt, cyear, cmonth, cday, byear, bmonth, bday, age);
//
//        System.out.println("           \n ");

        computeage();
        System.out.println(" ");

        // 잔돈 계산하는 프로그램
        // 지불 요구 금액 : 54320 원
        // 지불액 : 100000원
        // 잔돈 : 45680원

//        int price, pay, change ;
//
//        int w50000, w10000, w5000, w1000, w500, w100, w50, w10;
//        String fmt = "요금은 %d, 지불액은 %d일때, 잔돈은 %d입니다 \n" +
//                "50000원권은 %d장, 10000원권은 %d장, \n" +
//                "5000원권은 %d장, 1000원권은 %d장 \n" +
//                "500원은 %d개, 100원은 %d개 \n" +
//                "50원은 %d개, 10원은 %d개 입니다";
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("요금은?");
//        price = sc.nextInt();
//
//        System.out.println("지불액은?");
//        pay = sc.nextInt();
//
//        잔돈 계산
//        change = pay - price;
//
//        w50000 = change / 50000;
//        change = change % 50000;
//
//        w10000 = change / 10000;
//        change = change - (50000 * w50000);
//        change = change % 10000;

//        change = change - (10000 * w10000);
//        w5000 = change / 5000;
//        change = change % 5000;

//        change = change - (5000 * w5000);
//        w1000 = change / 1000;
//        change = change % 1000;

//        change = change - (1000 * w1000);
//        w500 = change / 500;
//        change = change % 500;

//        change = change - (500 * w500);
//        w100 = change / 100;
//        change = change % 100;

//        change = change - (100 * w100);
//        w50 = change / 50;
//        change = change % 50;

//        change = change - (50 * w50);
//        w10 = change / 10;


//        System.out.printf(fmt, price, pay, (pay-price), w50000, w10000,
//                w5000, w1000, w500, w100, w50, w10);

        computechange();
        System.out.println(" ");
    } //main

    public static void computeage(){
        int byear, bmonth, bday; // 생년월일
        int cyear, cmonth, cday; // 현재년월일


        Scanner sc = new Scanner(System.in);


        System.out.println("태어난 년도는?");
        byear = sc.nextInt();

        System.out.println("태어난 날은 몇월?");
        bmonth = sc.nextInt();

        System.out.println("태어난 때는 몇일?");
        bday = sc.nextInt();

        // 현재 년 월 일 설정
        cyear = 2021;
        cmonth = 3;
        cday = 24;

        // 나이 계산
        int age = cyear - byear;
        if(cmonth > bmonth) // 생일이 지났는지의 여부
            age = age;
        else if (cmonth == bmonth && cday >= bday)
            age = age;
        else
            age = age - 1;

        String fmt = "현재 : %d년 %d월 %d일 \n" +
                "생일 : %d년 %d월 %d일 \n" +
                "나이 : %d세";


        System.out.printf(fmt, cyear, cmonth, cday, byear, bmonth, bday, age);

    }

    public static void computechange(){
        int price, pay, change;
        int[] wons = {0, 0, 0, 0, 0, 0, 0, 0}; // 아니면 new int [8]
        int[] notes = {50000, 10000, 5000, 1000, 500, 100, 50, 10};

        String fmt = "요금은 %d, 지불액은 %d일때, 잔돈은 %d입니다 \n" +
                "50000원권은 %d장, 10000원권은 %d장, \n" +
                "5000원권은 %d장, 1000원권은 %d장 \n" +
                "500원은 %d개, 100원은 %d개 \n" +
                "50원은 %d개, 10원은 %d개 입니다";

        Scanner sc = new Scanner(System.in);

        System.out.println("요금은?");
        price = sc.nextInt();

        System.out.println("지불액은?");
        pay = sc.nextInt();

        change = pay - price;
        for (int i =0; i < wons.length; i += 1) {
            wons[i] = change / notes[i];
            change = change % notes[i];
        }


        System.out.printf(fmt, price, pay, (pay-price), wons[0], wons[1],
                wons[2], wons[3], wons[4], wons[5], wons[6], wons[7]);



    }


} //class
