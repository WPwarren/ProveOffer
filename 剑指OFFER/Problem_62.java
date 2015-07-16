package Arithmetic2;

import java.util.ArrayList;

public class Problem_62 {
	static int index = 0;
	public static TreeNode KthNode(TreeNode root,int k){
		if(k<=0 || root == null)
			return null;
		
		ArrayList<TreeNode> list = new ArrayList<TreeNode>();
		KthNode(root,list);
		return list.get(k-1);
	}
	private static void KthNode(TreeNode root, ArrayList<TreeNode> list) {
		if(root!=null){
			KthNode(root.left,list);
			list.add(root);
			KthNode(root.right,list);
		}
	}
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		int[] data = {5,3,7,2,4,6,8};
		tree.buildTree(data);
		
		System.out.print(KthNode(tree.root, 3).val);
	}

}
