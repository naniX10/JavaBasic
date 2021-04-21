package kty.basic.day17;

import java.sql.*;
import java.util.ResourceBundle;
import java.util.Scanner;

public class JDBCMember {
    public static void main(String[] args) throws SQLException {
        // 네이버 회원 가입 기능을 JDBC 로 구현
        // 테이블 명 : NMember(playground)
        // 테이블 컬럼 구성 : userid(varchar) passwd(varchar), name(varchar)
        //                 birth(date) gender email(varchar) hp(int)
        // 자동 입력 컬럼 : 회원번호mbno(int)PK?, 가입일regdate(date)

        //MariaJDBC jdbc = new MariaJDBC();
//        String ppath = "kty.basic.jdbc.jdbc";
//        ResourceBundle rb = ResourceBundle.getBundle(ppath);

        // 회원가입 테이블
        // create table NMember (
        //      mnbo     int         primary key auto_increment,
        //      userid   varchar(18) not null,
        //      passwd   varchar(18) not null,
        //      name     varchar(18) not null,
        //      birth    varchar(18) not null,
        //      gender   int         not null,
        //      email    varchar(50) not null,
        //      hp       varchar(15) not null,
        //      regdate  datetime default current_timestamp
        // );

        // 데이터 삽입 테스트
        // insert into NMember (userid,passwd,name,birth,gender,email,hp)
        // values ('vovovo','bobobo123','보보보','1900-01-01',1,
        // 'vovovo@bobobo.com', '011-011-0111);

        // 데이터 조회 테스트
        // select mbno, userid,name, regdate from NMember order by mbno desc;

        // 데이터 상세조회 테스트
        // select * from NMember where mbno = 1;

        // 데이터 수정 테스트
        // update Nmember set name = "보보보보 보보보", birth = "1950-01-01", hp = "011-123-1234"
        // where mbno = 1;

        // 데이터 삭제 테스트
        // delete from NMember where mbno = 1;

//        String NMember = " create table NMember ( userid varchar(20), " +
//                " passwd varchar(20), name varchar(20), birth date, " +
//                " email varchar(50), hp int, regdate curdate() )";
//        try (
//                Connection conn = jdbc.openConn();
//                Statement stmt = conn.createStatement();
//        ) {
//            boolean isOk = stmt.execute(NMember);
//             지정한 sql을 실행하고 결과를 받아옴
//             단, insert, update, delete 실행시 사용!
//
//            if (isOk) System.out.println("테이블 생성!");
//
//        } catch (Exception ex){
//            System.out.println("이미 존재함!");
//        } // catch

        // 회원정보 입력
        Scanner sc = new Scanner(System.in);

        System.out.println("회원정보를 입력하세요");
        System.out.println("입력순서는 아이디 비밀번호 이름 생년월일 성별 이메일 핸드폰입니다");
        String uid = sc.next();
        String pwd = sc.next();
        String name = sc.next();
        String birth = sc.next();
        String gender = sc.next();
        String eml = sc.next();
        String hp = sc.next();

        // JDBC를 이용해서 NMember 테이블에 회원정보 저장하기
        String sql = "insert into NMember (userid,passwd,name,birth,gender,email,hp)" +
         " values (?,?,?,?,?,?,?)";

        MariaJDBC jdbc = new MariaJDBC();

        try (
             Connection conn = jdbc.openConn();
             PreparedStatement pstmt = conn.prepareStatement(sql);
        ) {
            pstmt.setString(1,uid);
            pstmt.setString(2,pwd);
            pstmt.setString(3,name);
            pstmt.setString(4,birth);
            pstmt.setString(5,gender);
            pstmt.setString(6,eml);
            pstmt.setString(7,hp);

            int cnt = pstmt.executeUpdate();
            if (cnt > 0) System.out.println("회원가입 성공!!");

        } catch (Exception ex) {
            ex.printStackTrace();
        } // catch

        // 회원가입 완료 후 지금까지 가입한 모든 회원조회
        // 조회대상 컬럼 : 회원번호 아이디 이름 가입일

        String sql2 = " select mbno, userid, name, regdate from NMember " +
                      " order by mbno desc ";

        try (
            Connection conn = jdbc.openConn();
            PreparedStatement pstmt = conn.prepareStatement(sql2);
            ResultSet rs = pstmt.executeQuery();


        ) {
            String fmt = "%s, %s, %s, %s \n";
            StringBuffer sb = new StringBuffer();
            while (rs.next()) {

                String result = String.format(fmt,
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4).substring(0,10));
                sb.append(result);

            }

            System.out.println(sb.toString());

        } catch (Exception ex) {
            ex.printStackTrace();
        } // catch





//        System.out.println("아이디를 입력해주세요");
//        String userid = sc.next();
//        System.out.println("비밀번호를 입력해주세요");
//        String passwd = sc.next();
//        System.out.println("이름을 입력해주세요");
//        String name = sc.next();
//        System.out.println("생년월일을 입력해주세요");
//        String birth = sc.next();
//        System.out.println("이메일를 입력해주세요");
//        String email = sc.next();
//        System.out.println("휴대전화번호를 입력해주세요");
//        int hp = Integer.parseInt(sc.next());

//        String sql = String.format(NMember, userid, passwd, name, birth, email, hp);


//        try (
//             Connection conn = jdbc.openConn();
//             Statement stmt = conn.createStatement();
//        ) {
//            boolean isOk = stmt.execute(sql);
//            if (isOk) System.out.println("회원가입 성공!!");
//
//        }catch (Exception ex) {
//            ex.printStackTrace();
//            System.out.println("회원가입 실패!");
//        }



    } // main

} // clsJM
