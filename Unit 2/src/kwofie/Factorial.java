package kwofie;
import java.util.Scanner;

public class Factorial {
	/**Factorial.Java
	 * This program finds the factorial of a number. 
	 * @author Mensimah Kwofie
	 * Friday, April 4,2017
	 */ 
	static Scanner sc = new Scanner(System.in); 
	public static void main(String[] args){
	System.out.println("Enter a number.");
	int a = factorial(sc.nextInt());
	System.out.println(a);

	}
public static int factorial(int x){
	int product =x;
	while (x>1){
		product = product * (x-1);
		x--;
	}
	return product; 
}
}

