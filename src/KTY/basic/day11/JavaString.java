package kty.basic.day11;


import java.util.Date;

public class JavaString {
    public static void main(String[] args) {
        // String 클래스
        // java.lang 패키지에 포함된 클래스
        // 문자열을 나타내기 위해 c언어에서는 char 배열로 표현하지만
        // 자바에서는 String 이라는 클래스를 사용함
        // String 객체는 한번 생성되면 그값을 읽기만 가능, 수정은 불가
        // -> 불변 객체 immutable object
        // String 객체값 비교시 equals 메서드를 사용해야 함
        // charAt, concat, indexOf, trim, toLowerCase, toUpperCase
        // split, substring, length


        // 자바에서 String 객체는 메모리 재활용 interning함
        // 즉, 생성한 String 객체값을 String Pool 에 저장하는데,
        // 그 다음에 생성한 String 객체의 값이 이전과 유사한 경우
        // String Pool 에 이미 만들어둔 객체를 재활용함

        String str1 = "Hello, World!!";
        // 힙 영역내 상수풀에 생성
        String str2 = new String("Hello, World!!");
        // 힙 영역에 생성
        String str3 = "Hello, World!!";
        // 힙 영역내 상수풀에 생성

        // 문자열 비교시 == 연산자는
        // 값의 동등을 비교하는 것이 아니고 값이 저장된 위치를 비교함 (참조값 비교)

        if (str1 == str2)
            System.out.println("str1과 str2의 저장위치가 같음");

        if (str1 == str3)
            System.out.println("str1과 str3의 저장위치가 같음");

        // 문자열 비교시 eqauls 메서드를 사용하면
        // 변수에 저장된 값을 비교함

        if (str1.equals(str2))
            System.out.println("str1과 str2가 값이 같음");

        if (str1.equals(str3))
            System.out.println("str1과 str3가 값이 같음");


        // charAt : 문자열의 특정위치 index에 있는 문자를 반환
        String jumin = "123456-1234567";
        if (jumin.charAt(7) == '1') // 8번째 문자 추출
            System.out.println("남자입니다");

        // concat : 두 문자열을 하나로 이어 묶음
        // 문자열에 + 연산자를 사용하면 StringBuilde로 전환한 후
        // Append로 문자열을 더하고 toString으로 문자열로 변환
        // 따라서, 2개의 문자열을 합칠때는 concat으로 쓰고
        // 그 이상은 +로 합치는 것이 나을 수 있음

        String a = "Hello";
        String b = "World!!";
        System.out.println( a.concat(b) );

        // indexOf : 특정 문자열이 처음 등장하는 위치를 알아냄
        // 문자열이 존재하지 않을 경우 -1을 반환함
        // 보통, 문자열내에 특정문자가 포함되어 있는지를 알아낼때 사용 (➡방향임)

        String c = "Hello, World!!";
        System.out.println( c.indexOf("World") );

        String d = "abc123.jpg";
        System.out.println( d.indexOf('.') );

        String e = "123412341234";
        System.out.println( e.indexOf("12") );
        System.out.println( e.indexOf("12", 3) ); // 두번째 12찾기
        // 시작위치를 재조정하기 위해 fromIndex 매개변수 사용
        System.out.println( e.indexOf("12",7) );

        System.out.println( e.lastIndexOf("12") );
        // 오른쪽을 기준으로 왼쪽 방향으로(⬅) 특정 문자열의 인덱스를 찾음

        // trim : 문자열 입력시 쓸데없는 공백이 추가되는 경우
        // 그 공백을 제거할때 사용

        String f = "  abc123  ";
        System.out.println("[" + f + "]/" + f.trim() + "]");

        String g = " 987 xyz ";
        System.out.println("[" + g.trim() + "]" );
        // 단, 문자열 가운데 있는 공백은 제거되지 않음
        // 가운데 공백을 제거하려면 replace 메서드를 이용해야

        // length : 문자열의 길이(갯수)를 반환하는 메서드
        // 문자열의 실제 바이트 수를 알아내려면 getByte를 사용해야 함
        System.out.println(a.length());
        System.out.println(c.length());
        System.out.println(e.length());

        String h = "안녕, 자바!";
        System.out.println(h.length());
        System.out.println( h.getBytes().length );
        // UTF-8에서 한글은 3byte로 인식!
        System.out.println( e.getBytes().length );

        // toLowerCase, toUpperCase : 대소문자 변환에 사용
        String i = "abcedf";
        String j = "ABCDEF";

        System.out.println(i.toUpperCase());  // 대문자로 변환
        System.out.println(j.toLowerCase());  // 소문자로 변환

        // split : 특정 문자를 기준으로 문자열을 잘라서 배열에 넣어주는 메서드
        String k = "혜교 78 56 34";
        String[] datas = k.split(" ");
        for(int z = 0; z < datas.length; ++z)
        System.out.print(datas[z]);

        System.out.println(" ");

        // ex) hello, java!! 라는 문자열에서 각 단어의 첫글자를
        // 대문자로 만드는 코드를 작성해보세요

        String l = "hello, java!!";
        String[] words = l.split(" ");
        System.out.println( (words[0].charAt(0) + "").toUpperCase() );
        // char로 넘어와서 ""사용해서 String으로 바꿈?
        System.out.println( (words[1].charAt(0) + "").toUpperCase() );

        // replace : 특정 문자열을 다른 문자열로 바꾸는 메서드
        // replace(기존문자, 바꿀문자)
        System.out.println( h. replace("자바", "파이썬"));

        // 123412341234에서 12를 98로 변경
        System.out.println( e.replace("12","98"));

        String m = "1234-4567-9812"; // -를 :로 변경
        System.out.println(m.replace("-", ":"));

        // ex) hello, java!! 라는 문자열에서 각 단어의 첫글자를
        // 골라서 대문자로 만드는 코드를 작성해보세요 (capitalization)
        String word1 = (words[0].charAt(0) + "").toUpperCase();
        String word2 = (words[1].charAt(0) + "").toUpperCase();

        l = l.replace("h", word1);
        l = l.replace("j", word2);
        System.out.println(l);

        // substring : 문자열의 시작위치부터 끝위치 -1 까지의 문자열을 추출하는 메서드
        // substring(시작)
        // substring(시작, 끝-1)

        // ex) 주민코드에서 생년월일을 추출해봄
        // 123456-1234567
        System.out.println( jumin.substring(0, 6) ); // 0 ~ 5 까지 문자추출

        // ex) 주민코드에서 생년월을을 제외한 나머지를 추출해봄
        System.out.println( jumin.substring(7,14) ); // 14빼도 가능

        // valueOf : 숫자를 문자형으로 변환시 사용하는 메서드
        int height = 1980;
        System.out.println(height + "");
        System.out.println( String.valueOf( height ) ); // <<< 이게 더 낫다?
        System.out.println( Integer.toString( height ) );

        // format : c언어의 printf처럼 서식 문자열을 이용해서
        //          변수들과 문자열을 조합해서 생성하는 메서드
        // System.out.printf 메서드는 생성된 문자열을
        // 화면에 출력하는데 사용하는 메서드임
        Date today = new Date();

        // %tY : year %tm : month %td: day
        // %tH : hour %tM : minute %tS : second
        String fmt = "%tY년 %<tm월 %<td일 %<tH시 %<tM분 %<tS초 \n";
        // '<' 사용시 today 라는 변수 돌려쓰기 가능?
        String result = String.format(fmt, today);
        System.out.println(result);

        // StringBuilder, StringBuffer
        // String 객체는 불변객체이므로
        // 새로운 문자열이 추가되면 기존 공간 대신
        // 새로운 공간을 생성한 후 추가함 -> 메모리 낭비 심함
        // StringBuilder 나 StringBuffer를 이용하면
        // 기존공간에 새로운 문자열을 바로 추가할 수 있으므로
        // 메모리를 절약할 수 있음
        // 따라서, + 를 이용해서 문자열을 결합하는 것보다는
        // StringBuilder를 이용하는 것이 더 나음

        StringBuilder sb = new StringBuilder();
        sb.append("Hello,").append("World").append("!!");
        System.out.println( sb.toString() );






    }// main

} // clsJVS
