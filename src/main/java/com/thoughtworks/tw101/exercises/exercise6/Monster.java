package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by jessicamann on 6/7/15.
 */
public interface Monster {
    public void takeDamage(int amount);
    public String reportStatus();
    public int currentHitPoints();
    public String name();
}
