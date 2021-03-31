package kty.basic.day11;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class JavaCalender {
    public static void main(String[] args) {
        // 자바에서 시간, 날짜 다루기
        // JDK 1 에서 제공한 Date 클래스를 이용해서
        // 날짜, 시간에 대한 처리를 할 수 있지만,
        // JDK 1.1에 나온 Calender 클래스를 이용해서
        // 날짜, 시간에 대한 처리를 수행하는 것을 권장함

        // 하지만, 날짜 처리시 윤초를 고려하지 않거나 (정확도 낮음)
        // 월을 표시할 때 1부터 표시하지 않고 0부터 표시하는 문제 존재
        // 따라서, 더 나은 성능의 Joda-Time이라는 라이브러리가
        // JDK 8 에서 추가됨

        Date d = new Date();
        System.out.println(d.toString());

        String fmt = "%d년 %d월 %d일 %d시 %d분 %d초 \n";
        System.out.printf(fmt, d.getYear() + 1900, d.getMonth() + 1,
                d.getDate(), d.getHours(), d.getMinutes(), d.getSeconds());

        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());

        System.out.printf(fmt, c.get(Calendar.YEAR), c.get(Calendar.MONTH)+1,
                c.get(Calendar.DAY_OF_MONTH), c.get(Calendar.HOUR),
                c.get(Calendar.MINUTE), c.get(Calendar.SECOND));

        System.out.println("오늘은" + c.get(Calendar.DAY_OF_WEEK) + "요일 입니다");
        // 일요일 : 1, 월요일 :2 .... 토요일 : 7

        System.out.println("오늘은 2021년 중 " +
                c.get(Calendar.DAY_OF_YEAR) + "일째 날입니다");

        // 오늘기준 5일 후 날짜는? (add메서드 사용)
        c.add( Calendar.DATE,5 );
        System.out.println( c.getTime() );

        // 오늘기준 100일은 언제? (add메서드 사용)
        c = Calendar.getInstance();
        c.add( Calendar.DATE,100 );
        System.out.println( c.getTime() );

        // 오늘기준 11일 전은 언제? (add메서드 사용)
        c = Calendar.getInstance();
        c.add( Calendar.DATE, -11 + 4 );
        System.out.println( c.getTime() );

        // 오늘아내가 아이를 가졌어요, 10개월 후는 언제? (add메서드 사용) 년, 월도 가능!!!!!!!!!
        c = Calendar.getInstance();
        c.add( Calendar.MONTH, 10 );
        System.out.println( c.getTime() );

        // SimpleDateFormat
        // 날짜, 시간 출력을 원하는 형태대로 다양하개 출력
        fmt = "yyyy-MM-dd HH:mm:ss";  // hh는 12시간표기 HH는 24시간 표기
        SimpleDateFormat sdf = new SimpleDateFormat(fmt);
        System.out.println( sdf.format(d) );

        c= Calendar.getInstance();
        System.out.println( sdf.format( c.getTime() ) );

        System.out.println(" ");

        // JDK8에서 추가된 Joda Time 사용하기
        // java.time 패키지
        // 날짜를 표현할때는 LocalDate
        // 시간를 표현할때는 LocalTime
        // 둘다 표현할때는 LocalDateTime
        // 이거 쓰는게 편하다

        LocalTime time = LocalTime.now();
        LocalDate date = LocalDate.now();

        System.out.println(time);
        System.out.println(date);




    } // main

} // clsJVC
