package Arithmetic2;

public class BinaryTree {
	public TreeNode root;
	public BinaryTree()
	{
		root = null;
	}
	public void insert(int val)
	{
		TreeNode newTreeNode = new TreeNode(val);
		if(root == null)
			root = newTreeNode;
		else{
			TreeNode current = root;
			TreeNode parent;
			while(true)
			{
				parent = current;
				if(val<current.val)
				{
					current = current.left;
					if(current == null)
					{
						parent.left = newTreeNode;
						break;
					}
				}else{
					current = current.right;
					if(current == null)
					{
						parent.right = newTreeNode;
						break;
					}
				}
			}
		}
		
	}
	public void buildTree(int[] a)
	{
		for(int i=0;i<a.length;i++)
			insert(a[i]);
	}
	
	public void afterOrder(TreeNode root){
		if(root != null){
			afterOrder(root.left);
			afterOrder(root.right);
			System.out.print(root.val+" ");
		}
	}
}
