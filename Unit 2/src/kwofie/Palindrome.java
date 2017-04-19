package kwofie;

import java.util.Scanner;

public class Palindrome {
	/**Palindrome.Java
	 * This program scans through words to check whether or not the word is a palindrome.
	 * @author Mensimah Kwofie
	 * Tuesday, April 18,2017
	 */ 
	static Scanner sc = new Scanner(System.in); 
	public static void main(String[] args){
		
		String inputWord;
		System.out.println("Input a word to check if it is a palindrome.");
		inputWord = sc.nextLine();
		int length = inputWord.length();
		 int counter, beginning, middle, end; 
		 
		 beginning = 0;
		 end = length - 1;
		 middle = (beginning + end)/2;
		 
		 for (counter = beginning; counter<= middle; counter ++){
			 if (inputWord.charAt(beginning) ==  inputWord.charAt(end)){
				 beginning ++;
				 end --;
			 }
			 else{
				 break;
			 }
				 }
		 if (counter == middle + 1){
			 System.out.println("This word is a palindrome.");
		 }
		 else{
			 System.out.println("This word is not a palindrome.");
		 }
		 
		 
	
		
		
		
		
				

		
		
	}

}
