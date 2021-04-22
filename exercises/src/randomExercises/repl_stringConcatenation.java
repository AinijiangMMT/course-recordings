package randomExercises;
import java.util.Scanner;
public class repl_stringConcatenation {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	    System.out.println("please enter your areaCode");
	    int areaCode=scan.nextInt();
	    System.out.println("please enter your localNumber");
	    int localNumber=scan.nextInt();
	    
	    String phoneNumber;
	    phoneNumber="("+areaCode+")-"+localNumber;
	  System.out.println("Calling  number"+phoneNumber);
		
		
	}

}
