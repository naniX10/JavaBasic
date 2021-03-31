package kty.basic.day11;

import java.text.DecimalFormat;
import java.text.MessageFormat;

public class TextFormat {
    public static void main(String[] args) {
        // MessageFormat
        // 다양한 형식의 데이터를 같은 양식을 출력할때 사용
        // 템플릿 문자열을 쉽게 작성할 수 있도록 해 줌
        // printf 나 String.format보다 세련된 기능 제공

        String name = "혜교";
        int kor = 100;
        int eng = 0;
        int mat = 55;

        String fmt = "이름 : {0}, 국어 : {1}, 영어 : {2}, 수학 : {3}";
        // {} 안의 숫자를 바꿔서 순서도 바꿀 수 있다

        String result = MessageFormat.format(
                fmt, name, kor, eng, mat);
        System.out.println(result);
        // 변수의 바인딩을 임의로 설정 가능

        Object[] sj = {"지현", 0 ,75, 100, 175, 52.3,'미'};
        result = MessageFormat.format(fmt, sj);
        System.out.println(result);
        // 변수를 배열로 정의하면 바인딩을을 수월하게 할수 있음

        System.out.println( "    ");

        // DecimalFormat
        // 정수, 실수를 포함한 다양한 종류의 수를
        // 과학적 표기, 퍼센트 표시, 화폐표시 등으로 출력할때 사용

        double num = 12345.6789;

        DecimalFormat df = new DecimalFormat("0");
        System.out.println(df.format(num));
        // 정수로만 반올림후 출력

        df = new DecimalFormat("0.0");
        System.out.println(df.format(num));
        // 반올림 후 소숫점 첫째자리까지 출력

        df = new DecimalFormat("0.00");
        System.out.println(df.format(num));
        // 반올림 후 소숫점 두번째자리까지 출력

        df = new DecimalFormat("000000");
        // 5자리수라서 5자리 쓰고 남는 자리에 0 집어넣은것
        System.out.println(df.format(num));
        // 전체자리수 6자리로 지정
        // 숫자가 모자랄경우 그 자리에는 0으로 채움

        df = new DecimalFormat("######");
        System.out.println(df.format(num));
        // 전체자리수 6자리로 지정
        // 숫자가 모자랄 경우 그자리에는 공백으로 채움

        num = 123456789;
        df = new DecimalFormat("###,###,###");
        System.out.println(df.format(num));
        // 천단위 마다 , 를 출력함

        num = 0.125;
        df = new DecimalFormat("##.#%"); // ## 만하면 %로 출력시 소숫점아래는 안나옴
        System.out.println(df.format(num));
        // 실수 데이터를 %로 변환


    } // main

} // clsTF
