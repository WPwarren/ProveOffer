package Arithmetic2;

public class Problem_25 {
	static TreeNode pLastNode = null;;
	public static TreeNode Convert(TreeNode pRootTree){
		if(pRootTree == null)
			return null;
		
		ConvertToList(pRootTree);
		
		TreeNode pHeadNode = pLastNode;
		while(pHeadNode != null && pHeadNode.left != null){
			pHeadNode = pHeadNode.left;
		}
		return pHeadNode;
	}
	
	private static void ConvertToList(TreeNode pRootTree) {
		if(pRootTree == null)
			return ;
		TreeNode curNode = pRootTree;
		if(pRootTree.left != null)
			ConvertToList(pRootTree.left);
		
		curNode.left = pLastNode;
		if(pLastNode != null)
			pLastNode.right = curNode;
		pLastNode = curNode;
		
		if(pRootTree.right != null)
			ConvertToList(pRootTree.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree = new BinaryTree();
		int[] data = {1,2,3,4,5,6,7};
		tree.buildTree(data);
		TreeNode head = Convert(tree.root);
		while(head!= null)
		{
			System.out.print(head.val+" ");
			head = head.right;
		}
	}

}
