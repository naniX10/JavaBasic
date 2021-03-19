package KTY.basic.day04;

public class Looop {
	public static void main(String[] args) {
		// while
		// 특정 조건을 만족할때까지 계속해서 주어진 명령을 수행함

		// 초기식
		// while(조건식) {
		// 반복코드
		// 증감식
		// }

		// 조건식이 처음부터 false면
		// while은 코드를 반복실행하지 않음
		// 반면, do-while문은 일단 코드를 먼저 실행하고
		// 조건을 검사하기 때문에
		// 조건식이 false라도 최소 한번정도는 코드를 실행 가능함!!

		// ex) 1 ~ 10 까지 정수 출력
		int i = 1; // 초기식
		while (i <= 10) { // 조건이 참이면 반복 실행
			System.out.println(i + " ");
			i += 1; // 증감식, < = i = i + 1 같음
		}

		// ex) 1 ~ 50 사이의 홀수 출력
		// 위에서 i를 사용해서 그냥 i로 쓰면 오류가 남
		// 그래서 i = 1이라고 다시 지정을 하면 됨
		int i2 = 1;
		while (i2 <= 50) {
			System.out.print(i2 + " ");
			i2 += 2;
		}

		System.out.println("     "); // 대충 줄바꿈용 코드

		// ex) 1 ~ 50 사이의 짝수 출력
		int i3 = 2;
		while (i3 <= 50) {
			System.out.print(i3 + " ");
			i3 += 2;
		}

		System.out.println("     ");

		// ex) 1 ~ 100 까지 총합 구해서 출력
		int sum = 0;
		int i4 = 1;
		while (i4 <= 100) {
			sum += i4;
			i4 += 1; // ++i랑 같은듯?
		}

		System.out.println(sum);

		// 가우스 덧셈공식을 이용하면
		// 특정범위 내의 모든수의 합을 편리하게 구할 수 있음
		// 총합 : sum, 시작 범위 : i , 끝 범위 : j
		// sum = (i + j) * (j / 2) // i = 1 일때
		// sum = (i + j) * (j - i + 1) / 2 // i = n < 이거도 가능한듯?

		i = 1;
		int j = 100;
		sum = (i + j) * j / 2;
		System.out.println(sum);

		// ex) 1 ~ 99 사이 총합 구해서 출력
		// 단, 가우스 덧셈공식을 이용하세요

		i = 1;
		int q = 99;
		sum = (i + q) * q / 2;
		System.out.println(sum);

	}
}
