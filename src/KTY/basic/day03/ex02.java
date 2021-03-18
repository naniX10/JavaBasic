package KTY.basic.day03;

public class ex02 {
	public static void main(String[] args) {
		// 7.

		System.out.println(3 + 4.5 * 2 + 27 / 8);
		// 예상 > 15.375 실제 > 15

		System.out.println(true || false && 3 < 4 || !(5 == 7));
		// 예상 > true 실제 > true

		System.out.println(true || (3 < 5 && 6 >= 2));
		// 예상 > true 실제 > true

		// System.out.println("!true > 'A'");
		// 잘못된 비교 대상으로 오류

		System.out.println(7 % 4 + 3 - 2 / 6 * 'Z');
		// 단일 문자를 수식에 사용하면
		// 자동으로 숫자형으로 바뀜
		// 숫자형으로 변환시 ASCII 코드값을 참조함 Z => 90 / 큰 따옴표는 안됨!!!!!!!
		// 0 : 48, A : 65, a : 97, Z : 90, D : 68, M : 77

		System.out.println('D' + 1 + 'M' % 2 / 3);
		// 예상 ? 실제 > 69 (웨?)

		System.out.println(5.0 / 3 + 3 / 3);
		// 예상 > 2.66666... 실제 > 2.6666666666667

		System.out.println((4 < 6) || true && false || false && (2 > 3));
		// 예상 > true 실제 > true

		System.out.println(7 - (3 + 8 * 6 + 3) - (2 + 5 * 2));
		// 예상 -59 실제 > -59

		// 8.
		System.out.println("May 13, 1988 fell on day number");

		System.out.println(
				((13 + (13 * 3 - 1) / 5 + 2021 % 100 + 2021 % 100 / 4 + 2021 / 400 - 2 * (2021 / 100)) % 7 + 7) % 7);
		// 특정연도 -1의 12월 31일의 요일 출력
		// 0 : 일, 1 : 월 ... 6 : 토
		// 따라서, 특정연도의 1월 1일의 요일을 출력하려면
		// 계산식 결과에 +1을 해주면 됨

		System.out.print(" Check out this line   ");

		System.out.println(" //hello there" + '9' + 7);

		System.out.print('H' + 'I' + "is" + 1 + "more example");
		// H와 I 사이 산술연산자로 인해
		// H : 72, I : 73 로 변환되어 + 연산이 수행됨

		System.out.print('H' + 6.5 + 'I' + "is" + 1 + "more example");
		// 위에꺼랑 같음

		// System.out.print("print both of us", "me too");
		// printf 로 수정하면 되는듯? 수정하면 앞에 것만 나옴

		System.out.print("Reverse" + 'I' + 'T');
		// 요번거는 앞의 오는게 문자이기 때문에 숫자로 변환되지 않고 문자 그대로 나옴

		System.out.print("NO! Here is" + 1 + "more example");

		// System.out.println("Here is"+ 10 + 10); // that's 100;
		// 이거다음에 세미콜론? 쓰고 닫는 괄호 써서 안 되는 듯

		System.out.println("Not x is" + true); // that is true.

		// System.out.print(); // println 쓰면 되는거 같은데 웨?
		// 출력할 대상이 지정되지 않았으므로 오류발생!

		// System.out.println; // 괄호없이 이것만 쓰면 안 되는 듯?

		// System.out.print("How about this one" ++ '?' + 'huh?');
		// ++ 하나로 줄이고 뒤에 'huh?'는 "huh?" 로 바꾸면 될 듯
		// 문자열에 사용할 수 없는 증감연산자(++, --,...)를 사용했음

		// 9.

		System.out.println(true && false && true || true);

		System.out.println(true || true && true && false);

	}
}
