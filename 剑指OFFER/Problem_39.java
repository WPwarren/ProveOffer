package Arithmetic2;

public class Problem_39 {

	public static boolean IsBalance(TreeNode root){
		Integer depth =  0;
		return IsBalance(root,depth);
	}
	private static boolean IsBalance(TreeNode root, Integer depth) {
		if(root == null){
			depth = 0;
			return true;
		}
		
		Integer left = 0,right = 0;
		if(IsBalance(root.left, left) && IsBalance(root.right,right)){
			Integer diff = Math.abs(left - right);
			if(diff > 1)
				return false;
			else{
				depth = (left > right?left:right)+1;
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree = new BinaryTree();
		int[] a = {3,2,5,1,4,6,0};
		tree.buildTree(a);
		System.out.print(IsBalance(tree.root));
	}

}
