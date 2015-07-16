package Arithmetic2;

public class Problem_12 {

	public static ListNode FindKthToTail(ListNode head,int k) {
        if(head == null || k<0)
            return null;
		ListNode slow = head;
        ListNode fast = head;
        
        for(int i=0;i<k;i++){
            fast = fast.next;
        }
        
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5};
		MyLinkedList list = new MyLinkedList();
		list.addAll(a);
		System.out.print(FindKthToTail(list.head, 1).val);
	}

}
