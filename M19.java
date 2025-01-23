package app1;
import java.util.*;
public class M19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a String");
		String str = sc.nextLine();
		System.out.println(isPalin(str));
	}
	public static boolean isPalin(String str) {
		boolean flag = true;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != str.charAt(str.length()-1-i)) {
				flag = false;
				break;
			}
		}
		return flag;
	}
}
