package drill05.prob04;

import java.util.Scanner;
/**
문제 4. 배열 평균 구하기
설명: 정수 4개를 입력받아 저장한 배열 요소의 평균을 구하여 출력하시오.
입력
60 70 80 90
출력
평균: 75.0
*/
public class Sol {

	public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        int[] arr = new int[4];
        int sum = 0;

        System.out.println("입력하세요:");
        for (int i = 0; i < 4; i++) {
            arr[i] = a.nextInt();
            sum += arr[i]; 
        }

        double avg = sum / 4.0;

        System.out.println("평균: " + avg);

        a.close();
    }
}
