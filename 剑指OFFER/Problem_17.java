package Arithmetic2;

public class Problem_17 {

	public static void Mirror(TreeNode root){
		if(root != null){
			TreeNode temp = null;
			temp = root.left;
			root.left = root.right;
			root.right = temp;
			
			Mirror(root.left);
			Mirror(root.right);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
