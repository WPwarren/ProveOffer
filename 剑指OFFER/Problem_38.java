package Arithmetic2;

public class Problem_38 {
	public static int TreeDepth(TreeNode root){
		if(root == null)
			return 0;
		
		int left = TreeDepth(root.left);
		int right = TreeDepth(root.right);
		
		return left > right ?(left+1):(right+1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree = new BinaryTree();
		int[] a = {6,5,4,7,9,7,3,1};
		tree.buildTree(a);
		System.out.print(TreeDepth(tree.root));
 	}

}
