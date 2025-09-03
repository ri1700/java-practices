package drill05.prob02;

import java.util.Scanner;
/**
문제 2. 짝수만 출력
설명: 정수 6개를 입력받아 배열에 저장된 값 중 짝수만 출력하시오.

입력
7 2 9 4 6 1

출력
짝수: 2 4 6
*/
public class Sol {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);

	        int[] arr = new int[6]; 
	        System.out.println("입력하세요:");

	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = a.nextInt();
	        }

	        System.out.print("짝수: ");
	        for (int num : arr) {
	            if (num % 2 == 0) {
	                System.out.print(num + " ");
	            }
	        }

	        a.close();
	}
}