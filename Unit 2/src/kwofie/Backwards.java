package kwofie;
import java.util.Scanner;

public class Backwards {
	/**Backwards.Java
	 * This program reverse the sentence that the user inputs. 
	 * @author Mensimah Kwofie
	 * Tuesday, April 18,2017
	 */ 
	static Scanner sc = new Scanner(System.in); 
	public static void main(String[] args){
		
		String original, backwards = "";
		System.out.println("Enter a sentence to see the backwards version. ");
		original = sc.nextLine();
		
		int length = original.length();
		
		for (int counter = length - 1; counter >=0; counter --)
		backwards = backwards + original.charAt(counter);
		System.out.println("The backwards version of this sentence is: " + backwards);

	}
}