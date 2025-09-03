package drill05.prob05;

import java.util.Scanner;
/**
문제 5. 최댓값 찾기
설명: 정수 5개를 입력받아 저장한 배열에서 가장 큰 값을 출력하시오.
입력
12 6 9 22 5
출력
최댓값: 22
*/
public class Sol {

	public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        int[] arr = new int[5]; 
        System.out.println("입력하세요:");

        for (int i = 0; i < 5; i++) {
            arr[i] = a.nextInt();
        }

        int max = arr[0];

        for (int i = 1; i < 5; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("최댓값: " + max);

        a.close();
    }
}
