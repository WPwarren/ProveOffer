package Arithmetic2;

public class Problem_07 {

	public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
    	if(pre == null || in == null )
            return null;
        return ConstructBinaryTree(pre,0,pre.length-1,in,0,in.length-1);
    }
    
    public TreeNode ConstructBinaryTree(int[] pre,int start1,int end1,int[] in,int start2,int end2){
        if(start1>end1 || start2>end2)
            return null;
        int val = pre[start1];
        TreeNode head = new TreeNode(val);
        
        int flag = findPlace(val,in,start2,end2);
        int offset = flag-start2-1;
        
        TreeNode left = ConstructBinaryTree(pre,start1+1,start1+1+offset,in,start2,start2+offset);
        TreeNode right = ConstructBinaryTree(pre,start1+offset+2,end1,in,flag+1,end2);
        
        head.left = left;
        head.right = right;
        
        return head;
    }
    
    public int findPlace(int val,int[] in,int start,int end){
        int i;
        for(i=start;i<end;i++){
            if(val == in[i]){
                break;
            }
        }
        return i;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem_07 tree = new Problem_07();
		int[] pre = {1,2,3,4,5,6,7};
		int[] in = {3,2,4,1,6,5,7};
		TreeNode root = tree.reConstructBinaryTree(pre,in);
		BinaryTree b = new BinaryTree();
		b.afterOrder(root);
	}

}
