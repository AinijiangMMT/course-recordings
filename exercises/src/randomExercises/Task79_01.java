package randomExercises;

public class Task79_01 {

	
		public static void main(String[] args) {
	        String word="CybertekSapple";
	       
	      int count=0;
	        String result="";
	        for(int i=0;i<word.length();i++) {
	            char letter=word.charAt(i);
	            if(letter=='a'||letter=='e' ||letter=='o'||letter=='i' || letter=='u') {
	            	result+=word.charAt(i)+",";
	            	count++;
	            	
	            	
	                //e,e,o,o, how can I erase last comma in output?
	            } 
	            }
	        result=result.last
	        System.out.print(result);
	            }
		}

	


