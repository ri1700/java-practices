package drill06.prob06;

import java.util.Scanner;
/**
문제06. 입력된 수가 완전수인지 판별
문제 설명: 정수 n을 입력받아 완전수(perfect number)인지 판별하시오.
(자기 자신을 제외한 약수의 합이 자기 자신과 같으면 완전수)
입력
정수[2 - ]: 28
​
출력
28는(은) 완전수입니다.
**/
public class Sol06 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);

		System.out.print("정수[2 - ]: ");
		int n = a.nextInt();

		int sum = 0;

		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}

		if (sum == n) {
			System.out.println(n + "는(은) 완전수 입니다.");
		} else {
			System.out.println(n + "는(은) 완전수가 아닙니다.");
		}

		a.close();
	}
}