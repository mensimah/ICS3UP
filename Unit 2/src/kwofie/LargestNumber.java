package kwofie;
import java.util.Scanner;
public class LargestNumber {

	/**LargestNumber.Java
	 * This program finds the largest number amongst four numbers.
	 * @author Mensimah Kwofie
	 * Friday, April 4,2017
	 */
	
	static Scanner sc = new Scanner(System.in); 
	public static void main(String[] args){
	System.out.println("Enter 4 numbers");
	int [] num = new int [4];
	for (int counter =0;counter<num.length; counter++){
		num[counter] = sc.nextInt();
	}
	System.out.println("The largest number is " + largestNumber(num));
}
	
	public static int  largestNumber (int [] num){
		int a = num[0];
		for (int counter = 1; counter< num.length; counter++){
			a = Math.max(a, num[counter]);
		}
		return a;
	}
		
	

}
