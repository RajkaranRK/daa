package com.in28minute.tree.iterative;

import com.in28minute.tree.Node;
import com.in28minute.tree.bst.BSTree;

public class Client {
    
    public static void main(String[]args) {
         BSTree tree = new BSTree(20);
         Node<Integer> root  = tree.getRoot();
         tree.insert(root, 10);
         tree.insert(root, 30);
         PreorderTraversal preTraversal = new PreorderTraversal();
         preTraversal.doPreorderTraversal(root);
         
         PostorderTraversal postTraversal = new PostorderTraversal();
         postTraversal.doPostOrderTraversal(root);
         
         InorderTraversal inTraversal = new InorderTraversal();
         inTraversal.doInorderTraversal(root);
    }

}
