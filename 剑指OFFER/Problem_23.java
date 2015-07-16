package Arithmetic2;

import java.util.ArrayList;

public class Problem_23 {
	
	public static ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target){
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> path = new ArrayList<Integer>();
		if(root == null )
			return list;
		int sum = 0;
		FindPath(root,target,list,path,sum);
		return list;
	}
	private static void  FindPath(TreeNode root,
			int target, ArrayList<ArrayList<Integer>> list,ArrayList<Integer> path,int sum) {
		
		path.add(root.val);
		sum += root.val;
		boolean left = root.left == null && root.right == null;
		if(left && sum == target)
		{
			ArrayList<Integer> copyPath = new ArrayList<Integer>(path);
			list.add(copyPath);
		}
		
		if(root.left != null)
			FindPath(root.left,target,list,path,sum);
		if(root.right != null)
			FindPath(root.right,target,list,path,sum);
		
		path.remove(path.size()-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree = new BinaryTree();
		int[] data1 = {};
		tree.buildTree(data1);
		System.out.print(FindPath(tree.root,22));
	}

}
