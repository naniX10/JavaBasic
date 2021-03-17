package KTY.basic.day01;

/**
 * 
 * 
 * @author KTY
 * @category javabasic
 * @version 1.0 자바기초프로그램 - 성적처리프로그램
 * 
 *          입력 : 이름, 국어, 영어, 수학 처리 : 총점, 평균, 학점 출력 : 이름, 국어, 영어, 수학, 총점, 평균, 학점
 * 
 */
public class SungJukV1 {
	public static void main(String[] args) {

		// 변수선언
		String name;
		int kor;
		int eng;
		int mat;
		int sum;
		double avg;
		char grd;

		// 처리
		name = "둘리";
		kor = 12;
		eng = 34;
		mat = 56;

		// sum = 12 + 34 + 56;
		sum = kor + eng + mat;

		// avg = (kor + eng + mat) / 3;
		avg = sum / 3;

		grd = '가';

		// 출력
		System.out.print("이름 : ");
		System.out.println(name);
		System.out.print("국어 : ");
		System.out.println(kor);
		System.out.print("영어 : ");
		System.out.println(eng);
		System.out.print("수학 : ");
		System.out.println(mat);
		System.out.print("총점 : ");
		System.out.println(sum);
		System.out.print("평균 : ");
		System.out.println(avg);
		System.out.print("학점 : ");
		System.out.println(grd);

	}
}
