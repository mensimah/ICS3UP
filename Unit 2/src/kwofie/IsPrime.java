package kwofie;
import java.util.Scanner;

public class IsPrime {
	/**IsPrime.Java
	 * This program finds weather a number is prime or not.
	 * @author Mensimah Kwofie
	 * Friday, April 4,2017
	 */ 
static Scanner sc = new Scanner(System.in); 
	public static void main(String[] args){
		System.out.println("Enter a number.");
		int a = sc.nextInt();
		System.out.println("The number is " + isprime(a));
		
	}

	
	public static boolean isprime(int x){
	for (int counter = 2; counter < x/2; counter++){
		if (isDivisible(x,counter) == true) {
			return false;
			
		}
	}
			return true;
		}
		
	
		public static boolean isDivisible(int y, int z){ 
				if (y%z==0){ 
					return true;
				}
				return false;
			
		}
		{
	} 
	}

