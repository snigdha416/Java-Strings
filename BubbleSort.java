package app1;
import java.util.*;
public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {23, 67, 4, 9, 6, 48, 92, 87};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		for(int i = 0; i < n-1; i++) {
			boolean flag = false;
			for(int j = 0; j < n-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					swap(arr, j, j+1);
					flag = true;
				}
			}
			if(!flag) {
				break;
			}
		}
	}
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
