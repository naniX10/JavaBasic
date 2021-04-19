package kty.basic.day15;

import java.io.*;

public class CharStream {
    public static void main(String[] args) {
        // 스트림 stream
        // 데이터를 비트등의 단위로 조각을 내서
        // 일련의 연속성을 갖도록 만든 데이터의 열
        // 이러한 조각들이 하나의 줄기를 이루어 순서대로 물흐르듯 전송되게 함

        // 스트림은 데이터를 쓰고 읽기위한 공통적인 방법을 제공함
        // 자바에서의 스트림 처리방식은
        // 모든 데이터를 바이트로 보는 바이트 단위 스트림과
        // 문자 데이터를 위한 문자단위 스트림이 있음

        // 문자 단위 스트림 - 스트림을 문자로만 처리함
        // 유니코드로 된 문자를 입출력하는 스트림
        // 문자로 표현되지 않는 데이터는 다루지 않음(동영상, 이미지 등등)

        // 문자 스트림을 다루는 클래스 : java.io 패키지에 포함
        // Reader/Writer -> FileReader/FileWriter

        // 문자 기반으로 스트림을 읽거나 씀 : 유니코드 기반(1~3byte)
        // 주로 텍스트 기반 데이터를 처리할때 사용
        // 사람이 읽고 쓸 수 있는 데이터를 대상으로 함

        // 자신의 이름, 키, 몸무게를 파일에 저장하기

        String name = "고길동";
        int weight = 60;
        double height = 175;

        // 파일에 쓰기
        String fpath = "c:/Java/info.txt";      // 저장위치, 파일명

        // fileWriter 객체 초기화
        FileWriter fw = null;
        try {
             fw = new FileWriter(fpath);

            fw.write(name + "\n");        // 파일에 기록
            fw.write(height + "\n");
            fw.write(weight + "\n");

             fw.close();        // 파일쓰기 종료

        } catch (IOException e) {
            System.out.println("파일쓰기 오류!!");
            e.printStackTrace();
        } // catch

        // 파일 읽기 1 : 파일로부터 문자 하나씩 읽어 화면에 출력
        FileReader fr = null;
        try {
            fr = new FileReader(fpath);

            int ch = 0;  // 읽어온 문자를 저장할 변수 선언

            // fr.read() : 지정한 파일객체로부터 문자 하나를 읽어옴
            // ch = fr.read() : 읽어온 문자 하나를 ch 변수에 저장
            // (ch = fr.read()) != -1 : ch 변수에 저장된 문자가 -1 이 아니라면(문자 데이터가 아니면)
            //                        즉, 읽어온 코드가 유효하지 않으면(더 이상 읽어올 문자가 없으면)

            while ( (ch = fr.read()) != -1 ) {
                System.out.print((char)ch);
                // 읽어온 코드값을 문자형태로 변환 int -> char
            }

            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        } // catch

        // 파일읽기 2 : 라인단위로 읽어 화면에 출력
        // BufferedReader 클래스를 활용해 입력속도를 높임
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
