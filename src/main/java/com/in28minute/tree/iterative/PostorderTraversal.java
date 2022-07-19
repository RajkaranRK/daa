package com.in28minute.tree.iterative;

import java.util.Stack;

import com.in28minute.tree.Node;

public class PostorderTraversal {
    
    public void doPostOrderTraversal(Node<Integer> root) {
        
        Node<Integer> node = root;
        
        Stack<Node<Integer>> stack = new Stack<>();
        
        while(node !=null || !stack.isEmpty()) {
            if(node !=null ) {
                stack.push(node);
                node = node.left;
            }else {
               node = stack.pop();
               if(node.print) {
                   System.out.println(node.data);
                   node = null;
               }else {
                   node.print = true;
                   stack.push(node);
                   node = node.right;
               }
            }
        }
    }

}
