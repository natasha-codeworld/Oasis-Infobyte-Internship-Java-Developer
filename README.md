# Oasis-Infobyte-Internship-Java-Developer
Task2-NumberGuessingGame

1. Imports:
The code starts by importing two necessary classes:
Scanner: This class allows the program to read user input from the console.
Random: This class is used to generate random numbers.

2. Generating a Random Number:
Inside the main() method, the code creates a Random object to generate random numbers.
It then uses the nextInt(100) + 1 method to generate a random integer between 1 and 100 (inclusive). This random number will be the target for the user to guess.

3. Initializing Variables:
The code declares three variables:
userNumber: This variable will store the user's guess in each round.
attempts: This variable will count the number of attempts the user has made.
randomNumber: This variable stores the randomly generated number that the user needs to guess.

4. Guessing Loop:
The core of the game is a do-while loop that continues as long as the user hasn't guessed the correct number and they haven't exceeded 10 attempts.
Inside the loop:
The user is prompted to enter their guess.
The guess is read using the Scanner object.
The attempts counter is incremented.
The code checks if the guess is correct:
If it's correct, a congratulations message is printed, and the loop exits.
If it's too high, a hint is given to try a lower number.
If it's too low, a hint is given to try a higher number.

5. Game Over:
Once the loop ends (either because the user guessed correctly or ran out of attempts), the total number of attempts taken is printed to the console, indicating the end of the game.
