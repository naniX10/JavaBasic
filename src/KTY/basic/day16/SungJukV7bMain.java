package kty.basic.day16;

import kty.basic.sungjuk.SungJukServiceV3;
import kty.basic.sungjuk.SungJukServiceV3Impl;

import java.util.Scanner;

public class SungJukV7bMain {

    // 성적 처리 프로그램 V7b  -  ArrayList + 텍스트 기반 스트림
    // 입력한 성적데이터를 csv직렬화를 통해 텍스트 기반 파일에 저장
    // csv직렬화 : 각 데이터 항목을 , 로 구분해서 파일에 저장하는 방식
    // 따라서, 프로그램 종료시 입력했던 데이터는 그대로 유지됨

    // SungJukServiceV3
    // initSungJuk2, saveSungJuk2 (파일처리/csv직렬화) <- 추가됨

    // (1) newSungJuk, (2) showSungJuk, (3) showOneSungJuk,
    // (4) modifySungJuk, (5) removeSungJuk
    // computeSungJuk, displayMenu

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SungJukServiceV3
                sjsrv = SungJukServiceV3Impl.getInstance();

        String menu = "";
        sjsrv.initSungJuk2();

        while (true) {
            sjsrv.displayMenu();
            menu = sc.next();

            switch (menu) {
                case "1": sjsrv.newSungJuk(); break;
                case "2": sjsrv.showSungJuk(); break;
                case "3": sjsrv.showOneSungJuk(); break;
                case "4": sjsrv.modifySungJuk(); break;
                case "5": sjsrv.removeSungJuk(); break;
                case "0": sjsrv.saveSungJuk2();
                          System.exit(0); break;
                default:
                    System.out.println("잘못 입력했음!!!!");

            } // switch

        } // while

    } // main

} // clsSJV7

