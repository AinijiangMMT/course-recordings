package exercises.variables;

import java.util.Scanner;

public class Q_1 {
	public static void main(String[] args) {

		System.out.println("enter first number");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.println("enter next number");
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
			System.out.println("DO YOU WANT ANOTEHR NUMGER   0 FOR NO, 1 FOR YES");
			int num3 = sc.nextInt();

			if (num3 == 0) {
				System.out.println("largest is" + largest);
				System.out.println("smallest is " + smallest);
				break;

			} else {
				System.out.println("enter next number");
				int num4 = sc.nextInt();
				if (num4 <= smallest) {
					smallest = num4;
					continue;

				} else {

					if (num4 > largest) {
						largest = num4;
						continue;
					} else {
						continue;
					}
				}

			}
		} while (true);

	}

}
