import java.util.Scanner;

public class Main {
   public static void main(String[] args){
  //JAVA QUIZ GAME
       Scanner scanner = new Scanner(System.in);

       //QUESTION ARRAY[]
       String[] questions = {"What is the capital of Australia?" ,
                             "What does the word “benevolent” mean?" ,
                             "Which continent is the Sahara Desert located in?" ,
                             "Which gas do plants absorb from the atmosphere?"};
       //OPTIONS ARRAY[]
       String[][] options = {{"1. Sydney " , "2. Malbourne" , "3. Canberra" , "4. Brisbane"} ,
                             {"1. Evil or harmful " , "2. Kind and generous" , "3. Loud and noisy" , "4.Strange or weird"} ,
                             {"1. Asia" , "2. Africa" , "3. South America" , "4. Australia"} ,
                             {"1. Oxygen" , "2. Nitrogen" , "3. Hydrogen" , "4. Carbon Dioxide" }
       };


       // DECLARE VARIABLES
       int[] answers = {1 , 2 , 2 , 4};
       int score = 0;
       int guess;


       // WELCOME MESSAGE
       System.out.println("---------------------");
       System.out.println("Welcome to Quiz game!");
       System.out.println("---------------------");
       System.out.println("Let's Start");

       // QUESTION (LOOP)
       for (int i = 0 ; i < questions.length ; i++){
           System.out.println(questions[i]);
           //   OPTIONS
           for (String option : options[i]){
               System.out.println(option);
           }
           //   GET GUESS FROM USER
           System.out.println("Enter your guess:" );
           guess = scanner.nextInt();

       //   CHECK THE GUESS
       if (guess == answers[i]){
            System.out.println("Correct Answer");
            score++;
       }else {
           System.out.println("Wrong Answer");
       }
 System.out.println("Your score is " + score + " out of " + questions.length);
       }


}
}
