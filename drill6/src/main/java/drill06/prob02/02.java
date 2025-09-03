package drill06.prob02;

import java.util.Scanner;
/**
문제02.  알파벳 n개 출력
문제 설명: 정수 n을 입력받아 A~Z 중 앞에서 n개 출력
입력
정수[1 - ]: 5
​
출력
A B C D E
*/
public class Sol {

	public static void main(String[] args) {
		import java.util.Scanner;

		public class AlphabetN {
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.print("정수[1 - ]: ");
		        int n = sc.nextInt();

		        if (n > 26) {
		            n = 26;
		        }
		        for (int i = 0; i < n; i++) {
		            char ch = (char)('A' + i);
		            System.out.print(ch + " ");
		        }
		        a.close();
		    }
		}
	}
}