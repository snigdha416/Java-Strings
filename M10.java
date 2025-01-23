package app1;
import java.util.*;
public class M10 {
	public static void main(String[] args) {
		String s1 = "hello";
		System.out.println("initial:" + s1);
		char[] chars = s1.toCharArray();
		char temp;
		for(int i = 0; i < chars.length/2; i++) {
			temp= chars[i];
			chars[i] = chars[chars.length-1-i];
			chars[chars.length-1-i] = temp;
			
		}
		s1 = new String(chars);
		System.out.println("final:" + s1);
	}

}
