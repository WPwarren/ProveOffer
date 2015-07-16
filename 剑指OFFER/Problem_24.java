package Arithmetic2;

public class Problem_24 {
	
	public static RandomListNode Clone(RandomListNode pHead){
		if(pHead == null)
			return null;
		RandomListNode cloneHead = new RandomListNode(pHead.label);
		cloneHead.next = pHead.next;
		RandomListNode cloneCurrent = cloneHead;
		RandomListNode current = pHead.next;
		
		while(current != null){
			RandomListNode Node = new RandomListNode(current.label);
			
			cloneCurrent.next = Node;
			cloneCurrent = cloneCurrent.next;
			
			current = current.next;
		}
		
		current = pHead;
		cloneCurrent = cloneHead;
		
		while(current != null){
			cloneCurrent.random = current.random;
			
			cloneCurrent = cloneCurrent.next;
			current = current.next;
		}

		return cloneHead;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
