package com.example.demo;

import java.util.List;

import static com.example.demo.TreeNode.sum;

public class SameTree {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1,new TreeNode(2), new TreeNode(3));
        TreeNode treeNode2 = new TreeNode(1,new TreeNode(2), new TreeNode(3));
//        isSameTree(treeNode, treeNode2);
        System.out.println(sum(treeNode));

    }
    public static boolean isSameTree(TreeNode p, TreeNode q) {

        List<Integer> getValues(TreeNode tree){}

    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static int sum (TreeNode p){
        int summ = p.val;

        if (p.left != null) {
            summ += sum(p.left);
        }

        if (p.right != null) {
            summ += sum(p.right);
        }
        return summ;
    }

}
