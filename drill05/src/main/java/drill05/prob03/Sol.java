package drill05.prob03;

import java.util.Scanner;
/**
문제 3. 역순 출력
설명: 입력받은 정수들을 역순으로 출력하시오.
입력
10 20 30 40
출력
역순: 40 30 20 10
*/
public class Sol {
	public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        int[] arr = new int[4];
        System.out.println("입력하세요:");

        for (int i = 0; i < 4; i++) {
            arr[i] = a.nextInt();
        }

        System.out.print("역순: ");
        for (int i = 3; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        a.close();
    }
 }
