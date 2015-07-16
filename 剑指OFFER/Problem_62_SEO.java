package Arithmetic2;

public class Problem_62_SEO {

	public static TreeNode KthNode(TreeNode root,int k){
		if(root==null || k<= 0){
			return null;
		}
		int[] ka = {k};
		return FindKNode(root,ka);
	}
	private static TreeNode FindKNode(TreeNode root, int[] k) {
		TreeNode tar = null;
		if(root.left != null){
			tar = FindKNode(root.left,k);
		}
		if(tar == null){
			if(k[0]==1)
				tar = root;
			k[0]--;
		}
		if(tar==null && root.right != null)
			tar = FindKNode(root.right,k);
		
		return tar;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree = new BinaryTree();
		int[] data = {5,3,7,2,4,6,8};
		tree.buildTree(data);
		
		System.out.print(KthNode(tree.root, 3).val);
	}

}
