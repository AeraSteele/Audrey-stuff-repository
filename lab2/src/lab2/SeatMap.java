package lab2;

//Audrey Williams CS2003

import java.io.File;
import java.util.Scanner;

public class SeatMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		File file = new File("names.dat");
		
		String array[][]= new String[5][6];
		
		
	System.out.println("Please choose a row:");
	int row = input.nextInt();
	System.out.println("Now choose a column:");
	int col = input.nextInt();
	
int rows = 0;
int columns = 0;

	while (input.hasNextLine()){
		while (input.hasNextLine()){
			array[rows][columns] = input.next();
			columns++;
		}
		rows++;
	}
	
	System.out.println(rows + columns + "");
	

	}
	

}
