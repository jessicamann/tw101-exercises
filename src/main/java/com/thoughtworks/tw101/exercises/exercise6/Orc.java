package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by jessicamann on 6/7/15.
 */
public class Orc implements Monster {
    private int curHitPoints; //the remaining hitpoints

    public Orc(){
        curHitPoints=20;
    }
    public String reportStatus(){
        System.out.println(name()+" now has hit points of: "+currentHitPoints());
        return name()+" has hit points of: "+currentHitPoints();
    }
    public String name(){
        return "Orc";
    }
    public void takeDamage(int amt){
        curHitPoints-=amt;
    }
    public int currentHitPoints(){
        return curHitPoints;
    }
}
