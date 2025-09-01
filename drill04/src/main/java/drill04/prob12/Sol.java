package drill04.prob12;

import java.util.Scanner;

/**
 * 
 * 문제 12. 소수(Prime Number) 판별
 * 
 * 사용자로부터 정수 하나를 입력받아, 그 수가 소수(prime number)인지 여부를 출력하는 프로그램을 작성하세요.
 * 
 * - 소수란, 1과 자기 자신으로만 나누어 떨어지는 수를 의미합니다. - 예: 2, 3, 5, 7, 11, 13, 17, ...
 * 
 */

public class Sol {

	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("정수를 입력하세요: ");
	        int num = sc.nextInt();

	        if (isPrime(num)) {
	            System.out.println(num + "는 소수입니다.");
	        } else {
	            System.out.println(num + "는 소수가 아닙니다.");
	        }

	        sc.close();
	    }

	public static boolean isPrime(int n) {
	        if (n <= 1) return false;  
	        for (int i = 2; i <= Math.sqrt(n); i++) {  
	            if (n % i == 0) return false; 
	        }
	        return true; 
	    }
}
