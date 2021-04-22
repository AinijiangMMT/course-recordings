package randomExercises;

public class Hihel {

	public static void main(String[] args) {
convertKM(80);
		convertKM(100);
		System.out.println(convertKM(300));
		
	}	
		public static double convertKM(double mile) {
			
		double  km=mile*3.8;
			
			System.out.println("mile "+mile +"="+km +"km");
			return km;
		}
}
