package com.in28minute.tree;

public class Node<T> {
    public T data;
    public Node left;
    public Node right;
    public boolean print = false;
    public int height;
    public Node(T data, Node left, Node right){
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
