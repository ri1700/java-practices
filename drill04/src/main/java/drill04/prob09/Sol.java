package drill04.prob09;

/**
 * 
 * 문제 9. 간단한 FizzBuzz - for 사용
 * 
 * 1부터 15까지 출력하되,
 * - 3의 배수일 경우 `Fizz`,
 * - 5의 배수일 경우 `Buzz`,
 * - 둘 다일 경우 `FizzBuzz`를 출력하세요.
 * 
 * 
 */
public class Sol {

	public static void main(String[] args) {
		for(int i = 1; i <= 15; i++) {
			boolean isFizzBuzz = false;
			
			if(i % 3 == 0) {
				isFizzBuzz = true;
				System.out.print("Fizz");
			}

			if(i % 5 == 0) {
				isFizzBuzz = true;
				System.out.print("Buzz");
			}
			
			if(!isFizzBuzz) {
				System.out.print(i);
			}
			
			System.out.print(" ");
		}
	}

}
