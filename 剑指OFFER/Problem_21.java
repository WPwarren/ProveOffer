package Arithmetic2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Problem_21 {

	public static ArrayList<Integer> PrintFromToBottom(TreeNode root){
		ArrayList<Integer> result = new ArrayList<Integer>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		if(root == null)
			return result;
		
		queue.add(root);
		while(!queue.isEmpty()){
			TreeNode node = queue.poll();
			result.add(node.val);
			if(node.left != null)
				queue.offer(node.left);
			if(node.right != null)
				queue.offer(node.right);
		}
		
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
