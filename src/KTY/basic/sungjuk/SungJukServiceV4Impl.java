package kty.basic.sungjuk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SungJukServiceV4Impl implements SungJukServiceV4 {



    // 싱글톤 패턴 시작
    private static SungJukServiceV4 sjsrv = null;
    private static SungJukV4DAO sjdao = null;

    private SungJukServiceV4Impl() {
        sjdao = new SungJukV4DAOImpl();
    }

    public static SungJukServiceV4 getInstance(){
        if (sjsrv == null) sjsrv = new SungJukServiceV4Impl();
        return sjsrv;
    } // 싱글톤 패턴 끝





    @Override
    public void displayMenu() {
        String displaymenu =
                        "======================= \n" +
                        "   성적 프로그램 v8     \n" +
                        "======================= \n" +
                        " 1. 성적데이터 입력 	 \n" +
                        " 2. 성적데이터 조회 	 \n" +
                        " 3. 성적데이터 상세조회 \n" +
                        " 4. 성적데이터 수정 	 \n" +
                        " 5. 성적데이터 삭제 	 \n" +
                        " 0. 프로그램 종료 	 \n" +
                        "======================= \n" +
                        " 작업을 선택하세요 :";

        System.out.print(displaymenu);

    }

    @Override
    public void newSungJuk() {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("이름은?");
            String name = sc.next();
            System.out.print("국어는?");
            int kor = sc.nextInt();
            System.out.print("영어는?");
            int eng = sc.nextInt();
            System.out.print("수학은?");
            int mat = sc.nextInt();

            // 입력받은 성적데이터를 객체화함
            SungJukVO sj = new SungJukVO(name, kor, eng, mat);
            // 성적데이터 처리
            computeSungJuk(sj);

            //
            int cnt = sjdao.insertSungJuk(sj);
            if (cnt > 0 ) System.out.println("성적데이터 추가 완료!!");

        } catch (Exception ex){
            System.out.println(" ");
            System.out.println("잘못 입력했음!!");
            return; // 오류발생시 실행중단후 main 으로 복귀
        }


    }

    // 저장된 성적 데이터들 중에서
    // 배열 인덱스, 이름, 국어, 영어, 수학만 뽑아서
    // 목록list 형태로 출력

    @Override
    public void showSungJuk() {
        String fmt = "번호: %s, 이름: %s, 국어: %d ,영어: %d ,수학: %d, 등록일: %s \n";
        ArrayList<SungJukVO> sjlist = (ArrayList<SungJukVO>) sjdao.selectSungJuk();

        StringBuffer sb = new StringBuffer();
        for (SungJukVO sj : sjlist) {
            String result = String.format(fmt, sj.getSjno(), sj.getName(),
                    sj.getKor(), sj.getEng(), sj.getMat(), sj.getRegdate());
            sb.append(result);
        }
        System.out.println(sb.toString());

    } // pvSSJ

    @Override
    public void computeSungJuk(SungJukVO sj) {
        sj.setSum(sj.getKor() + sj.getEng() + sj.getMat());
        sj.setAvg((double) sj.getSum() / 3);

        switch ((int) sj.getAvg() / 10) {
            case 10:
            case 9: sj.setGrd('수'); break;
            case 8: sj.setGrd('우'); break;
            case 7: sj.setGrd('미'); break;
            case 6: sj.setGrd('양'); break;
            default: sj.setGrd('가'); break;
        }
    }

    @Override
    public void showOneSungJuk() {
        String fmt = "번호 : %s, 이름 : %s, 국어 :%d ,영어 :%d ,수학 :%d \n"
                + "총점 : %d, 평균 : %.1f, 학점 : %c, 등록일 : %s\n";



        Scanner sc = new Scanner(System.in);
        System.out.println("조회할 학생의 번호는?? ");
        int sjno = sc.nextInt();
        SungJukVO sj = sjdao.selectOneSungJuk(sjno);

        String result = String.format(fmt, sj.getSjno(), sj.getName(), sj.getKor(),
                sj.getEng(), sj.getMat(), sj.getSum(), sj.getAvg(), sj.getGrd(),
                sj.getRegdate());
        System.out.println(result);


    } // pvSOSJ

    @Override
    public void modifySungJuk() {

        Scanner sc = new Scanner(System.in);

        try {

        System.out.println("성적을 수정할 학생의 번호는??? ");
        String sjno = sc.next();

        System.out.println("수정할 학생의 이름은??? ");
        String name = sc.next();
        System.out.println("수정할 국어 점수를 입력해주세요!!");
        int kor = Integer.parseInt(sc.next());
        System.out.println("수정할 영어 점수를 입력해주세요!!");
        int eng = Integer.parseInt(sc.next());
        System.out.println("수정할 수학 점수를 입력해주세요!!");
        int mat = Integer.parseInt(sc.next());

//      System.out.println("수정할 성적을 입력해주세요");
//      System.out.println("순서는 (이름, 국어, 영어, 수학입니다!)");
//      String name = sc.next();
//      int kor = Integer.parseInt(sc.next());
//      int eng = Integer.parseInt(sc.next());
//      int mat = Integer.parseInt(sc.next());


        SungJukVO sj = new SungJukVO(name, kor, eng, mat);
        sj.setSjno(sjno);

        computeSungJuk(sj);  // 수정된 정보로 다시 성적처리

        int cnt = sjdao.updateSungJuk(sj);
        if (cnt > 0) System.out.println("성적데이터 수정 완료!!!");

        } catch (Exception ex) {
            System.out.println("잘못 입력하셨어요!!!!!!!!!!");
            return;
        } // catch

    } // pvModi

    @Override
    public void removeSungJuk() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("삭제할 학생번호는?");
            int sjno = Integer.parseInt(sc.next());

            int cnt = sjdao.deleteSungJuk(sjno);
            if (cnt > 0) System.out.println("성적 데이터 삭제 완료!");

        } catch (Exception ex) {
            System.out.println("잘못 입력했어용");
            return;
        }

    } // pvRemo

} // cls
