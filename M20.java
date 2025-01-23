/*
 * input:  6
 *         3 4 1 5 2 8  
 *         0 1 2 3 4 5  ---> 3 1 2    4 5 8           2      +    5         =====> 7
 *                           even     odd           secLarEven   SecLarOdd  
 * output: 7
 */

package app1;
import java.util.*;
public class M20 {
	public static void main(String[] args) {
		int[] arr = {3, 4, 1, 5, 2, 8};
		System.out.println(smallLargeSum(arr));
	}
    public static int smallLargeSum(int[] arr) {
    	if(arr == null || arr.length <= 3) {
    		return 0;
    	}
    	int fLe = Integer.MIN_VALUE;
    	int sLe = Integer.MIN_VALUE;
    	int fLo = Integer.MIN_VALUE;
    	int sLo = Integer.MIN_VALUE;
    	for(int i = 0; i < arr.length; i++) {
    		if(i % 2 == 0) {
    			if(arr[i] > fLe) {
    				sLe = fLe;
    				fLe = arr[i];
    			}
    			else if(arr[i] > sLe) {
    				sLe = arr[i];
    			}
    		}
    		else {
    			if(arr[i] > fLo) {
    				sLo = fLo;
    				fLo = arr[i]; 
    			}
    			else if(arr[i] > sLo) {
    				sLo = arr[i];
    			}
    		}
    	}
    	if(sLe == Integer.MIN_VALUE || sLo == Integer.MIN_VALUE) {
    		return 0;
    	}
    	return sLe+sLo;
    }
}
