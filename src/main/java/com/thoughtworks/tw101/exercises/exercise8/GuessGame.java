package com.thoughtworks.tw101.exercises.exercise8;

import java.util.Random;

/**
 * Created by jessicamann on 6/7/15.
 */

public class GuessGame {

    private int targetNum;

    public GuessGame(){
        targetNum = generateRandomNum(1,100);
    }

    private int generateRandomNum(int low, int high){
        return ((new Random()).nextInt(high-low)+low);
    }

    public boolean tooHigh(int n){
        return n > targetNum;
    }

    public boolean tooLow(int n){
        return n < targetNum;
    }

    public int getTargetNum(){
        return targetNum;
    }
}
