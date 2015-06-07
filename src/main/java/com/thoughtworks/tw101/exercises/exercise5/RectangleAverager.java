package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {

    public float averageArea(Rectangle[] rectangles) {

        int sumOfArea = 0;

        for(Rectangle r : rectangles){
            sumOfArea += r.area();
        }

        return (float)sumOfArea/(float)rectangles.length;
    }
}
