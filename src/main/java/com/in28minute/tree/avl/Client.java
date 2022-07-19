package com.in28minute.tree.avl;

import com.in28minute.tree.Node;
import com.in28minute.tree.iterative.PreorderTraversal;
import com.in28minute.tree.operation.TreeOperation;

public class Client {

    public static void main(String []args){
        AvlTree avl = new AvlTree(30);
        Node<Integer> root = avl.getRoot();
        avl.insert(root,45);
        avl.insert(root,40);
        PreorderTraversal traversal = new PreorderTraversal();
        traversal.doPreorderTraversal(avl.getRoot());
    }
}
