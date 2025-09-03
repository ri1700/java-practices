package drill06.prob08;

import java.util.Scanner;
/**
문제08. 화폐 단위별 개수 계산기
문제 설명: 키보드로 부터 돈의 액수인 양의 정수를 입력 받아 50,000원 권, 10,000원 권, 5,000원 권, 1,000원 권, 500원 동전, 100원 동전, 50원 동전, 10원 동전, 1원 동전으로 변환 되는 프로그램을 작성합니다.
화폐 단위 목록 (고액권 → 저액권 순서):
final int[] MONEYS = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
​
가장 큰 단위부터 나눠가며 greedy 방식으로 계산
각 단위별 개수를 출력
입력
입력: 67879
​
출력
50000원 : 1개
10000원 : 1개
5000원 : 1개
1000원 : 2개
500원 : 1개
100원 : 3개
50원 : 1개
10원 : 2개
5원 : 1개
1원 : 4개
**/
public class Sol {
	public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        final int[] MONEYS = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};

        System.out.print("입력: ");
        int amount = a.nextInt();

        for (int unit : MONEYS) {
            int count = amount / unit;   
            amount %= unit;          
            System.out.println(unit + "원 : " + count + "개");
        }

        a.close();
    }
}