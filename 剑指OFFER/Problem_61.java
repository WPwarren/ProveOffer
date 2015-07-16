package Arithmetic2;

import Arithmetic.BinTree;
import Arithmetic.TreeNode;

public class Problem_61 {

	public static String Serialize(TreeNode root) {
		if(root==null){
			return "$";
		}
		String cur = Integer.toString(root.val);
		String left = Serialize(root.left);
		String right = Serialize(root.right);
		
		return cur +","+ left +","+  right;
	}
	public static TreeNode Deserialize(String str){
		String[] array =  str.split(",");
		TreeNode root = new TreeNode(Integer.parseInt(array[0]));
		Deserialize(root,array);
		return root;
	}
	static int index = 1;
	private static void Deserialize(TreeNode root, String[] array) {
		if(index >= array.length)
			return ;
		
		if(array[index].equals("$")){
			index++;
		}else{
			TreeNode left = new TreeNode(Integer.parseInt(array[index]));
			root.left = left;
			index++;
			Deserialize(root.left, array);
		}
		
		if(array[index].equals("$")){
			index++;
		}else{
			TreeNode right = new TreeNode(Integer.parseInt(array[index]));
			root.right = right;
			index++;
			Deserialize(root.right, array);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinTree binTree = new BinTree();
		int[] a = {8,6,10,5,7,9,11};
		binTree.createBinTree(a);
		TreeNode root = binTree.nodeList.get(0);
		
		String s =Serialize(root);
		System.out.println(s);
		TreeNode node = Deserialize(s);
		binTree.preOrderTraverse(node);
	}

}
