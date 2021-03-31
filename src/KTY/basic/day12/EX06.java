package kty.basic.day12;

import java.util.Random;
import java.util.Scanner;

public class EX06 {
    public static void main(String[] args) {
//        Q. 14
//        하루는 86400초이다. 입력값이 1234567890일 경우 며칠인지 계산하여라
//        한 시간은 3600초이다. 입력값이 98765일 경우 몇 시간인지 계산하여라
//        일 분은 60초이다. 입력값이 12345일 경우 몇 분인지 계산하여라.

        int d = 86400;
        int id = 1234567890;
        int h = 3600;
        int ih = 98765;
        int m = 60;
        int im = 12345;



        System.out.println(Math.round(id/d) + "일 입니다");
        System.out.println(Math.round((double)id/d) + "일 입니다");
        // double 은 꼭 추가해주자

        System.out.println(Math.round(ih/h) + "시간 입니다");
        System.out.println(Math.round((double)ih/h) + "시간 입니다");

        System.out.println(Math.round(im/m) + "분 입니다");
        System.out.println(Math.round((double)im/m) + "분 입니다");

        System.out.println("  ");

//      Q. 25
//      복권발행 프로그램을 작성하세요.
//      복권 3자리 숫자를 입력받음, 임의의 복권 3자리 숫자 생성
//      모두 일치 - 상금 1백만원, 불일치 - 다음 기회를!
//      위치에 상관없이 숫자만 일치하면 됨

        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int match = 0;

        System.out.println("복권 3자리 숫자를 입력해주세요!");
        int yourkey = sc.nextInt();

        int lottokey = rnd.nextInt(1000); // <<< 이러면 999까지 나옴

//      입력값과 난수 비교
//        char lkey1 = String.valueOf(lottokey).charAt(0);
//        char lkey2 = String.valueOf(lottokey).charAt(1);
//        char lkey3 = String.valueOf(lottokey).charAt(2);
//
//        char ykey1 = String.valueOf(yourkey).charAt(0);
//        char ykey2 = String.valueOf(yourkey).charAt(1);
//        char ykey3 = String.valueOf(yourkey).charAt(2);
//
//
//        if (lkey1 == ykey1 || lkey1 == ykey2 || lkey1 == ykey3) ++match;
//        if (lkey2 == ykey1 || lkey2 == ykey2 || lkey2 == ykey3) ++match;
//        if (lkey3 == ykey1 || lkey3 == ykey2 || lkey3 == ykey3) ++match;

        for(int i = 0 ; i < 3; i += 1) {
            char lkey = String.valueOf(lottokey).charAt(i);

            for (int j = 0; j < 3; ++j) {
                char ykey = String.valueOf(yourkey).charAt(j);
                if (lkey == ykey) ++match;
            } // for2

        } // for1


        System.out.println(yourkey + "/" + lottokey);
        System.out.println("일치개수 : " + match);

        if (match == 3)
            System.out.println("상금 1백만원 당첨!!");
        else
            System.out.println("다음 기회를 노려보세요!");


    } // main

} // clEX06





