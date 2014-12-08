package homework_exercises;

import java.util.Scanner;

/*
 * Направете програма, която приема от конзолата 2 числа a и b ( б > а) и
 * изкарва на екрана всички числа от а до б които се делят на 3 без остатък
 */

public class Exec3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please, enter integer a, (make sure b > a): ");
		int a = input.nextInt();
		input.nextLine();
		
		System.out.print("Please, enter integer b, (make sure b > a): ");
		int b = input.nextInt();
		input.nextLine();
		
		while (a <= b){
			
			if (a % 3 == 0){
			System.out.print(a + " ");
			}
			
			a++;
		}
		
	}

}
