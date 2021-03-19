package KTY.basic.day04;

import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		// 구구단 출력하기
		// ex) 7단을 출력하세요 v1

		System.out.println("7 x 1 = 7");
		System.out.println("7 x 2 = 14");
		System.out.println("7 x 3 = 21");
		System.out.println("7 x 4 = 28");
		System.out.println("7 x 5 = 35");
		System.out.println("7 x 6 = 42");
		System.out.println("7 x 7 = 48");
		System.out.println("7 x 8 = 56");
		System.out.println("7 x 9 = 63");
		System.out.println("----- -----");

		// ex) 7단을 출력하세요 v2
		for (int i = 1; i <= 9; i += 1) {

			System.out.println("7 x " + i + " = " + (7 * i));

		}
		System.out.println("----- -----");

		// ex) 7단을 출력하세요 v3 - while, printf
		String rmt = "7 x %d = %d \n";
		int x = 1;
		while (x <= 9) {
			System.out.printf(rmt, x, 7 * x); // ( 출력할 식, 첫번째 %d 에 들어갈거, 두번째 %d에 들어갈거)
			x += 1; // ++x도 됨!
		}

		System.out.println("----- -----");

		// ex) 3단을 출력하세요 - while, printf
		String lmt = "3 x %d = %2d \n"; // %2 << 2자리 수에 맞게 표시하는 것
		int q = 1;
		while (q <= 9) {
			System.out.printf(lmt, q, 3 * q);
			q += 1; // ++q도 됨!
		}

		System.out.println("----- -----");

		// 구구단 프로그램 v1
		// 사용자로부터 숫자(1 - 9) 를 하나 입력 받아,
		// 구구단을 출력하는 프로그램 작성
		// Scanner, while, printf

		int num;

		Scanner sc = new Scanner(System.in);

		System.out.print("출력할 구구단의 숫자를 입력하세요 : ");
		num = sc.nextInt(); // 여기 앞에 int num = sc.nextInt(); 라고 지정하면 맨 첫줄의 int num 안써도 되는듯?

		String fmt = "%d x %d = %2d \n";

		q = 1;
		while (q <= 9) {

			System.out.printf(fmt, num, q, (num * q));
			q += 1; // ++q도 가능!

		}

		System.out.println("----- -----");

		// 구구단 프로그램 v2
		// 단, 1 - 9 이외의 숫자나 문자를 입력받으면
		// "잘못 입력했음!!!" 라는 메시지를 출력하도록 한다

		System.out.print("출력할 구구단의 숫자를 입력하세요 : ");
		char num2 = sc.next().charAt(0); // 여기 앞에 int num = sc.nextInt(); 라고 지정하면 맨 첫줄의 int num 안써도 되는듯?
		// 입력받은 문자열중 첫번째 글자만 뽑아서
		// char형 변수에 대입

		// 입력받은 문자의 ASCII 코드 값이 49 ~ 57(1~9) 인지 검사

		String result = (num2 >= 49 && num2 <= 57) ? "구구단 출력" : "잘못 입력하셨습니다";

		System.out.println(result);

		// 구구단 프로그램 v2
		// 단, 1 - 9 이외의 숫자나 문자를 입력받으면
		// "잘못 입력했음!!!" 라는 메시지를 출력하도록 한다

		System.out.print("출력할 구구단의 숫자를 입력하세요 : ");
		String num3 = sc.next();

		int i = 1;

		try {
			while (i <= 9) {
				System.out.printf(fmt, num3, i, (Integer.parseInt(num3) * 1));
				i += 1;
			}
		} catch (Exception ex) {
			System.out.println("잘못 입력하셨습니다");
		}
		// 예외 처리 코드(try-catch)를 이용해서
		// 프로그램 실행 중 오류 발생시
		// 제어를 catch 코드 쪽으로 넘김

		// ex) 주민번호를 이용해서 성별을 출력하는 코드를 작성!
		// 주민번호 123456 - 7654321 에서 7이 성별을 나타내는 코드
		// 1 : 1999년 이전에 출생한 남자
		// 2 : 1999년 이전에 출생한 여자
		// 3 : 2000년 이후에 출생한 남자
		// 4 : 2000년 이후에 출생한 여자
		// charAt을 이용해보자
		String jumin = "123456-2654321";

		char gender = jumin.charAt(7);
		result = (gender == '1') ? "1999 이전 남자"
				: (gender == '2') ? "1999 이전 여자" : (gender == '3') ? "2000 이후 남자" : "2000 이후 여자";
		System.out.println(result);

	}
}
