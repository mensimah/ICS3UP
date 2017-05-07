package kwofie;
import java.util.Scanner;

public class Life {
	/**Life.Java
	 * This program determines how many lives stay alive after each generation.
	 * @author Mensimah Kwofie
	 * Thursday, April 27,2017
	 */ 
	
public static void main(String[] args){
		
Scanner scan = new Scanner (System.in);
			String userInput = "yes"; 
			boolean breakLoop = true; 
			char[][] field = new char [20][20];
			boolean [][] change = new boolean [20][20]; 

		
			for(int counter = 0; counter < 20; counter++){
				for(int n = 0; n < 20; n++){
					field[counter][n] = 'o';
					change[counter][n] = false;
				}
			}

			System.out.println("How many cells do you want?");
			int amount = scan.nextInt();

			for (int counter = 1; counter <= amount; counter++) {	

				System.out.println("Enter the chosen row and the column separated by a single space");

				int row = scan.nextInt()-1;
				int column = scan.nextInt()-1;


				while (row > 19 || row < 0 || column > 19 || column < 0) {
					System.out.println("Enter numbers in 20x20 field");
					row = scan.nextInt()-1;
					column = scan.nextInt()-1;	
				}

				field[row][column] = 'x'; 
				change[row][column] = true; 

			}

			
			System.out.println("\nThis is the original");
			for(int counter = 0; counter < 20; counter++){
				for(int n = 0; n < 20; n++){

					System.out.print(field[counter][n] + " ");
				}
				System.out.println();
			}

			int generationNumber = 1; 

			
				while (breakLoop == true && userInput.equalsIgnoreCase("yes")) {
					generationNumber++;
					int neighbour = 0;

					for(int counter = 0; counter <= 19; counter++){
						for(int n = 0; n <= 19; n++){

							neighbour = 0;

							
							if (counter > 0) {
								if (field[counter-1][n] == 'x')
									neighbour++;
							}
							
							if (counter > 0 && n < 19) {
								if (field[counter-1][n+1] == 'x')
									neighbour++;
							}
							
							if (counter > 0 && n > 0) {
								if (field[counter-1][n-1] == 'x')
									neighbour++;
							}
							
							if (n > 0) {
								if (field[counter][n-1] == 'x')
									neighbour++;
							}
							
							if (n < 19) {
								if (field[counter][n+1] == 'x' )
									neighbour++;
							}
							
							if (counter < 19 && n > 0) {
								if (field[counter+1][n-1] == 'x')
									neighbour++;
							}
							
							if (counter < 19) {
								if (field[counter+1][n] == 'x')
									neighbour++;
							}
							
							if (counter < 19 && n < 19) {
								if (field[counter+1][n+1] == 'x')
									neighbour++;
							}

							
							if (field[counter][n] == 'x') {

								if (neighbour == 2 || neighbour == 3)
									change[counter][n] = true;
								else
									change[counter][n] = false;
							}

							else if (field[counter][n] == 'o') {

								if (neighbour == 3) 
									change[counter][n] = true;
								else 
									change[counter][n] = false;
							}
						}
					} 

					System.out.println("\nThis is generation " + generationNumber);

				
					for(int counter = 0; counter < 20; counter++){
						for(int n = 0; n < 20; n++){

							if (change[counter][n] == true) {
								field[counter][n] = 'x'; 
								System.out.print(field[counter][n] + " ");
							}
							else {
								field[counter][n] = 'o';
								System.out.print(field[counter][n] + " ");
							}
						}
						System.out.println();
					}

					if (cellAlive(change)) {
						System.out.println("\nWould you like to create the next generation? (yes/no)");
						userInput = scan.next();
					}
					else if (cellAlive(change) == false){
						System.out.println("\nThey are all dead.");
						breakLoop = false;	
					}
				}

			System.out.println("\nThe program has ended.");
		}

		
		public static boolean cellAlive (boolean [][] alive) {

			for(int i = 0; i < 20; i++){
				for(int n = 0; n < 20; n++){
					if (alive[i][n] == true)
						return true;
				}
			}
			return false;
		}
	}
