package com.thoughtworks.tw101.exercises.exercise8;

// Exercise #8: Create a new version of Exercise #7 where you also record all of the user’s guesses and print them out
// once they guess correctly. Use an ArrayList to store the guesses. Catch the NumberFormatException and handle the case
// where the user entered a String that is not parseable.

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Take a guess, between 1 and 100: ");
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> guesses = new ArrayList<Integer>();

        beginGame(in, guesses);
        endGame(guesses);
    }

    private static void beginGame(Scanner in, ArrayList<Integer> guesses) {
        GuessGame game = new GuessGame();

        while (in.hasNext()) {
            try{
                int userGuess = Integer.parseInt(in.next());
                guesses.add(userGuess);
                if (userGuess == game.getTargetNum()) {
                    System.out.println("You got it!");
                    break;
                } else {
                    wrongGuess(guesses, game, userGuess);
                }
            } catch(NumberFormatException e){
                System.out.println("Please enter an integer: ");
            }
        }
    }

    private static void wrongGuess(ArrayList<Integer> guesses, GuessGame game, int userGuess) {
        if(game.tooHigh(userGuess)){
            System.out.println("Too high. Try again: ");
        } else {
            System.out.println("Too low. Try again: ");
        }
    }

    private static void endGame(ArrayList<Integer> guesses){
        System.out.println("Below were your guesses: ");
        for(int guess : guesses) {
            System.out.print(guess + " ");
        }
    }
}
