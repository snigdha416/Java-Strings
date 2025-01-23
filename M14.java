package app1;
import java.util.*;
public class M14 {

	public static void main(String[] args) {
		String s1 = "hello";
		System.out.println("initial: "+ s1);
		StringBuffer sb = new StringBuffer(s1);
		String s2 = sb.reverse().toString();
		System.out.println("final:" + s2);
	}
}
