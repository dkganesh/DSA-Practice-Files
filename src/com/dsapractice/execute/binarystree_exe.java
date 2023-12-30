package com.dsapractice.execute;

import com.dsapractice.binarySearchTree.binary_S_tree;

public class binarystree_exe {
	public static void main(String args[]) {
		binary_S_tree bst = new binary_S_tree();
		bst.insert(2);
		bst.insert(10);
		bst.insert(20);
		bst.insert(5);
		bst.insert(0);
		bst.insert(55);
		bst.insert(33);
		bst.insert(1);
		bst.insert(3);
		bst.insert(12);
		bst.inorder();
		System.out.println();
		bst.delete(10);
		bst.inorder();
		System.out.println();

	}
}
