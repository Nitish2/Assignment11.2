package Exception;

import java.util.Scanner;

/**
 * Creating an arithmetic exception by dividing a number by zero .
 * 
 * @author Hp
 *
 */
public class Division {

	public static void main(String[] args) {
		int num1, num2, num3;

		Scanner num = new Scanner(System.in);
		System.out.println("Input first integer:");
		num1 = num.nextInt();
		System.out.println("Input second integer:");
		num2 = num.nextInt();

		num3 = num1 / num2;         // generate exception if the number is divided my zero 
		System.out.println("Answer is = " + num3);

	}

}
