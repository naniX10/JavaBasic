package KTY.basic.day05;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {

		// 윤년 여부를 출력하는 프로그램
		// 지구의 공전주기와 자전주기의 불일치로 발생
		// 공전주기 : 365.24일
		// 자전주기 : 0.24일
		// 이 둘의 오차때문에 4년마다 하루를 추가하는 방법으로
		// 오류를 보정함

		// 조건 : 4로 나누어 떨어지지만 100으로는 나누어 떨어지지 않음
		// 단, 400으로 나눠 떨어짐
		// 1600(윤년), 2020(윤년), 1900(평년)

		Scanner sc = new Scanner(System.in);
		int year;
		String result;

		System.out.println("현재 연도는? : ");

		year = sc.nextInt();

		// if (year % 4 == 0) {
		// if (year % 100 != 0) {
		// System.out.println("윤년입니다!");

		// } else
		// System.out.println("윤년이 아닙니다");
		// } else
		// System.out.println("윤년이 아닙니다");

		if (year % 4 == 0 && year % 100 != 0 || (year % 400 == 0))
			// &&-> and의 역할! , || -> or의 역할!!!!!!!
			result = "윤년입니다!";
		else
			result = "윤년이 아닙니다";

		System.out.println(result);

	}

}