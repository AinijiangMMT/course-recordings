package randomExercises;

public class Nth2 {

	public static void main(String[] args) {
		int s=0, j=0;
		boolean t=true,r;
		
		r=(t && 0<(s+=1));
		r=(t && 0<(s+=2));
		r=(t || 0<(j+=1));
		r=(t || 0<(j+=2));
		System.out.println( s+" "+j);
	}

}
