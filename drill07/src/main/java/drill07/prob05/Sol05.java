package drill07.prob05;
/**
문제05. 369 게임 출력
문제 설명:   1부터 100까지의 숫자를 순차적으로 확인하면서, 숫자에 3, 6, 9 중 하나라도 포함되어 있다면 "짝"을 출력합니다.
3, 6, 9가 한 번 들어있으면: "짝" 출력
두 번 들어있으면: "짝짝" 출력
없으면: 해당 숫자만 출력
출력
1
2
3 짝
4
5
6 짝
7
8
9 짝
10

...

33 짝짝

...

93 짝짝
94
95
96 짝짝
97
98
99 짝짝
100
*/
public class Sol05 {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			String numStr = String.valueOf(i);
			int clapCount = 0;

			for (int j = 0; j < numStr.length(); j++) {
				char ch = numStr.charAt(j);
				if (ch == '3' || ch == '6' || ch == '9') {
					clapCount++;
				}
			}

			if (clapCount == 0) {
				System.out.println(i);
			} else {

				System.out.print(i + " ");
				for (int k = 0; k < clapCount; k++) {
					System.out.print("짝");
				}
				System.out.println();
			}
		}
	}

}