package kty.basic.day17;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCCRUD3 {
    public static void main(String[] args) {
        // ex) playground 데이터베이스의 books 테이블에 저장된 데이터중에서
        // 출판사가 oracle인 도서의 제목을 python 으로 변경

        String sql = "update books set bookname = 'python' where publish = 'oracle' ";

        MariaJDBC jdbc = new MariaJDBC();

        try (
                Connection conn = jdbc.openConn();
                PreparedStatement pstmt = conn.prepareStatement(sql);

        ) {

           int cnt = pstmt.executeUpdate();     //
           if (cnt > 0) System.out.println("데이터 수정 완료!!!!!!!!");

        } catch (Exception ex) {
            ex.printStackTrace();
        } // catch


        // ex) playground 데이터베이스의 books 테이블에 저장된 데이터중에서
        // 이름이 python인 도서를 삭제하세요

        sql = " delete from books where bookname = 'python' ";

        try (
                Connection conn = jdbc.openConn();
                PreparedStatement pstmt = conn.prepareStatement(sql);
        ) {
            int cnt = pstmt.executeUpdate();
            if (cnt > 0) System.out.println("데이터 삭제 완료!!");

        } catch (Exception ex) {
            ex.printStackTrace();
        } // catch

    } // main

} // clsJC3
