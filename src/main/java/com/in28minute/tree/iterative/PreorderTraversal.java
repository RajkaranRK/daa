package com.in28minute.tree.iterative;

import java.util.Stack;

import com.in28minute.tree.Node;

public class PreorderTraversal {
    
    
    public void doPreorderTraversal(Node<Integer> root) {
        Node<Integer> node = root;
        
        Stack<Node<Integer>> stack = new Stack<>();
        
        while(node !=null || !stack.isEmpty()) {  
            
            if(node !=null) {
                
                System.out.print(node.data+"->");
                
                if(node.right !=null) {
                    stack.push(node.right);
                }
                   
                node = node.left;
                
            }else {
                node = stack.pop();
            }
        }
    }

}
