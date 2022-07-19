package com.in28minute.tree.operation;

import com.in28minute.tree.Node;
import com.in28minute.tree.bst.BSTree;
import com.in28minute.tree.iterative.PreorderTraversal;

public class Client {
    
    public static void main(String []args) {
        //count Nodes;
        
        BSTree tree = new BSTree(30);
        Node<Integer> root = tree.getRoot();
        tree.insert(root, 20);
        tree.insert(root, 10);
        tree.insert(root, 25);
        tree.insert(root, 40);
        tree.insert(root, 50);
        tree.insert(root, 35);
        PreorderTraversal traversal = new PreorderTraversal();
        traversal.doPreorderTraversal(root);
        
        int noOfNodes = TreeOperation.countNode(root);
        System.out.println("");
        System.out.println("Total number of nodes in tree "+noOfNodes);
        
        int noOfLeafNode = TreeOperation.countLeafNode(root);
        System.out.println("Total Leaf node in tree are "+noOfLeafNode);
        
        
        //node with atleast degree 1 
        int nodeWithDegreeOne = TreeOperation.countNodeWithDegreeOne(root);
        System.out.println("Total node with degree one "+nodeWithDegreeOne);
        
        
        //node with atleast degree 2
        int nodeWithDegreeTwo = TreeOperation.countNodeWithDegreeTwo(root);
        System.out.println("Total node with degree two "+nodeWithDegreeTwo);
        
        //height of the tree
        int height = TreeOperation.height(root);
        System.out.println("Height of the tree is "+height);
        
        
        //method call to find the predecessor
        Node<Integer> predecessor = TreeOperation.findPredecessor(root, new Node<>(20,null,null), null);
        System.out.println(predecessor.data);
        
        //method call to find the successor
        Node<Integer> node = TreeOperation.findSuccessor(root, 20);
        if(node != null) {
            System.out.println("Left Child "+node.left);
            System.out.println("Right Child "+node.right);
        }
    }

}
