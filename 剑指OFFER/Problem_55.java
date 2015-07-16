package Arithmetic2;

public class Problem_55 {

	public ListNode EntryNodeOfLoop(ListNode pHead){
		if(pHead == null||pHead.next == pHead)
			return null;
		ListNode slow = pHead;
		ListNode fast = pHead;
		
		do{
			slow = slow.next;
			fast = fast.next.next;
		}while(slow != fast);
		
		slow = pHead;
		while(slow != fast){
			slow = slow.next;
			fast = fast.next;
		}
		
		return fast;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
