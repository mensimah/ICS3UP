package kwofie;
import java.util.Scanner;

public class Gcf {
	
	/**Gcf.Java
	 * This program finds the gcf between two numbers.
	 * @author Mensimah Kwofie
	 * Friday, April 4,2017
	 */ 
	 
	static Scanner sc = new Scanner(System.in); 
	public static void main(String[] args) {
	System.out.println("Enter one number");
	int a = sc.nextInt();
	System.out.println("Enter another number.");
	int b = sc.nextInt();
	System.out.println("The greatest common factor is " + gcf(a,b)+".");
	
	} 
	public static int gcf (int q, int x) {
		int max = Math.max(q, x);
		int min = Math.min(q, x);
		int counter = min; 
		while (max%counter !=0 || min%counter !=0) {
			counter--;
		}
		return counter;
	}
	
	public static boolean isDivisible (int q, int x){
		if (q%x==0){ 
			return true;
		}
		return false;
	}
	
}
