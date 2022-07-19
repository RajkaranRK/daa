package com.in28minute.tree.iterative;

import java.util.LinkedList;
import java.util.Queue;

import com.in28minute.tree.Node;

public class LevelOrderTraversal {
    
    
    public void doLavelOrderTraversal(Node<Integer> root) {
        Node<Integer> node = root;
        Queue<Node<Integer>> queue = new LinkedList<>();
        System.out.println(node.data);
        queue.add(node);
        while(!queue.isEmpty()) {
            Node<Integer> temp = queue.poll();
            if(temp.left !=null) {
                System.out.println(temp.data);
                queue.add(temp);
            }
            if(temp.right != null) {
                System.out.println(temp.data);
                queue.add(temp);
            }
        }
    }
}
