package com.in28minute.tree.bst;

import com.in28minute.tree.Node;

public class BSTree {
    
    Node<Integer> root;
    
    public BSTree(Integer data) {
        this.root = new Node<>(data,null,null);
    }
    
    public Node<Integer> insert(Node<Integer> root, Integer data) {
        if(root==null) {
            return new Node<>(data,null,null);
        }else {
            if(root.data > data)
                root.left = insert(root.left,data);
            else 
                root.right = insert(root.right,data);
        }
        return root;
    }
    
    public Node<Integer> getRoot(){
        return root;
    }
}
