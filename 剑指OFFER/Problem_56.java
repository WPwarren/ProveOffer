package Arithmetic2;

public class Problem_56 {

	public static ListNode deleteDuplication(ListNode pHead){
		if(pHead == null)
			return null;
		
		ListNode pro = new ListNode(0);
		pro.next = pHead;
		ListNode cur = pHead;
		ListNode next = pHead.next;
		
		while(next != null){
			if(cur.val == next.val){
				while(next!=null && cur.val == next.val)
					next = next.next;
				if(cur==pHead)
					pHead = next;
				pro.next = next;
				cur = next;
			}else{
				pro = cur;
				cur = next;
			}
			
			if(cur!=null)
				next = cur.next;
		}
		return pHead;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList list = new MyLinkedList();
		int[] a = {1,2,3,3,4,4,5};
		list.addAll(a);
		MyLinkedList.printList(deleteDuplication(list.head));
	}

}
