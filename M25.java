package app1;
import java.util.*;
public class M25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a String");
		String str = sc.nextLine();
		//System.out.println(isPalin(str));
		if(isPalin(str)) {
			System.out.println("is a palindrome");
		}
		else {
			System.out.println("is not a palindrome");
		}
	}
	public static boolean isPalin(String str) {
		for(int i  = 0; i < str.length(); i++) {
			if(str.charAt(i) != str.charAt(str.length()-1-i)) {
			  return false;
			}
		}
		return true;
	}
}
