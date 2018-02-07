package com.huangyu;

import com.huangyu.bean.TreeNode;

/**
 * 617. Merge Two Binary Trees
 * 
 * @author huangyu
 *
 */
public class MergeTwoBinaryTrees {

	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		if (t1 == null && t2 == null) {
			return null;
		} else if (t1 == null) {
			return t2;
		} else if (t2 == null) {
			return t1;
		}
		TreeNode treeNode = new TreeNode(t1.val + t2.val);
		treeNode.left = mergeTrees(t1.left, t2.left);
		treeNode.right = mergeTrees(t1.right, t2.right);
		return treeNode;
	}

}
