package KTY.basic.day06;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // 간단한 계산 프로그램 작성
        // ex) 두 수를 입력받아 더하기를 수행하는 프로그램 작성 1
        int a, b;
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자를 입력하세요");
        a = sc.nextInt();
        System.out.println("또 하나의 숫자를 입력하세요");
        b = sc.nextInt();

        sum = a + b;

        String fmt = "입력된 수는 각각 %d, %d이고 \n" +
                     "두 수의 총합은 %d입니다";

        System.out.printf(fmt, a, b, sum);

        System.out.println("           \n ");

        // ex) 두 수를 입력받아 더하기를 수행하는 프로그램 작성 2
        plus01();



    }
    // 두 수를 입력받아 더하기를 수행하는 메서드
    public static void plus01(){
        int a, b;
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자를 입력하세요");
        a = sc.nextInt();
        System.out.println("또 하나의 숫자를 입력하세요");
        b = sc.nextInt();

        sum = a + b;

        String fmt = "입력된 수는 각각 %d, %d이고 \n" +
                "두 수의 총합은 %d입니다";

        System.out.printf(fmt, a, b, sum);

    }






}
