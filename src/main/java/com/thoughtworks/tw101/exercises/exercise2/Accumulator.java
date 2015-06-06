package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {
    private int totalCount;

    public Accumulator() {
        //initialize totalCount
        totalCount = 0;
    }

    /** prints out the total number of times increment() was called */
    public void total(){
        System.out.println(totalCount);
    }

    /** add to totalCount */
    public void increment() {
        totalCount++;
    }
}
