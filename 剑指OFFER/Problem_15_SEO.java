package Arithmetic2;

public class Problem_15_SEO {

	public static ListNode Merge(ListNode list1,ListNode list2){
		if(list1 == null)
			return list2;
		else if(list2 == null)
			return list1;
		ListNode head = null;
		if(list1.val < list2.val){
			head = list1;
			head.next = Merge(list1.next,list2);
		}else{
			head = list2;
			head.next = Merge(list1,list2.next);
		}
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList list1 = new MyLinkedList();
		int[] a1 = {1};
		list1.addAll(a1);
		MyLinkedList list2 = new MyLinkedList();
		int[] a2 = {2};
		list2.addAll(a2);
		ListNode head = Merge(list1.head,list2.head);
		list1.printList(head);
	}

}
