package KTY.basic.day01;

/**
 * 
 * 연습문제 실습
 *
 */
public class Ex01 {
	public static void main(String[] args) {

		// 1.

		System.out.println("*   *    **    ****    ****    *   *      /////  ");
		System.out.println("*   *   *  *   *   *   *   *   *   *     | o o | ");
		System.out.println("*****  *    *  ****    ****     * *     (|  ^  |)");
		System.out.println("*   *  ******  *   *   *   *     *       | [_] | ");
		System.out.println("*   *  *    *  *    *  *    *    *        -----  ");
		System.out.println("                                                 ");
		System.out.println("            +---+                         ");
		System.out.println("            I   I                         ");
		System.out.println("        +---+---+                         ");
		System.out.println("        I   I   I                         ");
		System.out.println("    +---+---+---+   /\\_/\\    -----      ");
		System.out.println("    I   I   I   I  ( ' ' )   / Hello \\   ");
		System.out.println("+---+---+---+---+  (  -  )  <  Junior I   ");
		System.out.println("I   I   I   I   I   I I I    \\ Coder!/   ");
		System.out.println("+---+---+---+---+  (__I__)     -----      ");

		// 3.
		int rate1; // 성공!
		// int 1stPlayer // 숫자가 맨앞은 안됨
		// int myprogram.java // 점 들어가면 안됨
		// int long // long이라는 명령어?가 있어서 안됨
		int TimeLimit; // 성공! 변수명은 소문자로 시작!
		int numberOfWindow; // 성공!

		// 4.
		// 표현식 : expression
		// 계산이나 처리를 위해 작성하는 식을 의미
		// 수학에서의 수식과 유사
		// 표현식의 중요한 특징은 평가evaluate임
		// 즉, 코드의 결과를 알아내는 과정을 의미

		int x, y, z, s0, v, t, g;
		int result;

		x = 20;
		y = 8;
		z = 2;
		s0 = 2;
		v = 4;
		g = 8;
		t = 10;

		result = 3 * x; // 3x
		System.out.println("3x = ");
		System.out.println(result);

		result = (3 * x) + y; // 가독성 좋다
		System.out.println("(3 * x) + y =");
		System.out.println(result);

		System.out.println("(x + y) / 7 ="); // 실무에선 이거로 많이 씀
		System.out.println((x + y) / 7);

		result = (3 * x + y) / (z + 2);
		System.out.println("(3 * x + y) / (z + 2) = ");
		System.out.println(result);

		result = s0 + v * t + (1 / 2) * g * t ^ 2;
		System.out.println("s0 + v * t + (1/2) * g * t ^ 2 = ");
		System.out.println(result);

		System.out.println(3 * x);
		System.out.println((3 * x) + y);
		System.out.println((x + y) / 7);
		System.out.println(((3 * x) + y) / z + 2);
		System.out.println(s0 + v * t + (1 / 2) * g * t ^ 2);

		// 5.
		// 형변환? 자동으로 바뀜?

		double number = ((1.0 / 3.0) * 3.0);
		System.out.println(" (1 / 3 ) * 3 = " + number);

		// 예상답 > 1 실제답 > 0
		// 왜 0? 정수끼리 계산하면 정수로 나옴!!
		// 그래서 소숫점 아래는 다 버려서 답은 0이 나와버림 ;;

		int quotient = 7 / 3;
		System.out.println(" 7 / 3 = " + quotient);

		// 예상답 > 2.33 실제답 > 2
		// 위에꺼처럼 정수끼리 계산이라 소숫점 아래는 버림

		int remainder = 7 % 3;
		System.out.println(" 7 % 3 = " + remainder);

		result = 11;
		result /= 2;
		System.out.println(" result /= 2 = " + result);

		// 예상답 > 5.5 실제답 > 5
		// 위랑 같음
		// 복합대입 연산자?
		// 산술연산자와 대입연산자를 합쳐놓은 연산자
		// ex) a = a + 1 (복합대입 연산자 사용시) -> a += 1

		// 6.

		double xx = 2.5;
		double yy = 1.5;
		int m = 18;
		int n = 4;

		double result2 = xx + n * yy - (xx + n) * yy;
		System.out.println("xx + n * yy - (xx + n) * yy = " + result2);

		result2 = m / n + m % n;
		System.out.println("m / n + m % n = " + result2);

		result2 = 5 * xx - n / 5;
		System.out.println("5 * xx - n / 5 = " + result2);

		result2 = 1 - (1 - (1 - (1 - (1 - n))));
		System.out.println("1 - (1 - (1 - (1 - (1 - n)))) = " + result2);

		
	}
}
