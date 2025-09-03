package drill05.prob09;

import java.util.Arrays;
import java.util.Scanner;
/**
문제 9. 배열 내 값 교환
설명: 정수 5개를 입력받아 저장한 배열에서 첫 번째와 마지막 값을 교환 저장(swap)하고  출력하시오.
출력은 Array.toString() 사용
입력
10 20 30 40 50
출력
교환 후: 50 20 30 40 10
*/
public class Sol {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);

		int[] arr = new int[5]; // 정수 5개 저장
	        System.out.println("입력하세요:");

	        for (int i = 0; i < 5; i++) {
	            arr[i] = a.nextInt();
	        }
	     int temp = arr[0];
	        arr[0] = arr[arr.length - 1];
	        arr[arr.length - 1] = temp;

	        System.out.println("교환 후: " + Arrays.toString(arr));

	        a.close();
	}
}