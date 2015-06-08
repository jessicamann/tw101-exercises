package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by jessicamann on 6/7/15.
 */
public class Troll implements Monster {

    private int curHitPoints; //the remaining hitpoints

    public Troll(){
        curHitPoints=40;
    }

    public String reportStatus(){
        System.out.println(name()+" now has hit points of: "+currentHitPoints());
        return name()+" has hit points of: "+currentHitPoints();
    }
    public String name(){
        return "Troll";
    }
    public void takeDamage(int amt){
        curHitPoints-=amt/2;
    }
    public int currentHitPoints(){
        return curHitPoints;
    }

}
