import java.util.Random;
import java.util.Scanner;

public class Main {
   public static void main(String[] args){
              //ROCK PAPER SCISSORS GAME
       Scanner scanner = new Scanner(System.in);
       Random random = new Random();
       //DECLARE VARS
       String input;
       String rnd;
       String[] list = {"Rock" , "Paper" , "Scissors"};
       String playagain = "yes";
       String choice = "yes";

       do {


               // GET CHOICE FROM THE USER
               System.out.println("--------------");
               System.out.println("Welcome to ROCK PAPER SCISSORS game!");
               System.out.println("--------------");
               System.out.println("Please enter your choice (rock , paper, scissors):");

               // GET RANDOM CHOICE FOR THE COMPUTER
               input = scanner.nextLine().toLowerCase();
               rnd = list[random.nextInt(list.length)];

               // CHECK WIN CONDITION

               if (!input.equals("rock") && !input.equals("paper") && !input.equals("scissors")){
                   System.out.println("INPUT INVALID! please try again");
               }

               System.out.println("Computer Choice is: " + rnd);

               if (input.equals(rnd)){
                   System.out.println("it's a tie!");
               }
               else if(input.equals("paper") && rnd.equals("rock")||
                       input.equals("rock") && rnd.equals("scissors")||
                       input.equals("scissors") && rnd.equals("paper")){
                   System.out.println("you win!");

               }else {
                   System.out.println("you lose");
               }
           System.out.println("Wanna Play again? (yes / no)");
           choice = scanner.nextLine().toLowerCase();
           }while (choice.equals("yes"));


       // ASK TO PLAY AGAIN


       // GOODBYE MESSAGE
       if (choice.equals("no")){
           System.out.println("Nice to play with you ! GOODBYE");
       }
}
}
