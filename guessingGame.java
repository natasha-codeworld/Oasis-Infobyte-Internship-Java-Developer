import java.util.Scanner;
import java.util.Random;

public class guessingGame{
   public static void main(String[] args){
      Random random = new Random();
      int randomNumber = random.nextInt(100) + 1;
      int userNumber ;
      int attempts = 0;

      Scanner sc = new Scanner(System.in);
      System.out.println("Welcome to the 'Guess the Number' game!");
      System.out.println("I have selected a number between 1 and 100.");
      System.out.println("Can you guess the number?");

      do{
        System.out.print("Enter your guess: ");
        userNumber = sc.nextInt();
        attempts++;
        
        if(userNumber == randomNumber){
            System.out.println("\nCongratulations! You guessed correctly!");
        }
        else if(userNumber > randomNumber){
            System.out.println("Your guess is too high. Try again.");
        }
        else if(userNumber < randomNumber){
            System.out.println("Your guess is too low. Try again.");
        }
      }while(userNumber != randomNumber && attempts <= 10);
      System.out.println("you took "+attempts+" attempts.");
   }
}