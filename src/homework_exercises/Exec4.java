package homework_exercises;

/*
 * Направете програма, която принтира на екрана числата от 30 до 1 в обратен ред
 * подредени в 5 реда и 6 колони
 */

public class Exec4 {

	public static void main(String[] args) {
	
		int digits = 30;
		int counter = 1;
		
		do {
			System.out.printf("%2d%s", digits, " "); //System.out.printf("%02d%s", digits, " "); - possible if a front zero is desired...
			digits--;
			counter++;
			
			if(counter == 7){
				System.out.println();
				counter = 1;
			}
			
		}
		while (digits >= 1);
		
		
		
	}

}
