package KTY.basic.day05;

import java.util.Scanner;

public class CardCheck {
	public static void main(String[] args) {
		// 문자열.charAt(자릿수) : 지정한 자릿수의 문자 하나 추출
		// 문자열.substring(시작, 끝) : 지정한 시작위치에서 끝-1 위치의 문자들 추출
		// 123456-7654321
		// jumin.charat(0) : 1
		// jumin.substring(7, 8) : 1?

		// 신용카드 번호를 보고
		// 어떤종류와 은행인지 알려주는 프로그램
		// 3: JCB카드 4 : 비자카드 5 : 마스터카드

		Scanner sc = new Scanner(System.in);
		String cn;
		String cardtype = "";
		String cardbank = "";
		String fmt = "카드 종류는 %s 이고, %s 입니다";

		System.out.println("카드 번호를 입력해주세요!!!!!");

		cn = sc.next();

		// if (cn.charAt(0) == '3')
		// cardtype = "JCB 카드";
		// else if (cn.charAt(0) == '4')
		// cardtype = "비자 카드";
		// else if (cn.charAt(0) == '5')
		// cardtype = "마스터 카드";

		switch (cn.charAt(0)) {
		case '3':
			cardtype = "JCB 카드";
			break;
		case '4':
			cardtype = "비자 카드";
			break;
		case '5':
			cardtype = "마스터 카드";
			break;
		} // swtch 01

		// System.out.println(cardtype);

		switch (cn) {
		case "356317":
			cardbank = "NH농협카드";
			break;
		case "356901":
			cardbank = "신한카드";
			break;
		case "356912":
			cardbank = "KB국민카드";
			break;
		case "404825":
			cardbank = "비씨카드";
			break;
		case "438676":
			cardbank = "신한카드";
			break;
		case "457973":
			cardbank = "국민은행";
			break;
		case "515594":
			cardbank = "신한카드";
			break;
		case "524353":
			cardbank = "외환카드";
			break;
		case "540926":
			cardbank = "국민은행";
			break;
		} // switch02

		System.out.printf(fmt, cardtype, cardbank);

	} // main

}// class