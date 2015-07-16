package Arithmetic2;

public class Problem_16 {

	public static boolean HasSubTree(TreeNode root1, TreeNode root2){
		boolean result = false;
		
		if(root1 != null && root2 != null){
			if(root1.val == root2.val)
				result = DoesTree1HasTree2(root1,root2);
			if(!result)
				result = HasSubTree(root1.left, root2);
			if(!result)
				result = HasSubTree(root1.right, root2);
		}
		return result;
	}
	private static boolean DoesTree1HasTree2(TreeNode root1, TreeNode root2) {
		// TODO Auto-generated method stub
		if(root2 == null)
			return true;
		if(root1 == null)
			return false;
		if(root1.val != root2.val)
			return false;
		
		return DoesTree1HasTree2(root1.left, root2.left) && DoesTree1HasTree2(root1.right, root2.right);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree1 = new BinaryTree();
		BinaryTree tree2 = new BinaryTree();

		int[] data1 = {2,8,7,4,9,3,1,6,7,5};
		int[] data2 = {2,1,8};

		tree1.buildTree(data1);
		tree2.buildTree(data2);

		System.out.println(HasSubTree(tree1.root,tree2.root));
	}

}
