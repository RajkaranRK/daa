package com.in28minute.tree;

import java.util.Stack;

public class CustomTree {
    
    public static void main(String []args) {
        Node<Integer> root = new Node<>(20,null,null);
        populateCustomTree(root,25);
        populateCustomTree(root,30);
        populateCustomTree(root, 35);
        populateCustomTree(root, 22);
        populateCustomTree(root, 21);
        populateCustomTree(root, 23);
        populateCustomTree(root, 29);
        populateCustomTree(root, 15);
        populateCustomTree(root, 12);
        populateCustomTree(root, 19);
        populateCustomTree(root, 10);
        populateCustomTree(root, 13);
        printTree(root);
        iterativePreOrder(root);
        iterativeInorder(root);
    }
    
    private static void populateCustomTree(Node<Integer> root, Integer data){
        Node<Integer> temp = null;
        while(root != null) {
            temp = root;
            if(root.data < data) {
                //right child 
                root = root.right;
            }else {
                //left child
                root= root.left;
            }
        }
        Node<Integer> newNode = new Node<>(data,null,null);
        if(temp.data < data) {
            temp.right = newNode;
        }else {
            temp.left = newNode;
        }
    }
    
    private static void printTree(Node<Integer> root) {
        if(root == null) {
            return;
        }
        System.out.print(root.data +"->");
        printTree(root.left);
        printTree(root.right);
    }
    
    private static void iterativePreOrder(Node<Integer> root) {
        System.out.println("");
        Stack<Node<Integer>> stack = new Stack<>();
        while(root != null || !stack.isEmpty()) {
            if(root!=null) {
                System.out.print(root.data+"->");
                stack.push(root);
                root = root.left;
            }else {
                root = stack.pop();
                root = root.right;
            }
        }
    }
    
    private static void iterativeInorder(Node<Integer> node) {
        
        System.out.println("");
        
        Stack<Node<Integer>> stack = new Stack<>();
        
        while(node != null || !stack.isEmpty()) {
            if(node != null) {
                stack.push(node);
                node = node.left;
                
            }else {
                node = stack.pop();
                System.out.print(node.data+"->");
                node = node.right;
            }
        }
    }
    
    

}
