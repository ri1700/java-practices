package drill06.prob03;

import java.util.Scanner;
/**
문제03.   1~100 중 5의 배수 개수 세기
문제 설명: 1~100까지 중 5의 배수 개수 출력
출력:
5의 배수 개수: 20
**/
public class Sol {
	
	public static void main(String[] args) {
        int count = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                count++;
            }
        }
        System.out.println("5의 배수 개수: " + count);
    }
}