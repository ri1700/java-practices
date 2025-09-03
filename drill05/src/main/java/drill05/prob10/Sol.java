package drill05.prob10;

import java.util.Arrays;
import java.util.Scanner;
/**
문제 10. 배열 뒤집기
설명: 정수 5개를 입력받아 저장한 배열의 내용을 역순으로 바꾸고 다시 출력하는 프로그램을 작성하시오.
단순히 출력 순서만 바꾸는 것이 아닌, 배열 내부 값들의 위치 자체를 바꿔야 함 (swap 사용)
출력은 Array.toString() 사용
입력
5 3 8 1 2
출력
뒤집힌 배열: 2 1 8 3 5
*/
public class Sol {

	public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        int[] arr = new int[5];
        System.out.println("입력하세요:");

        for (int i = 0; i < 5; i++) {
            arr[i] = a.nextInt();
        }

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println("뒤집힌 배열: " + Arrays.toString(arr));

        a.close();
    }
}