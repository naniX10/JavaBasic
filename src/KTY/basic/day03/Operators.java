package KTY.basic.day03;

public class Operators {
	public static void main(String[] args) {
		// 개발자용 폰트
		// 개발자의 취향에 따라 합자(ligahtare)를
		// 지원하는 폰트 사용여부 결정
		// 이것을 사용함에 따라 수학기호를 따로 표시하든지
		// 붙여서 표현하든지 결정할 수 있음
		// 가능 폰트 : d2coding, cascadia
		System.out.println('A' + 'B');
		System.out.println('B' + 'C');
		System.out.println(100 + 'M');
		System.out.println('A' + 'Z');
		System.out.println('A' + 'Z');

		System.out.println("    ");

		System.out.println('H' + 'I');

		System.out.println("    ");
		// 연산자 operator
		// 여러종류의 연산을 수행하기 위해 제공되는 기호
		// 산술연산, 비교연산, 논리연산, 조건연산자(삼항연산자)

		// 산술연산 : 사칙연산을 다루는 연산자
		// +, -, *, /, %
		int x = 30, y = 15; // 변수선언과 값 초기화를 같이 수행!

		System.out.println("+ 연산 " + x + y);
		System.out.println(x + y + "+연산");
		// 문자 + 숫자 + 숫자 하면 순서때문에 앞에서부터 계산되서 문자로 변환됨
		// 숫자 계산하려면 괄호 하기!
		System.out.println("    ");

		System.out.println("30 + 15 연산 " + (x + y));
		System.out.println("30 - 15 연산 " + (x + y));
		System.out.println("30 x 15 연산 " + (x * y));
		System.out.println("30 ÷ 15 연산 " + (x / y));
		System.out.println("30 mod 15 연산 " + (x % y)); // 앞에서 뒤 나누고 나머지를 계산하는 식

		System.out.println("    ");
		// 비교연산 : 값들의 상대적인 크기를 판단
		// 왼쪽 피연산자를 기준삼아 오른쪽 피연산자를 비교
		// 비교연산의 결과는 논리값(참, 거짓) 으로 반환
		System.out.println("30 > 15" + (x > y));
		System.out.println("30 < 15" + (x < y));
		System.out.println("30 >= 15" + (x >= y));
		System.out.println("30 <= 15" + (x <= y));
		System.out.println("30 ≠ 15" + (x != y));
		System.out.println("30 = 15" + (x == y));

		System.out.println("    ");
		// 논리연산 : 주어진 논리식을 판단
		// 논리연산의 결과는 논리값(참, 거짓) 으로 반환
		// 보통 2개 이상의 비교연산으로 구성됨
		// 논리곱연산 : &, && (short-circuit 지원)
		// 논리합연산 : |, || (쉬프트+원표시)
		// 논리부정연산 : !

		// 단축식 평가 short-circuit
		// 여러개의 논리식 중에 어떤 식에 의해 참, 거짓이 확정되면
		// 나머지 논리식을 평가하지 않음

		boolean result = (x > y) & (x != y);
		System.out.println("(x > y) & (x != y)" + result);

		System.out.println("    ");
		// 조건 연산자(삼항연산자)
		// 3개의 피연산자를 이용해서 조건에 따라
		// 특정 피연산자를 취하도록 사용하는 특수한 연산자
		// 형식 : 조건식 ? 참일때 값 : 거짓일때 값

		String result2 = (x > y) ? "x가 큽니다" : "y가 큽니다";
		System.out.println(result2);

		System.out.println("    ");

		// 증감연산자
		// 피연산자의 값을 하나 증가시키거나 감소시킴
		// 피연산자의 어느 쪽에 위치하는가에 따라 연산의 순서가 달라짐
		// i = 1 => i = i + 1 => i += 1 => ++i
		// => i = i + 3 => i += 3

		int a = 7, b = 7;
		int result3 = ++a + 10; // a값을 증가시킨후 연산참여(전치)< 대부분 이거 씀
		int result4 = b++ + 10; // a값을 먼저 연산에 쓰고 값 증가(후치)
		System.out.println("++a + 10 = " + result3);
		System.out.println("b++ + 10 = " + result4);
	}
}
