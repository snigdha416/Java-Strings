package app1;
import java.util.*;
public class RotateArrayInClockwise {
	public static void main(String[] args) {
		int[][] arr = {
				{2, 5, 6, 8},
				{5, 2, 7, 4},
				{7, 9, 4, 2},
				{5, 2, 6, 9}
		    };
		int n = arr[0].length;
		rotateArray(arr, n);
		for(int[] nums : arr) {
			System.out.println(Arrays.toString(nums));
		}
	}
	public static void rotateArray(int[][] arr, int n) {
		for(int i = 0; i < n-1; i++) {
			for(int j = i+1; j < n; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n/2; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[i][n-1-j];
				arr[i][n-1-j] = temp;
			}
		}
	}
}
