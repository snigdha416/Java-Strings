package app1;
import java.util.*;
public class M17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a String");
		String s = sc.nextLine();
		
		System.out.println("enter a 2nd String");
		String s1 = sc.nextLine();
		
//		System.out.println("enter a 3rd String");
//		String s2 = sc.nextLine();
//		
		int i = s.indexOf(s1);
		while(i != -1) {
			System.out.println(s + "@" + i);
			i = s.indexOf(s1, i+1);
		}
	}

}
