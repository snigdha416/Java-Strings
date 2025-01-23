// removing wide spaces 

package app1;
import java.util.*;
public class M3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String");
		String s1 = sc.nextLine();
		System.out.println(s1.replace(" ", ""));
	}

}
