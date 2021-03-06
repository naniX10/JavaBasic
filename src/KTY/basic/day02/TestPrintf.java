package KTY.basic.day02;

public class TestPrintf {
	public static void main(String[] args) {
		int x = 5;
		double pi = 3.14;

		// 4개의 출력문을 이용해서 메세지 출력
		System.out.print("x = ");
		System.out.print(x);

		System.out.print(" and pi = ");
		System.out.println(pi);

		// + 연산자를 이용해서 2개의 출력문을 사용
		System.out.print("x = " + x);
		System.out.println(" and pi = " + pi);

		// printf 메서드를 사용해서 1개의 출력문을 사용
		// 형식지정자 : 특정 문자열 내에 출력할 대상과 모양을 지정하는데
		// 사용되는 특수한 문자
		// %d : decimal, 정수를 표기할때 사용
		// %f : float, 실수를 표기할때 사용
		// %c : character, 문자 하나를 표기할때 사용
		// %s : string, 문자 여러개를 표기할때 사용

		System.out.printf("x = %d and pi = %f \n", x, pi);
		// ↖출력하고 싶은게 위에거

		// printf 를 이용하는 또 다른 방법
		String fmt = "x = %d and pi = %f \n";
		System.out.printf(fmt, x, pi);

		// %d > 정수, %f > 실수, %c > 문자 하나, %s > 문자 여러개?

	}
}
