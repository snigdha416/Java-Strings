package app1;
import java.util.*;
public class RotateArrayInAntiClockWise {
	public static void main(String[] args) {
		int[][] arr = {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 4, 6 ,7},
				{4, 7, 9, 3}
		};
		int n = arr[0].length;
		rotate(arr, n);
		for(int[] nums: arr) {
			System.out.println(Arrays.toString(nums));
		}
 	}
	public static void rotate(int[][] arr, int n) {
		
		// transpose of matrix
		for(int i = 0; i < n-1; i++) {
			for(int j = n-2-i; j >= 0; j--) {
				int temp = arr[i][j];
				arr[i][j] = arr[n-1-j][n-1-i];
				arr[n-1-j][n-1-i] = temp;
			}
		}
		
		// reverse each column
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n/2; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[i][n-1-j];
				arr[i][n-1-j] = temp;
			}
		}
	}
}
