package Arithmetic2;

public class Problem_57 {

	public static TreeLinkNode GetNext(TreeLinkNode pNode){
		if(pNode == null)
			return null;
		
		TreeLinkNode partent = null;
		if(pNode.right != null){
			return GetLeftMost(pNode.right);
		}else{
			partent = pNode.next;
			while(partent!=null && partent.left!=pNode){
				pNode = partent;
				partent = pNode.next;
			}
		}
		return partent;
	}
	private static TreeLinkNode GetLeftMost(TreeLinkNode Node) {
		if(Node == null)
			return Node;
		while(Node.left!=null){
			Node = Node.left;
		}
		return Node;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
