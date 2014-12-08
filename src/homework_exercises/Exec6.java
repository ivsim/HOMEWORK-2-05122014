package homework_exercises;

import java.util.Scanner;

/* 
 * Направете програма която приема 5 положителни числа от конзолата и намира най-голямото от тях.
 */

public class Exec6 {

	public static void main(String[] args) {
		
	Scanner input = new Scanner (System.in);
	
	System.out.println("Please, enter below 5 positive integers...");
	
	int tempNum = -1;
	int counter = 1;
	
	while (counter <= 5)
	{
		
		System.out.print("integer " + counter + ": ");
		int number = input.nextInt();
		input.nextLine();
		
		if (tempNum > number)
		{
			tempNum = tempNum;
		}
		else
		{
			tempNum = number;
		}
			
		counter++;
		
	}

	System.out.print("...and the biggest number is: " + tempNum);
		

	}

}
