package randomExercises;
public class Task_65_Asliya{

public static void main(String[] args) {
int x=87,y=56,z=43;

    calculatingGrade(x,y,z);
    
}

public static void calculatingGrade(int grade1, int grade2, int grade3) {
	
    
    if(grade1>=90 && grade1<=100) {
        System.out.println("A");
    }else if(grade1>=80 ) {
        System.out.println("B");
    }else if(grade1>=70) {
        System.out.println("C");
    }else if(grade1>=60 ) {
        System.out.println("D");
    }else {
        System.out.println("F");
    }
    
    if(grade2>=90 && grade2<=100) {
        System.out.println("A");
    }else if(grade2>=80 ) {
        System.out.println("B");
    }else if(grade2>=70 ) {
        System.out.println("C");
    }else if(grade2>=60 ) {
        System.out.println("D");
    }else {
        System.out.println("F");
    }
    
    if(grade3>=90 && grade3<=100) {
        System.out.println("A");
    }else if(grade3>=80 ) {
        System.out.println("B");
    }else if(grade3>=70 ) {
        System.out.println("C");
    }else if(grade3>=60 ) {
        System.out.println("D");
    }else {
        System.out.println("F");
    }
}}