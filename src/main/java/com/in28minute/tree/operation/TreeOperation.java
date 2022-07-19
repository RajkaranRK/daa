package com.in28minute.tree.operation;

import com.in28minute.tree.Node;

public class TreeOperation {
    //method to find the total number of nodes present in tree 
    public static int countNode(Node<Integer> root) {
        if(root == null) {
            return 0;
        }else {
            int x = countNode(root.left);
            int y = countNode(root.right);
            return x+y+1;
        }
    }
    
    
    //method to find the total leaf node
    public static int countLeafNode(Node<Integer> root) {
        if(root ==null) {
            return 0;
        }
        else {
            int x = countLeafNode(root.left);
            int y = countLeafNode(root.right);
            if(root.left == null && root.right == null) {
                return x+y+1;
            }else {
                return x+y;
            }
        }
    }
    
    //method to find the node with degree 1
    public static int countNodeWithDegreeOne(Node<Integer> root) {
        if(root == null) {
            return 0;
        }else {
            int x = countNodeWithDegreeOne(root.left);
            int y = countNodeWithDegreeOne(root.right);
            if(root.left !=null || root.right !=null ) {
                return x+y+1;
            }else {
                return x+y;
            }
        }
    }
    
    
    //method to find the node with degree 2
    public static int countNodeWithDegreeTwo(Node<Integer> root) {
        if(root == null) {
            return 0;
        }else {
            int x = countNodeWithDegreeTwo(root.left);
            int y = countNodeWithDegreeTwo(root.right);
            if(root.left !=null && root.right !=null ) {
                return x+y+1;
            }else {
                return x+y;
            }
        }
    }
    
    
    //method to find the height of the tree
    public static int height(Node<Integer> root) {
        if(root==null) {
            return 0;
        }else {
            int x = height(root.left);
            int y = height(root.right);
            return x > y ? x+1 : y+1;
        }
    }
    
    //method to find the predecessor of the node
    public static Node<Integer> findPredecessor(Node<Integer> root, Node<Integer> node,Node<Integer> temp){
        if(node==null || root == null) {
            return null;
        }
        if(root.data.equals(node.data)) {
            return temp;
        }else {
            Node<Integer> leftNode = findPredecessor(root.left, node,root);
            Node<Integer> rightNode = findPredecessor(root.right, node, root);
            return leftNode != null ? leftNode : rightNode !=null ? rightNode : leftNode;
        }
    }
    
    
    public static Node<Integer> findSuccessor(Node<Integer> root, Integer data){
        if(data == null || root == null) {
            return null;
        }
        if(root.data.equals(data)) {
            return root;
        }else {
            Node<Integer> leftNode = findSuccessor(root.left, data);
            Node<Integer> rightNode = findSuccessor(root.right, data);
            return leftNode != null ? leftNode : rightNode !=null ? rightNode : leftNode;
        }
    }

}
