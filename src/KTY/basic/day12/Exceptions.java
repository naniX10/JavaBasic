package kty.basic.day12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) throws IOException {
        // 예외exception와 오류error
        // 자바 프로그램 작성시 문법에 맞지않게 코드를 작성하면 컴파일 오류가 발생함
        // 또한, 코드가 제대로 작성되었다 해도 실행중에
        // 예상치 못한 상황으로 인해 오류가 발생할 수 있음

        // 이처럼 프로그램 실행 중에 예상치 못한 상황으로
        // 프로그램의 실행에 영향을 주는 것을 예외와 오류로 구분할 수 있음

        // 오류는 시스템 단계에서 심각한 문제를 야기해서
        // 실행중인 프로그램을 강제로 종료시킴
        // 예) 네트워크 서버 중단, 메모리/자원 고갈
        // 이러한 오류는 개발자가 코드로 처리 불가

        // 예외는 오류와 마찬가지로 실행중인 프로그램을 강제종료시키지만,
        // 발생할 수 있는 상황을 미리 예측해서 코드로 예방할 수 있음
        // 예) 파일경로 잘못 지정, 데이터값 잘못 입력

        // 개발자는 예외처리를 통해 예외상황을 처리할 수 있도록
        // 예외처리 코드를 작성할 수 있어야 함

        // 예외처리 전 (1)
        System.out.println("프로그램 시작 1");

        System.out.println("프로그램 끝 1");

        System.out.println(" ");

        // 예외처리 전 (2)

        System.out.println("프로그램 시작 2");

        int a = 10, b = 254;
        int c = a + b;
        System.out.println(c);

        System.out.println("프로그램 끝 2");

        System.out.println(" ");

        // 예외처리 전 (3)
       // System.out.println("프로그램 시작 3");

      //  int d = 10, e = 0;
       // int f = d / e; // <- 오류발생!
        // 오류발생으로 인해 이후 문장은 실행되지 않음

       // System.out.println(f);

       // System.out.println("프로그램 끝 3");

        // 예외처리 구문
        // 자바에서는 예외를 처리하기위해
        // try - catch - finally 구문을 사용함
        // try {
        //      예외가 발생할만한 코드들
        // } catch (예측한 예외 상황1) {
        //      예외 발생시 실행할 코드
        // } catch (예측한 예외 상황2) {
        //      예외 발생시 실행할 코드
        // }

        // 예외처리 1
        System.out.println("프로그램 시작 4");

        try {
            int g = 10, i = 0;                            //실행
            int j = g / i;          // <- 오류발생!         예외 발생 코드 이후에 있는 코드는 실행X
            System.out.println(j);  // 이 코드는 실행 안됨!   <<< 건너뜀
        } catch (Exception ex) {                          //실행
            // 예외상황을 명확하게 지정하지 않음
            ex.printStackTrace();
        } // catch

            System.out.println("프로그램 끝 4");

        // ex) 1~9 사이 정수만 입력받아 화면에 출력하는 프로그램 작성
        //     정수가 아닌 다른 문자 입력시 "잘못 입력하셨읍니다" 라고 출력함
        //     예외처리를 이용해서 코드를 작성합니다

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("1부터 9사이의 숫자를 입력해주세요");

            int num = sc.nextInt();                 // 예외 유발 코드

            System.out.println("입력한 정수 : " + num);
        } catch (Exception ex) {
            System.out.println("잘못 입력하셨읍니다!!");
            ex.printStackTrace();
        }

        // 예외의 종류
        // checked exception과 unchecked exception

        // 실행예외 unchecked exception
        // 명시적인 예외처리를 강제하지 않음 (!)
        // 예외발생 시점은 실행시 runtime임
        // ArithmeticException
        // ArrayIndexOutOfBoundException
        // InputMismatchException

        // 일반예외 : checked exception
        // 명시적인 예외 처리를 반드시 강제함(!)
        // 예외 발생시점은 컴파일할때 compile time임
        // IOException
        // ClassNotFoundException

        // 임의의 성적데이터(이름, 국어, 영어, 수학)를
        // c:/Java/sungjuk.txt에 저장하는 프로그램 작성
        String sjdata = "혜교 98 45 23";
        String fpath = "c:/Java/sunjuk.txt";

        try {
            FileWriter fw = new FileWriter(fpath);      // 문자단위로 기록? 느림?
            BufferedWriter bw = new BufferedWriter(fw); // 행단위로 기록? 빠름?
            bw.write(sjdata);
            bw.close();     // 작업 끝
            fw.close();     // 작업 끝
        } catch (IOException e) {
            e.printStackTrace();
        }// catch

        // 예외처리 회피/양도/떠넘기기
        // 메서드 선언부에 throws를 사용해서
        // 해당 메서드에서 발생한 예외를 미리 명시하고
        // 메서드를 호출한 상위 메서드에서 이것을 처리할 수 있도록 함
        // 이를 통해서 각 하위 메서드들에서 발생하는 예외들을 한곳에 모아서 처리할 수 있음
        // 또한, 메서드에  tyr -catch문을 사용하지 않아도 된다는 장점이 있음
        // 왠만하면 최상위까진 떠넘기지 말자

        fpath = "c:/abc123/sungjuk.txt";
        FileWriter fw = new FileWriter(fpath);      // 문자단위로 기록? 느림?
        BufferedWriter bw = new BufferedWriter(fw); // 행단위로 기록? 빠름?
        bw.write(sjdata);
        bw.close();     // 작업 끝
        fw.close();

    } // main

} // clsECT





