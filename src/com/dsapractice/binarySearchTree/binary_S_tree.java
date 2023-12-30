package com.dsapractice.binarySearchTree;

public class binary_S_tree {
	private class node {
		int data;
		node left;
		node right;

		node() {
			left = null;
			right = null;
		}

		node(int data) {
			this.data = data;
			left = null;
			right = null;
		}
	}

	private node root;

	public binary_S_tree() {
		root = null;
	}

	public binary_S_tree(int data) {
		this.root = new node(data);
	}

	/* Insert */
	public void insert(int data) {
		if (this.root == null) {
			this.root = new node(data);
			return;
		}
		insert(this.root, data);
	}

	private node insert(node root, int data) {
		if (root == null) {
			node p = new node(data);
			root = p;
			return root;
		}

		if (data > root.data)
			root.right = insert(root.right, data);
		else if (data < root.data)
			root.left = insert(root.left, data);

		return root;
	}

	/* Inorder */
	public void inorder() {
		inorder(root);
	}

	private node inorder(node root) {
		if (root != null) {
			inorder(root.left);
			System.out.printf(root.data + " ");
			inorder(root.right);

		}
		return root;
	}

	/* Preorder */
	public void preorder() {
		preorder(root);
	}

	private node preorder(node root) {
		if (root != null) {
			System.out.printf(root.data + " ");
			preorder(root.left);
			preorder(root.right);

		}
		return root;
	}

	/* Postorder */
	public void postorder() {
		postorder(root);
	}

	private node postorder(node root) {
		if (root != null) {
			postorder(root.left);
			postorder(root.right);
			System.out.printf(root.data + " ");
		}
		return root;
	}

	public void delete(int data) {
		del(this.root, data);
	}

	private node del(node root, int data) {

		if (root != null) {
			if (root.data > data)
				root.left = del(root.left, data);
			else if (root.data < data)
				root.right = del(root.right, data);
			else {
				if (root.left == null)
					return root.right;
				else if (root.right == null)
					return root.left;
				else {
					root.data = min(root.right);
					root.right = del(root.right, root.data);
				}
			}
		}

		return root;
	}

	private int min(node root) {
		int ans = root.data;
		while (root.left != null) {
			ans = root.data;
			root = root.left;
		}
		return ans;
	}
}
