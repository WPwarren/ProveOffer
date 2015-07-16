package Arithmetic2;

public class Problem_14 {

	public static ListNode ReverseList(ListNode head){
		ListNode pro = null;
		ListNode cur = head;
		ListNode next = head.next;
		while(next!=null){
			cur.next = pro;
			pro = cur;
			cur = next;
			next = next.next;
		}
		cur.next = pro;
		return cur;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList list = new MyLinkedList();
		int[] a = {1,2,3,4,5,6,7};
		list.addAll(a);
		list.printList(ReverseList(list.head));
	}

}
