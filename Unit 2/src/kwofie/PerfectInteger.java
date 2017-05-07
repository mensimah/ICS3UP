package kwofie;
import java.util.Scanner;

public class PerfectInteger {
	/**PerfectInteger.Java
	 * This program scans numbers to find the perfect integer.
	 * @author Mensimah Kwofie
	 * Thursday, April 27,2017
	 */ 
	static Scanner sc = new Scanner(System.in); 
	public static void main(String[] args, Scanner Scanner){
		

		
		Scanner = new Scanner(System.in);
			System.out.println("Enter in how many numbers you want. (to find the perfect numbers)?");
			int numbers = sc.nextInt();

			if (numbers <= 0) {
				System.out.println("Please enter a number more than 0");
			}
			else {
				System.out.println("Here are the perfect numbers between 1 and " + numbers);

				for (int counter = 1; counter <= numbers; counter++) {
					if (isPerfect(counter)){           
						System.out.println(counter);
					} 
				}    
			}
	}
	
	
	public static boolean isPerfect (int x) {
		
		int sum = 0;

		for (int j = 1; j < x; j++) {

			
			if (x%j == 0) {
				sum = sum + j; 
			}
		} 
		if (sum == x) {
				return true;
			}
			return false;
	}

	}


