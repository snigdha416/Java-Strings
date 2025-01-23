package app1;
import java.util.*;
public class RotateArrayByK {
	public static void main(String[] args) {
		int[] arr = {3, 6, 9, 23, 79, 12, 63};
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a K value");
		int k = sc.nextInt();
		rotate(arr, k);
		System.out.println(Arrays.toString(arr));
	}
	public static void rotate(int[] arr, int k) {
		k = k % arr.length;
		reverse(arr, 0, arr.length-1);
		reverse(arr, 0, k-1);
		reverse(arr, k, arr.length-1);
	}
	public static void reverse(int[] arr, int start, int end) {
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}
