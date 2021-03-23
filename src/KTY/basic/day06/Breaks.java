package KTY.basic.day06;

import java.util.Random;

public class Breaks {
    public static void main(String[] args) {
        // 반복문 제어하기 break, continue
        // break : 반복문 실행을 중단하는 명령

        // ex) 1 ~ 100 까지의 총합을 구하는 프로그램 작성
        // 단, 총합이 500을 넘으면, 실행을 중단함

        int sum = 0;
        int i;
        for( i = 0; i <= 100; i += 1){
            sum = sum + i; // sum += i
            if (sum >= 500) break;
            // 부분합이 500 이상인 경우 반복실행을 중지함
        }        // 변수가 { } 안에서 설정된 경우 저기 안에서 '만' 사용가능

        System.out.println("총합 : " + sum);
        System.out.println("중지 지점 : " + i);

        // ex) 주사위 눈이 6이 나올때까지 굴려보는 프로그램을 작성
        // 또한, 6이 나올때까지의 프로그램이 작동된 횟수도 같이 출력하세요
        // Math.random() 과 break 문을 사용

        int dice = 0;
        int count = 0;

        while(true) {
            dice = (int) (Math.random() * 6) + 1; // 최소값이 0! 그래서 (random * (6 - 0)) + 1(주사위는 1부터 시작하니까!)
            ++ count;
            System.out.print(dice + " ");
            if (dice == 6) break;
        }

        System.out.println("굴린 총 횟수: " + count);


    }
}
