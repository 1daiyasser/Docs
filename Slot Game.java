import java.util.Random;
import java.util.Scanner;

public class Main {
   public static void main(String[] args){
       //JAVA SLOT GAME
Scanner scanner = new Scanner(System.in);
        //DECLARE VARIABLES
      double balance = 100;
      double bet = 0;
      String [] row;
      int payout;


       //DISPLAY WELCOME MESSAGE
       System.out.println("Welcome to Java Slot Game!");
       System.out.print("Please enter your balance: ");

       //PLAY IF BALANCE > 0
       while (balance > 0) {

           System.out.println("Current balance: $" + balance);
           System.out.println("Please enter the amount: ");
           bet = scanner.nextInt();
           ;
 //ENTER BET AMOUNT

           //     VERIFY IF BET > BALANCE

           if (bet < 0) {
               System.out.println("SORRY! Bet must be greater than Balance");
           } else if (bet > balance) {
               System.out.println("INSUFFICIENT FUNDS");
               continue;
           } else {
               //   SUBSTRACT BET FROM BALANCE
               balance = balance - bet;
               System.out.println("$" + balance);
           }
 System.out.println("Spinning...");
           spinRow();


           // SPIN ROW
           // PRINT ROW
           // GET PAYOUT

           // ASK TO PLAY AGAIN
           // DISPLAY EXIT MESSAGE
  }scanner.close();
   }static String[] spinRow() {
        String[] symbols = {"Rassberry", "Watermelon", "Lemon", "Ring", "Star"};
        String[] row = new String[3];
        Random random = new Random();
        System.out.println(symbols[random.nextInt(symbols.length)]);
  return new String[0];
    }
}
