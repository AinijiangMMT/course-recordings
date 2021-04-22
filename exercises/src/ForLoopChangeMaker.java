import java.util.Scanner;
public class ForLoopChangeMaker {

	public static void main(String []args) {
	
       // enter a whole number from 1-99, i will find a combination of coins that 
//equals that amount of change
       //quarter:25 cents //87 cents=3quarters 1 dimes 0 nickels 2 pennies
       //dimes: 10cents'
       //nickels:5 cents
       //pennies:1 cent
        Scanner keyboard=new Scanner(System.in);
        System.out.println("enter a number from 1-99: ");
        int user_amount=keyboard.nextInt();
       int i=0;
       for(i=0;i<=2;i++) {
           if (user_amount>1&&user_amount<100){
               changeMaker(user_amount);
               break;
       }else {

           if(i==2) {
               System.out.println("no more attempt");
               break;
           }else {
           System.out.println("try agin");
           int user_amount1=keyboard.nextInt();

       }


       // if (user_amount>1&&user_amount<100){
       //     changeMaker(user_amount);
       // }else {
       //     System.out.println("invalid data");
       // }

       // do {
           // int user_amount=keyboard.nextInt();
           // if()




        }//while(true);




       }
   }
   public static void changeMaker(int amount) {
        int originalAmount=amount;
        int quarters=amount/25;//87/25=3
        amount=amount%25;//12
        int dimes=amount/10;//12/10=1
        amount=amount%10;//2
        int nickels=amount/5;//2/5=0
        amount=amount%5;
        int pennies=amount;//as pennies=1 cent

        System.out.println(originalAmount+"cents in coins can be given as :");
        System.out.println(quarters+"quarters");
        System.out.println(dimes+"dimes");
        System.out.println(nickels+"nickels");
        System.out.println(pennies+"pennies");



   }
}

	
	

