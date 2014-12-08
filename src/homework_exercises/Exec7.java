package homework_exercises;

import java.util.Scanner;

/*
 * Направете програма която приема 5 числа от конзолата и ги сортира по големина.
 * След сортирането изведете масива на екрана.
 * 
 * Намерете информация за алгоритъма за сортиране "Метод на мехурчето (bubble sort)"
 * и се опитайте да го реализирате на java
 */

/*
 * https://www.youtube.com/watch?v=Cq7SMsQBEUw&list=UU9m2XDfCnrS4QTzVBTrD89w
 * https://www.youtube.com/watch?v=lyZQPjUT5B4
 * http://en.wikipedia.org/wiki/Bubble_sort
 */

public class Exec7 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int[] numArray = new int[5];
		int numTransfer = 0;
		
		
		System.out.println("Please, enter 5 integers.......");
		
		for (int i = 1; i<=5; i++) //to fill in numArray with console entries...
		{
			System.out.print("integer " + i + ": ");
			numArray[i-1] = input.nextInt();
			input.nextLine();			
		}
		

		
		for (int j = 1; j <= 10; j++) //10 is overall number of big iterations:  1+2+3+...+(.length-2)+(.length-1)
		{
		
			for (int n = 1; n < 5; n++) // overall number of the internal bubble iterations for one array round: (.length -1)
			{			
				
				if (numArray[n-1] > numArray[n]) // simple comparison of two adjacent array members
				{
					numTransfer = numArray[n]; //passing an empty variable to serve as placeholder
					numArray[n] = numArray[n-1];
					numArray[n-1] = numTransfer;
				}
				
			}
		
		}
		
		for (int p = 0; p < 5; p++)
		{
			System.out.printf("%d " , numArray[p]);
		}
		
		
		
		
		
		
		
		
	}

}
