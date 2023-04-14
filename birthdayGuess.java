package ProblemSolvingTaks;

import java.util.Scanner;

public class birthdayGuess {
    public static void guessDay() {
        Scanner scanner = new Scanner(System.in);
        int date = 25;
        int guess;

        do {
            System.out.println("Guess day");
            guess = scanner.nextInt();
            if (guess == date) System.out.println("correct");
             else System.out.println("incorrect");
        }while (guess != date);
    }


    public static void main(String[] args) {
    guessDay();
    }
}
