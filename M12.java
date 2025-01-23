package app1;
import java.lang.classfile.attribute.CharacterRangeTableAttribute;
import java.util.*;
public class M12 {
	public static void main(String[] args) {
		String s1 = "hello world";
		System.out.println("initial:" + s1);
		s1 = reverse(s1);
		System.out.println("final:" + s1);
	}
	static String reverse(String str) {
		if(str.length() == 1) {
			return str;
		}
		return str.charAt(str.length()-1) + reverse(str.substring(0, str.length()-1));
	}

}
