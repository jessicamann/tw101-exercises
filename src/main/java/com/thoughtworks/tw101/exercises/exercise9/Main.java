package com.thoughtworks.tw101.exercises.exercise9;

import java.util.List;

// Exercise #9: Create a class Node that implements a binary tree for Strings. It should have an add(String name) method
// that recursively finds the correct place to add a new node and a names() method that returns the names of all of the
// nodes in alphabetical order (this should also be implemented using recursion).

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(new Node("Cecil"));

        tree.add(new Node("Michelle"));
        tree.add(new Node("Bill"));
        tree.add(new Node("Jagruti"));
        tree.add(new Node("Tess"));
        tree.add(new Node("Sue-Ellen"));
        tree.add(new Node("Sara"));
        tree.add(new Node("Casey"));

        List<String> names = tree.names();

        for (String name : names) {
            System.out.println(name);
        }

    }
}
