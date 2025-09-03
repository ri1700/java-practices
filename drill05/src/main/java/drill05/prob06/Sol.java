package drill05.prob06;

import java.util.Scanner;
/**
문제 6. 최솟값 찾기
설명: 정수 5개를 입력받아 저장한 배열에서 가장 작은 값을 출력하시오.
입력
12 6 9 22 5
출력
최솟값: 5
*/
public class Sol {

	public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        int[] arr = new int[5];
        System.out.println("입력하세요:");

        for (int i = 0; i < 5; i++) {
            arr[i] = a.nextInt();
        }

        int min = arr[0];

        for (int i = 1; i < 5; i++) {
            if (arr[i] < min) {
                min = arr[i]; 
            }
        }

        System.out.println("최솟값: " + min);

        a.close();
    }
}