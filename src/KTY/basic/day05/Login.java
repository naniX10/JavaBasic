package KTY.basic.day05;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		// 키보드로 아이디, 비밀번호 입력해서
		// 로그인 성공여부를 출력하는 프로그램
		// 아이디 : abcd123
		// 비밀번호 : 987xyz
		// 1. 아이디x, 비밀번호x - 로그인 실패!
		// 2. 아이디o, 비밀번호x - 비밀번호가 틀려요!
		// 3. 아이디x, 비밀번호o - 아이디가 틀려요!
		// 4. 아이디o, 비밀번호o - 로그인 성공!
		// => 입력값에 따른 결과처리가 복잡하므로 단순화시킴
		// 입력처리가 복잡해지면 코드도 복잡하게 짤 수 밖에 없음
		// 즉, 1 2 3 => 로그인 실패 / 4 => 로그인 성공

		// 변수선언
		String id;
		String pw;

		Scanner sc = new Scanner(System.in);
		String result;

		// 아이디/ 비번 입력받아 비교
		System.out.print(" 아이디는?  ");
		id = sc.next();

		System.out.print(" 비밀번호는?  ");
		pw = sc.next();

		// if (id.equals("abcd123")) { // 문자는 == 으로 하면 안됨! .equals 해야!!
		// == 은 위치를 비교? 하는것!
		// if (pw.equals("987xyz")) // 아이디 맞고, 비번도 맞을때
		// result = "로그인 성공!";

		// else // 아이디 맞고, 비번 틀릴때
		// result = "비밀번호가 틀려요!";
		// } // 아이디 if문
		// else {
		// if (pw.equals("987xyz")) // 아이디 틀리고, 비번 맞을때
		// result = "아이디가 틀려요!";

		// else // 아이디 틀리고, 비번도 틀릴때
		// result = "로그인 실패!";
		// }
		// 로그인 성공여부를 4가지 경우에 따라 작성 - 코드 복잡

		// if(id.equals("abcd123")){
		// if(pw.equals("987xyz"))
		// result = "로그인 성공!";
		// else
		// result = "로그인 실패!";
		// } else
		// result = "로그인 실패!" ;

		if (id.equals("abcd123") && pw.equals("987xyz"))
			result = "로그인 성공!";
		else
			result = "로그인 실패!";

		// 결과 출력
		System.out.println(result);

	} // main

} // class
