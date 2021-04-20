package kty.basic.day16;

import java.sql.Connection;
import java.sql.DriverManager;

public class HelloJDBC {
    public static void main(String[] args) {
        // JDBC
        // java database connectivity
        // 자바 프로그래밍 언어를 통해 다양한 관계형 데이터 베이스에 접속하고,
        // SQL 문을 실행하고 관리하고자 할때 사용하는 표준 SQL 인터페이스
        // 이것을 통해 데이터 베이스 코드를 한번만 작성해두면 어떤 DBMS 라도
        // 코드 변경없이 동일 하게 작동할 수 있음

        // JDK에 포함된 JDBC 인터페이스는 java.sql 패키지 아래에 있음

        // 하지만, 이것만으로는 작동하지 않고 각 데이터 베이스 제조사가
        // JDBC 인터페이스를 구현해서 작성한 클래스가 필요한데, 이것을 JDBC 드라이버 매니저라 함
        // JDBC 드라이버 매니저는 데이터 베이스 제조사 홈페이지에서 내려받을 수 있음

        // 아마존 데이터베이스 접속 확인




        // 1. JDCB 드라이버를 메모리에 초기화함
        try {
            Class.forName(drv);
        } catch(ClassNotFoundException ex) {
            System.out.println("드라이버를 확인 하세요!!");
        }

        // 2. 데이터베이스 서버 접속
        try (
                Connection conn = DriverManager.getConnection(url, usr, pwd);
        ) {
            if (conn != null)
                System.out.println("데이터베이스 연결 성공!!!");

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        // 3. vmware에 구축된 오라클 서버 접속 테스트


        try {
            Class.forName(oradrv);
        } catch(ClassNotFoundException ex) {
            System.out.println("드라이버를 확인 하세요!!");
        }
        // 이럴수가... pwd는 다 동일해서 위에 orapwd가 필요없었다...
        try (
                Connection conn = DriverManager.getConnection(oraurl, orausr, orapwd);
        ) {
            if (conn != null)
                System.out.println("데이터베이스 연결 성공!!!");

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        // 4. vmware에 구축된 postgresql 서버 접속 테스트


        try {
            Class.forName(posdrv);
        } catch(ClassNotFoundException ex) {
            System.out.println("드라이버를 확인 하세요!!");
        }

        try (
                Connection conn = DriverManager.getConnection(posurl, posusr, pospwd);
        ) {
            if (conn != null)
                System.out.println("데이터베이스 연결 성공!!!");

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }// main

} // clsJDBC
