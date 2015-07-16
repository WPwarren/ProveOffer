package Arithmetic2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import Arithmetic.BinTree;
import Arithmetic.TreeNode;

public class Problem_60 {

	public static ArrayList<ArrayList<Integer>> Print(TreeNode pRoot){
		ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		if(pRoot == null)
			return lists;
		
		Queue<TreeNode> q1 = new LinkedList<TreeNode>();
		Queue<TreeNode> q2 = new LinkedList<TreeNode>();
		
		q1.offer(pRoot);
		while(!q1.isEmpty() || !q2.isEmpty()){
			TreeNode node = q1.poll();
			if(node.left !=null)
				q2.offer(node.left);
			if(node.right != null)
				q2.offer(node.right);
			list.add(node.val);
			
			if(q1.isEmpty()&& !q2.isEmpty()){
				ArrayList<Integer> copy = new ArrayList<Integer>(list);
				lists.add(copy);
				list.clear();
				while(!q2.isEmpty()){
					q1.offer(q2.poll());
				}
			}
		}
		lists.add(list);
		return lists;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinTree binTree = new BinTree();
		int[] a = {8,6,10,5,7,9,11};
		binTree.createBinTree(a);
		
		TreeNode root = binTree.nodeList.get(0);
		System.out.print(Print(root));
	}

}
