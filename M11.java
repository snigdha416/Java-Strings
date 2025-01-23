package app1;
import java.util.*;
public class M11 {
	static String result = " ";
	public static void main(String[] args) {
		
		String s1 = "hello";
		System.out.println("initial:" + s1);
		reverse(s1);
		s1 = result;
		System.out.println("final:" +s1);
	}
    static void reverse(String str) {
    	if(str.length() == 0) {
    		return;
    	}
    	 result += str.charAt(str.length()-1);
    	reverse(str.substring(0, str.length()-1));
    }
}
