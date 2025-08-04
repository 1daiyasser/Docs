import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

        String filepath = "Words.txt";
        ArrayList<String> words =  new ArrayList<>();

        String line;
        try(BufferedReader reader = new BufferedReader(new FileReader(filepath))){
            while ((line = reader.readLine()) != null){
                words.add(line.trim());

            }
        }
             catch(FileNotFoundException e){
                 System.out.println("File does not exist");
        }
        catch (IOException e){
            System.out.println("");
        }

        Random random = new Random();
        String word = words.get(random.nextInt(words.size()));


        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuesses = 0;

         for(int i = 0 ; i < word.length() ; i++){
             wordState.add('_');

         }
         System.out.println("Welcome to Java Hangman Game!");

          while (wrongGuesses < 6){
              System.out.println(getHangmanArt(wrongGuesses));
              System.out.print("Word: ");
              for (char c : wordState){
                  System.out.print(c + " " );
              }
              System.out.println();

              System.out.print("Guess the letter: ");

              char input = scanner.next().toLowerCase().charAt(0);
              if(word.indexOf(input) >= 0){
                  System.out.println("Correct Guess!");

                  for (int i = 0; i < word.length(); i++){
                      if (word.charAt(i) == input){
                          wordState.set(i , input);
                      }

                  }
                  if (!wordState.contains('_')){
                      System.out.println(getHangmanArt(wrongGuesses));
                      System.out.println("You win!");
                      System.out.println("Thw word is: " + word);
                      break;
                  }

              }
              else {
                   wrongGuesses++;
                  System.out.println("Wrong Guess!");
              }

              if (wrongGuesses <= 6){
                  System.out.println(getHangmanArt(wrongGuesses));
                  System.out.println("Game Over!");
                  System.out.println("The word is: " + word);
              }
          }


          scanner.close();
    }
      static String getHangmanArt(int wrongGuesses){


           return switch (wrongGuesses){
               case 0 -> """
                       
                       
                       """;

               case 1 -> """
                          o
                      
                      
                      """;
               case 2 -> """
                           o
                           |
                       
                       """;

               case 3 -> """
                          o
                         /|
                       
                       """;

               case 4 -> """
                          o
                         /|\\
                       
                       """;

               case 5 -> """
                          o
                         /|\\
                         /
                       """;

               case 6 -> """
                          o
                         /|\\
                         / \\
                       """;
               default -> " ";
           };
       }}



