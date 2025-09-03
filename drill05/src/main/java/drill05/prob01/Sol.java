package drill05.prob01;

import java.util.Scanner;
/**
  문제 1. 배열 요소 모두 출력
	
  설명: 정수 5개를 입력받아 배열에 저장하고, 순서대로 출력하시오.
		
  입력
	10 20 30 40 50
	
  출력
	배열 요소: 10 20 30 40 50 
 */
public class Sol {

	public static void main(String[] args) {
		final int ARRAY_LENGTH = 5;
		
		Scanner a = new Scanner(System.in);

		int[] numbers = new int[ARRAY_LENGTH];
		for(int i = 0; i< ARRAY_LENGTH; i++) {
			numbers[i] = a.nextInt();
		}
		
		System.out.println(numbers.length);
		
		a.close();
	}		
}
