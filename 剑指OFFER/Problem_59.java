package Arithmetic2;

import java.util.ArrayList;
import java.util.Stack;

public class Problem_59 {
	public static ArrayList<ArrayList<Integer>> Print(TreeNode pRoot){
		ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
		if(pRoot == null)
			return lists;
		
		Stack<TreeNode> s1 = new Stack<TreeNode>();
		Stack<TreeNode> s2 = new Stack<TreeNode>();
		s1.push(pRoot);
		
		while(!s1.isEmpty() || !s2.isEmpty()){
			ArrayList<Integer> list = new ArrayList<Integer>();
			TreeNode node = null;
			if(!s1.isEmpty()){
				while(!s1.isEmpty()){
					node = s1.pop();
					if(node.left !=null)
						s2.push(node.left);
					if(node.right != null)
						s2.push(node.right);
					list.add(node.val);
				}
			}else{
				while(!s2.isEmpty()){
					node = s2.pop();
					if(node.right!=null)
						s1.push(node.right);
					if(node.left!=null)
						s1.push(node.left);
					list.add(node.val);
				}
			}
			
			lists.add(list);
		}
		return lists;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree = new BinaryTree();
		int[] data = {8,6,10,5,7,9,11};
		tree.buildTree(data);
		
		System.out.print(Print(tree.root));
	}

}
