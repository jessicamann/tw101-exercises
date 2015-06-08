package com.thoughtworks.tw101.exercises.exercise9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by jessicamann on 6/7/15.
 */
public class BinaryTree {

    Node root;

    public BinaryTree(Node root){
        this.root = root;
    }

    public void add(Node newNode) {
        findSpot(this.root, newNode);
    }

    private void findSpot(Node root, Node newNode){
        if(newNode.name.compareToIgnoreCase(root.name)>0){
            if(root.right!=null){
                findSpot(root.right.root, newNode);
            } else {
                root.right = new BinaryTree(newNode);
            }
        } else{
            if(root.left!=null){
                findSpot(root.left.root, newNode);
            } else {
                root.left = new BinaryTree(newNode);
            }
        }
    }

    private List<String> getOrderedTree(){
        HashSet<String> traversed = new HashSet<String>();
        List<String> list = new ArrayList<String>();

        traverseTree(this.root, traversed, list);
        return list;
    }

    private void traverseTree(Node root, HashSet<String> traversed, List<String> list) {
        if(root.left!=null && !traversed.contains(root.left.root.name)){
            traverseTree(root.left.root, traversed, list);
        }
        if(root!=null && !traversed.contains(root.name)){
            list.add(root.name);
            traversed.add(root.name);
        }
        if(root.right!=null && !traversed.contains(root.right.root.name)){
            traverseTree(root.right.root, traversed, list);
        }
    }

    /** returns list of names in alphabetical order */
    public List<String> names() {
        return getOrderedTree();
    }

}
