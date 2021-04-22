package exercises.variables;

import java.util.Scanner;

public class ForLoopLabQ_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first number:");
		int num1 = sc.nextInt();
		System.out.println("Enter your next number:");
		int num2 = sc.nextInt();
		int largest, smallest;
		if (num1 >= num2) {
			largest = num1;
			smallest = num2;
		} else {
			largest = num2;
			smallest = num1;
		}
		do {
			System.out.println(" do you want to enter another number:  0 --no, 1--yes");
			int num3 = sc.nextInt();
			if (num3 == 0) {
				System.out.println("largest is " + largest + ",  smallest is " + smallest);
				break;
			} else {
				System.out.println("enter next number");
				int num4 = sc.nextInt();
				if (num4 > largest) {
					largest = num4;
					continue;
				} else {

				}
				if (num4 <= smallest) {
					smallest = num4;
					continue;
				}
			}

		} while (true);

	}

}
