package randomExercises;

public class Nth01 {

	public static void main(String[] args) {
		int i, c;
		double d, f;

		i = 4;
		c = 0;
		f = 4.3;
		d = 1;
		if (i != c) {
			c++;
			System.out.println(" hey"+c);

			if ((f + d) != (c += 2)) {
				System.out.println(c);
			}
		}
		System.out.println(c+1);
	}
}