package kty.basic.day15;

import kty.basic.sungjuk.SungJukVO;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class SerializeSungjuk {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 이름, 국어, 영어, 수학을 키보드로 입력받아 sungjuk.bin에 저장하는 코드 작성
        // 단, 입력받은 값은 SungjukVO에 저장하고 직렬화해서 저장함
        // 입력 데이터 : 혜교 97 98 95
        // 역 직렬화 후 결과 : 혜교, 97, 98, 95, 290, 96.7

        String name = "";
        int kor = 0;
        int eng = 0;
        int mat = 0;


        Scanner sc = new Scanner(System.in);

        System.out.println("이름을 입력하세요");
        name = sc.next();
        System.out.println("국어 성적은?");
        kor = sc.nextInt();
        System.out.println("영어 성적은?");
        eng = sc.nextInt();
        System.out.println("수학 성적은?");
        mat = sc.nextInt();

        // 입력받은 데이터를 SungjukVO에 저장
        SungJukVO sj = new SungJukVO(name,kor,eng,mat);

        // 직렬화

        String fpath = "C:/Java/sungjuk.bin";
        FileOutputStream fos = new FileOutputStream(fpath);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);

        oos.writeObject(sj);           // 이렇게 하는게 간편한 듯??

        oos.close();
        bos.close();
        fos.close();


//        ArrayList data = new ArrayList<>();
//        data.add(name);
//        data.add(kor);
//        data.add(eng);
//        data.add(mat);
//
//        oos.writeObject(data);

//        oos.close();
//        bos.close();
//        fos.close();                 <--- 이거 번거로움

        // 역직렬화

        FileInputStream fis = new FileInputStream(fpath);
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);

        SungJukVO sjvo = (SungJukVO) ois.readObject();

        ois.close();
        bis.close();
        fis.close();

        int tot = sjvo.getKor() + sjvo.getEng() + sjvo.getMat();
        double avg = (double) tot / 3;

//        ArrayList data2 = (ArrayList) ois.readObject();
//        name = (String) data2.get(0);
//        kor = (int) data2.get(1);
//        eng = (int) data2.get(2);
//        mat = (int) data2.get(3);

        String fmt = "%s, %d, %d, %d, %d, %.1f \n";
//        System.out.printf(fmt, name, kor, eng, mat,
//                kor+eng+mat, (double)(kor + eng + mat) / 3);

        System.out.printf(fmt, sjvo.getName(), sjvo.getKor(), sjvo.getEng(),
                sjvo.getMat(), tot, avg);


//        ois.close();
//        bis.close();
//        fis.close();


    }  // main

} // class
