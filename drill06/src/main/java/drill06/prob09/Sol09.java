package drill06.prob09;
/**
문제09. 공백을 하이픈으로 바꾸고 개수 세기
문제 설명: 문자 배열(char[])의 공백을 모두 -로 바꾸어 출력하고 바뀐 공백의 개수를 함께 출력하세요.
출력 예시
변환: Java-is-fun-to-learn
바뀐 공백 수: 4
**/
public class Sol09 {
	public class ReplaceSpace {
	    public static void main(String[] args) {
	       
	        char[] chars = "Java is fun to learn".toCharArray();

	        int count = 0; 

	        for (int i = 0; i < chars.length; i++) {
	            if (chars[i] == ' ') {
	                chars[i] = '-'; 
	                count++;
	            }
	        }
	        String result = new String(chars);

	        System.out.println("변환: " + result);
	        System.out.println("바뀐 공백 수: " + count);
	    }
	}
}