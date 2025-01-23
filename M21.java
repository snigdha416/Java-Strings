package app1;
import java.util.*;
public class M21 {

	public static void main(String[] args) {
		int[] arr = {2, 45, 89, 34, 52, 98};
		System.out.println(maxArr(arr));
	}
	public static int maxArr(int[] arr) {
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
}
