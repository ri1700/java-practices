package drill05.prob07;

import java.util.Arrays;
import java.util.Scanner;
/**
문제 7. 특정 값의 인덱스 찾기
설명: 정수 5개를 입력받아 저장한 배열에서 사용자 입력 값이 몇 번째 인덱스에 있는지 출력하시오.
(없으면 -1 출력)
입력
배열: 4 7 2 9 1
찾을 값: 9
출력
9는 인덱스 3에 있음
*/
public class Sol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] numbers = new int[5];
		
		System.out.print("배열:");
		for(int i = 0; i< 5; i++) {
			numbers[i] = scanner.nextInt();
		}
		
		System.out.print("찾을값:");
		int target = scanner.nextInt();
		
		scanner.close();
		
		System.out.println(Arrays.toString(numbers));
		System.out.println(target);
		
	}
}