package app1;
import java.util.*;
public class M23 {
	public static void main(String[] args) {
		int[] arr = {2, 4, 3, 5, 6, 8, 9};
		System.out.println("Initial:" +Arrays.toString(arr));
		System.out.println("final: "+ Arrays.toString(reverse(arr)));
	}
	public static int[] reverse(int[] arr) {
		for(int i = 0; i < arr.length/2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
			
		}
		return arr;
	}
}
