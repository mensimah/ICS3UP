package kwofie;
import java.util.Scanner;
	
public class SumDigits {
	/**SumDigits.Java
	 * This program finds the sum of all the digits inputed.
	 * @author Mensimah Kwofie
	 * Friday, April 4,2017
	 */ 
	static Scanner sc = new Scanner(System.in); 
	public static void main(String[] args) {
		System.out.println("Enter one number");
		int a = sc.nextInt();
		System.out.println("The sum of digits is " + sumOfDigits(a));
		
	}
	public static int sumOfDigits(int a){
		int sum = 0;
		while (a > 0)
		{
			sum = sum + (a % 10);
			a = a/10;
		}
		return sum;

		
	
	
	}
}
