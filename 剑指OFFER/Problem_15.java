package Arithmetic2;

public class Problem_15 {

	public static ListNode Merge(ListNode list1,ListNode list2){
		if(list1 == null && list2 == null)
			return null;
		if(list1 == null && list2 != null)
			return list2;
		if(list1 != null && list2 == null)
			return list1;
		ListNode temp1 = list1;
		ListNode temp2 = list2;
		while(temp1!=null && temp2 !=null){
			while(temp1.next!=null && temp1.next.val<temp2.val)
				temp1 = temp1.next;
			if(temp1.next!=null){
				ListNode addNode = temp2;
				temp2 = temp2.next;
				addNode.next = temp1.next;
				temp1.next = addNode;
			}
		}
		return list1;
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
