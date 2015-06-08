package com.thoughtworks.tw101.exercises.exercise9;

public class Node {
    public String name;
    public BinaryTree right;
    public BinaryTree left;

    public Node(String name) {
        this.name = name;
    }

    public boolean hasRightChild(){
        return right!=null;
    }
    public boolean hasLeftChild(){
        return left!=null;
    }
}
