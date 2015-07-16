package Arithmetic2;

public class Problem_58 {

	public static boolean isSymmetrical(TreeNode pRoot){
		return isSymmetrical(pRoot,pRoot);
	}
	private static boolean isSymmetrical(TreeNode pRoot1, TreeNode pRoot2) {
		if(pRoot1 == null && pRoot2 == null)
			return true;
		if(pRoot1 == null || pRoot2 == null)
			return false;
		if(pRoot1.val !=pRoot2.val)
			return false;
		
		
		return isSymmetrical(pRoot1.left, pRoot2.right) && isSymmetrical(pRoot1.right, pRoot2.left);
	}
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		int[] data = {8,6,5,7,9,7,5};
		tree.buildTree(data);
		
		System.out.print(isSymmetrical(tree.root));
	}

}
