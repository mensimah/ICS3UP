package kwofie;
import java.util.Scanner;

public class PythagoreanTriple {
	/**PythagoreanTheorem.Java
	 * This program finds theorms.
	 * @author Mensimah Kwofie
	 * Thursday, April 27,2017
	 */ 
	static Scanner sc = new Scanner(System.in); 
	public static void main(String[] args){


			System.out.println("Here are the Pythagorean Triples");

			for (int numberA = 1; numberA < 100; numberA ++) {
				for (int numberB = 1; numberB < 100; numberB ++) {

					int numberC = (int) (Math.pow(numberA, 2) + Math.pow(numberB, 2));
					int rootC = (int) Math.sqrt(numberC);

					if (perfectSquare(numberC)) {
						if (Math.pow(numberA, 2) + (Math.pow(numberB, 2)) == (Math.pow(rootC, 2))) 
							System.out.println(numberA + " " + numberB + " " + rootC);
					}

				}
			}
		}


		
		public static boolean perfectSquare (int n) {
			int x = (int) Math.sqrt(n);
			double check = Math.pow(x,2);

			if (check == n) 
				return true;

			return false;

		
	

	}

}
