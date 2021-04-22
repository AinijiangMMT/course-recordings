package randomExercises;

public class Task_65_1 {

	public static void main(String[] args) {
		int x = 97, y = 96, z = 83;
		calculatingGrade(x);
		calculatingGrade(y);
		calculatingGrade(z);
	}

	public static void calculatingGrade(int grade1) {

		if (grade1 >= 90 && grade1 <= 100) {
			System.out.println("A");
		} else if (grade1 >= 80) {
			System.out.println("B");
		} else if (grade1 >= 70) {
			System.out.println("C");
		} else if (grade1 >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}
}