package drill06.prob05;

import java.util.Scanner;
/**
문제05. 입력한 수의 각 자리수 합
문제 설명: 정수 하나를 입력받아 각 자리 숫자의 합을 구하시오.
(예: 123 → 1 + 2 + 3 = 6)
입력
정수[1 - ]: 753
​
출력
자리수 합: 15
**/
public class Sol{
	public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.print("정수[1 - ]: ");
        int num = a.nextInt();

        int sum = 0;
        int temp = num;

        while (temp > 0) {
            sum += temp % 10;  
            temp /= 10;        
        }

        System.out.println("자리수 합: " + sum);

        a.close();
    }
}