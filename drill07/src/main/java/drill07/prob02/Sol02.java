package drill07.prob02;

import java.util.Scanner;
/**
문제02. 배열 최대/최소 차이 구하기
문제 설명
10개의 정수를 배열로 입력받아,
가장 큰 값과 가장 작은 값의 차이를 출력하시오.
입력
입력: 3 9 12 7 4 6 8 2 11 5
​
출력
최대-최소 차이: 10
*/
public class Sol02 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);

        int[] arr = new int[10];
        System.out.print("입력: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        int diff = max - min;
        System.out.println("최대-최소 차이: " + diff);

        a.close();
    }
}