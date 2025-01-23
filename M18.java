package app1;
import java.util.*;
public class M18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String");
		String str = sc.nextLine();
		System.out.println(reverse(str));
	}
	static String reverse(String str) {
		return str.charAt(str.length()-1) + ((str.length() == 1) ? "" :reverse(str.substring(0, str.length()-1)));
	}
}
