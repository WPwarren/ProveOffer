package Arithmetic2;


public class Problem_36 {

	public static ListNode FindFirstCommonNode(ListNode pHead1,ListNode pHead2){
		if(pHead1 == null || pHead2 == null)
			return null;
		ListNode temp1 = pHead1;
		ListNode temp2 = pHead2;
		int len1 = 0;
		int len2 = 0;
		while(temp1 != null){
			len1++;
			temp1 = temp1.next;
		}
		while(temp2 != null){
			len2++;
			temp2 = temp2.next;
		}
		int distance = Math.abs(len1-len2);
		temp1 = pHead1;
		temp2 = pHead2;
		if(len1 > len2){
			while(distance != 0){
				temp1 = temp1.next;
				distance--;
			}
		}else{
			while(distance != 0){
				temp2 = temp2.next;
				distance--;
			}
		}
		
		while(temp1!=null && temp2!= null){
			if(temp1.val == temp2.val){
				break;
			}
			temp1 = temp1.next;
			temp2 = temp2.next;
		}
		return temp1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList list1 = new MyLinkedList();
		MyLinkedList list2 = new MyLinkedList();
		int[] a1 = {1,2,3,6,7};
		int[] a2 = {4,5,6,7};
		list1.addAll(a1);
		list2.addAll(a2);
		MyLinkedList.printList(FindFirstCommonNode(list1.head,list2.head));
	}

}
