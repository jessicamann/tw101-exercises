package com.thoughtworks.tw101.exercises.exercise6;

// Exercise #6: Create Orc and Troll classes that implement a Monster interface with takeDamage(int amount),
// reportStatus methods. Create instances of both classes and store them in an ArrayList.
// Iterate through the list and make each monster take 10 points of damage. After you have damaged all of the monsters,
// report the status of all monsters. Reporting status should print the name and current hit points of the monster.
// * Orcs are named “Orc” and have 20 initial hitpoints
// * Trolls are named “Troll”, have 40 hit points and only take half damage

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Monster> list = new ArrayList<Monster>();
        list.add(new Troll());
        list.add(new Orc());
        for(Monster monster : list){
            monster.takeDamage(10);
            monster.reportStatus();
        }
    }
}
