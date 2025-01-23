package app1;

import java.util.Scanner;

public class M2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String s1 = sc.nextLine();
		System.out.println("all the occurences of a letter from right to left");
		for(int i = s1.lastIndexOf('a'); i != -1; i = s1.lastIndexOf('a', i-1)) {
			System.out.println(i);
		}
		System.out.println("------");
		int j = s1.lastIndexOf('a');
		while(j != -1) {
			System.out.println(j);
			j = s1.lastIndexOf('a', j-1);
		}
	}
}
