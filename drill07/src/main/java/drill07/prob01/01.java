package drill07.prob01;

import java.util.Scanner;
/**
문제01.  섭씨 → 화씨 변환표 출력
문제 설명
시작 섭씨, 끝 섭씨, 증가 간격을 입력받아 각 온도에 대한 화씨 변환값을 표 형태로 출력하세요.
화씨 공식: F = C * 9 / 5 + 32
입력
시작 섭씨: 0
끝 섭씨: 20
증가 간격: 5
​
출력
C   F
0   32.0
5   41.0
10  50.0
15  59.0
20  68.0
*/
public class Sol {
    public static void main(String[] args) {
    	Scanner a = new Scanner(System.in);

        System.out.print("시작 섭씨: ");
        int start = a.nextInt();

        System.out.print("끝 섭씨: ");
        int end = a.nextInt();

        System.out.print("증가 간격: ");
        int step = a.nextInt();

        System.out.println("C   F");

        for (int c = start; c <= end; c += step) {
            double f = c * 9.0 / 5.0 + 32; // 화씨 변환
            System.out.println(c + "   " + f);
        }

        a.close();
    }
}