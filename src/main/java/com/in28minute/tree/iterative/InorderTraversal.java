package com.in28minute.tree.iterative;

import java.util.Stack;

import com.in28minute.tree.Node;

public class InorderTraversal {
    
    
    public void doInorderTraversal(Node<Integer> root) {
        Node<Integer> node = root;
        Stack<Node<Integer>> stack = new Stack<>();
        
        while(node !=null || !stack.isEmpty()) {
            
            if(node!=null) {
                stack.push(node);
                node = node.left;
            }else {
                node = stack.pop();
                System.out.println(node.data);
                node = node.right;
            }
        }
        
    }

}
