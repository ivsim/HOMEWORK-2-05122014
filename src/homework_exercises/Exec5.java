package homework_exercises;

/*
 * Направете програма която принитра на конзолата всички карти от стандартанта
 * колода за игра. Подредете информацията в 13 реда и 4 колони
 */

public class Exec5 {

	public static void main(String[] args) {
		
		String cards[] = {"A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2"};
		
		for (int i = 1; i <= 13 ; i++)
		{
			for (int j = 1; j <= 4; j++)
			{
				System.out.printf("| %2s ", cards[i-1]);
			}
				System.out.print("|"); 
				System.out.println();
		}

		
		
	}

}
