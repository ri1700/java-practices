package chapter04.util;

import java.util.Random;

public class DiceSimulator {

	public static void main(String[] args) {
		Random rand = new Random();
		
		for(int i = 0; i < 20; i++) {
			int dice = rand.nextInt(6) + 1; // 1 ~ 6
			System.out.println("주사위 결과 :" + dice);
		}
	}

}
