package com.thoughtworks.tw101.exercises.exercise3;

public class OddSum {

    public int of(int start, int end) {

        int sum = 0;

        // if the starting number is not odd, increment by 1 to make it odd
        if(start%2==0){
            start++;
        }

        // assuming that the sum is [start, end) -- not inclusive the end integer
        while(start < end){
            sum+=start;
            start += 2;
        }

        return sum;
    }
}
