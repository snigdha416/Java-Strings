package app1;
import java.util.*;
public class M22 {
	public static void main(String[] args) {
	int[] arr = {2, 54, 44, 78, 98, 13, 62};
	int min = Integer.MAX_VALUE;
	int max = Integer.MIN_VALUE;
	System.out.println("Minimum: "+min(arr, min));
    System.out.println("Maximum: "+max(arr, max));
  }
  public static int min(int[] arr, int min) {
	 	for(int i = 0; i < arr.length; i++) {
		if(arr[i] < min) {
			min = arr[i];
		}
	}
	return min;
  }
  public static int max(int[] arr, int max) {
	  for(int i = 0; i < arr.length; i++) {
		  if(arr[i] > max) {
			  max = arr[i];
		  }
	  }
	  return max;
  }
}
