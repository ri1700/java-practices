package chapter04.string;

import java.util.ArrayList;

public class StringBuilderExample02 {

	public static void main(String[] args) {
		String s2 = "";
		
		for(int i = 0; i < 1000000; i++) {
			// s2 += "h";
			// s2 = s2 + "h";
			// s2 = new StringBuilder(s2).append("h").toString();
		}

		StringBuffer sb = new StringBuffer("");
		for(int i = 0; i < 1000000; i++) {
			sb.append("h");
		}
		s2 = sb.toString();


		System.out.println(s2.length());
	}

}
