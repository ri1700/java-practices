package drill05.prob08;

import java.util.Scanner;
/**
문제 8. 배열 중복 제거
설명: 정수 6개를 입력받아 저장한 배열에서 중복되는 값을 제거하여 출력하시오.
배열만 사용하고 중첩  for문 사용, Set 사용 금지!
입력
1 2 3 2 1 4
출력
중복 제거 후: 1 2 3 4
*/
public class Sol {

	public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        int[] arr = new int[6];          
        int[] unique = new int[6];       
        int count = 0;                   

        System.out.println("입력하세요:");
        for (int i = 0; i < 6; i++) {
            arr[i] = a.nextInt();
        }

        for (int i = 0; i < 6; i++) {
            boolean b = false;

            for (int j = 0; j < count; j++) {
                if (arr[i] == unique[j]) {
                    b = true;
                    break;
                }
            }

            	if (!b) {
                unique[count] = arr[i];
                count++;
            }
        }

        System.out.print("중복 제거 후: ");
        for (int i = 0; i < count; i++) {
            System.out.print(unique[i] + " ");
        }

        a.close();
    }
}