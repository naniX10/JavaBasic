package kty.basic.day15;

import java.io.*;
import java.util.Scanner;

public class CharSungJuk {
    public static void main(String[] args) {
        // 이름, 국어, 영어, 수학을 키보드로 입력받아 sungjuk.dat에 저장하는 코드 작성
        // 단, 파일에 저장하는 문자열 방식은 이렇게
        // 입력 데이터 : 혜교 97 98 95
        // 파일 저장 형식 : 혜교,97,98,95

        //   String name = "";
        //     int kor = 0;
        //     int eng = 0;
        //     int mat = 0;


        // 성적 데이터 입력 받기
        Scanner sc = new Scanner(System.in);
        //System.out.println("이름을 입력하세요");
        //String name = sc.next();
        //System.out.println("국어 성적은?");
        //int kor = sc.nextInt();
        //System.out.println("영어 성적은?");
        //int eng = sc.nextInt();
        //System.out.println("수학 성적은?");
        //int mat = sc.nextInt();

        System.out.println("성적은? ('이름 국어 영어 수학' 순서로)");
        String name = sc.next();
        int kor = sc.nextInt();
        int eng = sc.nextInt();
        int mat = sc.nextInt();

        // 입력받은 성적 데이터를 파일에 저장

        String fpath = "c:/Java/sungjuk.dat";

        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
             fw = new FileWriter(fpath, true);
             // 파일에 데이터 누적 옵션 설정
             bw = new BufferedWriter(fw);

             String fmt = "%s, %d, %d, %d\n";
             String data = String.format(fmt, name, kor, eng, mat);

            // bw.write(name + ", " + kor + ", " + eng + ", " + mat + "\n");

            bw.write(data);

            bw.close();
            fw.close();

        } catch (Exception e) {
            System.out.println("파일 쓰기 오류!!!");
            e.printStackTrace();
        } // catch

        // 저장한 성적데이터를 화면에 출력

        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(fpath);
            br = new BufferedReader(fr);  // buffer 기능이 있는 reader 선언

            while(br.ready()) {
                System.out.println(br.readLine());  // 한줄씩 읽어오고 출력함?
            }

            br.close();   // LIFO 형식으로 객체를 닫음
            fr.close();   //

        } catch (Exception e) {
            e.printStackTrace();

        } // catch

    } // main

} // class

