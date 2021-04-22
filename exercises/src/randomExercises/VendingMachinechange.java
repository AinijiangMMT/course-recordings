package randomExercises;

public class VendingMachinechange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price=55;
        int change =100-price;
        int NumQuarters=change/25;
        int NumDimes=(change%25)/10;
        int NumNickles=(change%25)%10/5;
        
        System.out.println("Your change is "+NumQuarters+" quarters, "+NumDimes+" dimes, and "+NumNickles+" nickles");
		
        
	}

}
