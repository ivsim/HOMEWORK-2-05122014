package homework_exercises;

/*
 * Направете програма която принтира числата от 1 до 20 на 5 реда и 4 колони,
 * както е показано на картинката:
 */

public class Exec2 {

	public static void main(String[] args) {
		
		int counter = 1;
		
		for (int i = 1; i <= 5; i++)
			
		{
			
			for (int j = 1; j <= 4; j++)
			{
				System.out.printf("%2d ", counter++);
				
			}
			
			System.out.println();
		}
		

	}

}
