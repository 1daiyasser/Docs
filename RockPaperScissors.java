## ✊🖐✌ Rock Paper Scissors Game

This is a simple **Rock Paper Scissors** game built using Java and runs in the terminal.

### 🎮 How it works:
- The player is asked to enter their choice: `rock`, `paper`, or `scissors`.
- The computer randomly chooses one of the three options.
- The winner is determined based on classic rules:
  - Rock beats Scissors
  - Paper beats Rock
  - Scissors beats Paper
- If both choices are the same, it's a tie.
- After each round, the player is asked if they want to play again.

### 🔧 Technologies Used:
- `Scanner` class for user input
- `Random` class for generating computer moves
- Java control structures (loops, conditions)

### 🧑‍💻 Author:
- Dai Yasser

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
