package com.thoughtworks.tw101.exercises.exercise7;

// Write a program that chooses a random number between 1 and 100. Then asks the user to enter a guess. If they guess
// right then tell them they win, otherwise tell them if they guessed too high or low. Keep asking the user to guess
// until they get the right answer. Use classes to separate the different concerns of this program.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Take a guess, between 1 and 100: ");
        Scanner in = new Scanner(System.in);

        beginGame(in);
    }

    private static void beginGame(Scanner in) {
        GuessGame game = new GuessGame();

        while(in.hasNext()){
            int userGuess = in.nextInt();
            if(userGuess==game.getTargetNum()){
                System.out.println("You got it!");
                break;
            } else if (game.tooHigh(userGuess)){
                System.out.println("Too high. Try again: ");
            } else {
                System.out.println("Too low. Try again: ");
            }
        }
    }
}
