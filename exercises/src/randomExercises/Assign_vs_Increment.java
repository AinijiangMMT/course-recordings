package randomExercises;

public class Assign_vs_Increment {

	public static void main(String[] args) {
		
// i+=3.5  is equal to i=i+3.5;So why are the following happening ?
		
		int i =1;
		System.out.println(i+=3.5);// i==4 since i is int;
		
		//i is int; 3.5 is double;
		// int+double==double. so basically i=i+3.5		
		//                               int=double (not possible)
		//supposed to use explicit casting. 
		
		
	}

}
