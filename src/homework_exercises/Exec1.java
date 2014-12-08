package homework_exercises;

/*
 * Направете програма, която извежда на конзолата всички числа от 1 до 100 които
 * се делят или на 7 или на 11 без остатък.
 * 
 * Решете задачата по 3 различни начина съответно с трите цикли от лекцията
 */

public class Exec1 {

	public static void main(String[] args) {
		
		
		int i = 1;
		
		while (i <= 100 ) {
			if (i % 7 == 0 || i % 11 == 0){
			System.out.print(i + " ");
			}
			i++;
		}
		
		System.out.println();
		
		int m = 1;
		
		do {
			
			if (m % 7 == 0 || m % 11 == 0) {
			System.out.print(m + " ");
			}
			m++;
		}
		
		while (m <= 100);
		
		System.out.println();
		
		for (int n = 1; n <= 100; n++)
		{
			if (n % 7 == 0 || n % 11 == 0) 
				System.out.print(n + " ");
		}

	}

}
