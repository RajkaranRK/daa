package com.in28minute.tree.avl;

import com.in28minute.tree.Node;
import com.in28minute.tree.operation.TreeOperation;


public class AvlTree {

    Node<Integer> root;

    public AvlTree(Integer data) {
        this.root = new Node<>(data,null,null);
    }

    public Node<Integer> insert(Node<Integer> root, Integer data) {
        if(root==null) {
            Node<Integer> node = new Node<>(data,null,null);
            node.height = 1;
            return node;
        }else {
            if(root.data > data)
                root.left = insert(root.left,data);
            else
                root.right = insert(root.right,data);
        }
        root.height = TreeOperation.height(root);
        int balanceFactor = balanceFactor(root);
        if(balanceFactor(root) == 2 && root.left!=null && balanceFactor(root.left) == 1){
            //Perform LLRotation
            return doLLRotation(root);
        }else if(balanceFactor(root) == 2 && root.left != null && balanceFactor(root.left) == -1){
            //Perform LR Rotation
            return doLRRotation(root);
        }else if(balanceFactor(root) == -2 && root.right != null && balanceFactor(root.right) == -1){
            //Perform RR-Rotation
            return doRRRotation(root);
        }else if(balanceFactor(root) == -2 && root.right != null && balanceFactor(root.right) == 1) {
            //Perform RL-Rotation
            return doRLRotation(root);
        }
        return root;
    }

    public Node<Integer> getRoot(){
        return root;
    }



    public  Node<Integer> doLLRotation(Node<Integer> p){
        Node<Integer> pl = p.left;
        Node<Integer> plr = pl.right;
        pl.right = p;
        p.left = plr;
        if(p.equals(this.root)){
            this.root = pl;
        }
        p.height = TreeOperation.height(p);
        pl.height = TreeOperation.height(pl);
        return pl;
    }

    public Node<Integer> doLRRotation(Node<Integer> p){
        Node<Integer> pl = p.left;
        Node<Integer> plr = pl.right;
         p.left = plr.right;
         pl.right=plr.left;
         plr.left=pl;
         plr.right = p;
         if(p.equals(root)){
             root = plr;
         }
         p.height = TreeOperation.height(p);
         pl.height = TreeOperation.height(pl);
         plr.height = TreeOperation.height(plr);
        return plr;
    }

    public Node<Integer> doRRRotation(Node<Integer> p){
        Node<Integer> pr  = p.right;
        Node<Integer> prl = pr.left;
        pr.left = p;
        p.right = prl;
        if(root.equals(p)){
            root = pr;
        }
        p.height = TreeOperation.height(p);
        pr.height = TreeOperation.height(pr);
        return pr;
    }

    public Node<Integer> doRLRotation(Node<Integer> p){
        Node<Integer> pr = p.right;
        Node<Integer> prl = pr.left;
        p.right = prl.left;
        pr.left = prl.right;
        prl.left = p;
        prl.right = pr;
        if(root.equals(p)){
            root = prl;
        }
        pr.height = TreeOperation.height(pr);
        prl.height = TreeOperation.height(prl);
        p.height = TreeOperation.height(p);
        return prl;
    }



    public int balanceFactor(Node<Integer> node){
        int hl = TreeOperation.height(node.left);
        int hr = TreeOperation.height(node.right);
        return hl - hr;
    }
}
