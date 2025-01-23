package app1;
import java.util.*;
public class M24 {
	public static void main(String[] args) {
		int[] arr = {23, 4, 5, 8, 34, 89, 65, 21};
		System.out.println("Minimum value: " + min(arr));
		System.out.println("Maximum value: "+max(arr));
	}
    public static int min(int[] arr) {
    	int min = Integer.MAX_VALUE;
    	for(int i = 0; i < arr.length; i++) {
    		if(arr[i] < min) {
    			min = arr[i];
    		}
    	}
    	return min;
    }
    public static int max(int[] arr) {
    	int max = Integer.MIN_VALUE;
    	for(int i = 0; i < arr.length; i++) {
    		if(arr[i] > max) {
    			max = arr[i];
    		}
    	}
    	return max;
    }
}
