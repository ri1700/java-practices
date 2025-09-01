package chapter01;

public class Ex11OperatorExample {

	public static void main(String[] args) {
		int radius1 = 5;
		int radius2 = 6;
		int radius3 = 7;
		int radius4 = 8;
		int radius5 = 9;
		
		
		System.out.println("반지름: " + radius1);
        System.out.println("원의 넓이: " + calculateCircleArea(radius1));
        
		System.out.println("반지름: " + radius2);
        System.out.println("원의 넓이: " + calculateCircleArea(radius2));

		System.out.println("반지름: " + radius3);
        System.out.println("원의 넓이: " + calculateCircleArea(radius3));

		System.out.println("반지름: " + radius4);
        System.out.println("원의 넓이: " + calculateCircleArea(radius4));

		System.out.println("반지름: " + radius5);
        System.out.println("원의 넓이: " + calculateCircleArea(radius5));
	}
	
	public static double calculateCircleArea(int radius) {
		final double PI = 3.14;
		double area = PI * radius * radius;
		return area;
	}

}
