package com.huangyu;

import com.huangyu.bean.TreeNode;

/**
 * 226. Invert Binary Tree
 * 
 * @author huangyu
 *
 */
public class InvertBinaryTree {

	public TreeNode invertTree(TreeNode root) {
		if (root == null) {
			return null;
		}

		TreeNode left = invertTree(root.left);
		TreeNode right = invertTree(root.right);
		
		root.left = right;
        root.right = left;
		
		return root;
	}

}
