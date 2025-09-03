package drill06.prob01;

import java.util.Scanner;
/**
문제01.  절댓값 구하기
문제 설명: 정수 하나를 입력받아 절댓값을 출력하시오.
입력
정수: -12
​
출력
절댓값: 12
*/
public class Sol {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.print("정수: ");
        int num = a.nextInt();

        int absValue = Math.abs(num);

        System.out.println("절댓값: " + absValue);

        a.close();
    }
}