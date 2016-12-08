package DayXQuestion;

import java.io.File; 
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Question0 {

	public static void main() {
		
		//Declare ArrayLists for moves
		ArrayList<String> letterMoves = new ArrayList<String>();
		ArrayList<Integer> numMoves = new ArrayList<Integer>();
		
		initAndRead(letterMoves, numMoves);
		
		//Start new Traveler
		Rambler rambler = new Rambler();
		System.out.println(letterMoves.size());
		System.out.println(numMoves.size());
		for(int i = 0; i < letterMoves.size(); i++) {
			rambler.newDirection(letterMoves.get(i));
			rambler.move(numMoves.get(i));
			
			System.out.println("Move: "+ letterMoves.get(i) + "" + numMoves.get(i));
			System.out.println("Cur Direction: " + rambler.getDirection());
			System.out.println("Current X Position : " + rambler.getX());
			System.out.println("Current Y Position : " + rambler.getY());
			System.out.println("");
		}
		
		System.out.println(rambler.getX());
		System.out.println(rambler.getY());
		System.out.println(rambler.getDirection());
		int ans = Math.abs(rambler.getX()) + Math.abs(rambler.getY());
		System.out.println("Total Moves: " + ans);
		
	}
	
	public static void initAndRead(ArrayList<String> letter, ArrayList<Integer> numbers)
	{
		//File to be read in
		File file = new File("input.txt");
		
		//ArrayList of Moves
		ArrayList<String> moves = new ArrayList<String>();
		
		try {
			Scanner scan = new Scanner(file);
			
			scan.useDelimiter(",|" + System.getProperty("line.seperator"));
						
			while(scan.hasNext()) {
				moves.add(scan.next());
			}
			System.out.println("Total Moves: " + moves.size());
			
		} catch(FileNotFoundException e) {
			System.out.println("file not found: " + file.toString());
		}		
		
		for(String temp : moves) {
			//Temp List
			String[] tempArr = temp.trim().split("[LR]");
			String[] tempArr2 = temp.trim().split("\\d");
			
			//Fill ArrayLists
			letter.add(tempArr2[0]);
			
			//Better way to perform faster operation, than converting to a integer every time?
			numbers.add(Integer.parseInt(tempArr[1]));

		}		
	}
}