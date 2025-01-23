package app1;
import java.util.*;
public class M26 {
	    static String[] belowTen = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
	    static String[] belowTwenty = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
	    static String[] belowHundred = {"", "Ten", "Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
		public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		   System.out.println("enter a num");
		   int num = sc.nextInt();
		   System.out.println(numToword(num));
		}
		public static String numToword(int num){
		   if(num < 10){
		       return belowTen[num];
		   }
		   if(num < 20){
		       return belowTwenty[num-10];
		   }
		   if(num < 100){
		       return belowHundred[num/10] + " " + belowTen[num%10];
		   }
		   if(num < 1000){
		       return belowTen[num/100] + " Hundred " + numToword(num%100);
		   }
		   if(num < 100000){
		       return numToword(num / 1000) + " Thousand " + numToword(num%1000);
		   }
		   if(num < 10000000){
		       return numToword(num/100000) + " lakh " + numToword(num%100000);
		   }
		   if(num < 1000000000){
		       return numToword(num/1000000000) + " crore " + numToword(num%10000000);
		   }
		   return "";
		
		}
	}
