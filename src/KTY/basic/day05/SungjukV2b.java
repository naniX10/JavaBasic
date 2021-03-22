package KTY.basic.day05;

import java.util.Scanner;

public class SungjukV2b {

	// 성적처리 프로그램 v2
	// 성적 처리시 학점계산을 switch 문으로 작성

	public static void main(String[] args) {

		// 변수 선언
		String name;
		int kor, eng, mat;
		int tot;
		double avg;
		char grd;
		String fmt = "%s, %d, %d, %d \n" + "%d, %.1f, %c \n";
		Scanner sc = new Scanner(System.in);

		// 성적 처리
		int i = 0;
		while (i <= 3) { // 무한 반복하고 싶으면 while문의 조건식을 true로 설정!
			System.out.println("이름은?");
			name = sc.next();

			System.out.println("국어는?");
			kor = sc.nextInt();

			System.out.println("영어는?");
			eng = sc.nextInt();

			System.out.println("수학은?");
			mat = sc.nextInt();

			tot = kor + eng + mat;
			avg = (double) tot / 3;
			grd = '가';

			// 학점계산을 if 문으로 작성하면?
			// if (avg >= 90) grd = '수';
			// else if (avg >= 80) grd = '우';
			// else if (avg >= 70) grd = '미';
			// else if (avg >= 60) grd = '양';

			// 학점계산을 switch문으로 작성하면?
			switch ((int) avg / 10) { // 앞에 int를 써서 double을 int 로 바꿈(계산해도 소숫점 아래 안나옴)
			case 10:
			case 9: // 그 후에 10으로 나눠서 소숫점 아래를 다 버리게 함
				grd = '수';
				break;
			case 8:
				grd = '우';
				break;
			case 7:
				grd = '미';
				break;
			case 6:
				grd = '양';
				break;
			default:
				grd = '가'; // 마지막은 break 안써도 됨

			}

			// 결과 출력
			System.out.printf(fmt, name, kor, eng, mat, tot, avg, grd);

			System.out.println("----- -----");

			// 반복 증감식
			i += 1;

		} // while

	} // main

} // class
