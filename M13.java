package app1;
import java.util.*;
public class M13 {

	public static void main(String[] args) {
		String s1 = "hello";
		System.out.println("initial:" + s1);
		String s2 = "";
		for(int i = s1.length()-1; i >= 0; i--) {
			s2 += s1.charAt(i);
		}
		s1 = s2;
		System.out.println("final:" + s1);
	}
}
