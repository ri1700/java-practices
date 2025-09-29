package drill07.prob03;

import java.util.Scanner;
/**
문제03. 홀수합과 짝수합
문제 설명:  숫자를 입력 받아서 아래와 같은 실행결과가 나타나도록 하세요.
입력 받은 숫자가 홀수인 경우에는, 0 부터 입력 값까지 홀수의 합을 출력합니다.
ex) 입력이 7 이면 16을 출력 ( 1 + 3 + 5 + 7 = 16 )
입력 받은 숫자가 짝수인 경우에는, 0 부터 입력 값까지 짝수의 합을 출력합니다.
ex) 입력이 10 이면 30을 출력 ( 2 + 4 + 6 + 8 + 10 = 30 )
입력
정수[1 - ]: 7
​
출력
결과값: 16
*/
public class Sol03 {
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("정수[1 - ]: ");
	        int n = sc.nextInt();

	        int sum = 0;

	        if (n % 2 == 1) {
	            for (int i = 1; i <= n; i += 2) {
	                sum += i;
	            }
	        } else {
	            for (int i = 2; i <= n; i += 2) {
	                sum += i;
	            }
	        }

	        System.out.println("결과값: " + sum);

	        sc.close();
	    }
}