package Arithmetic2;

import java.util.ArrayList;

public class Problem_06 {

//	public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
//        
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        if(listNode == null)
//            return list;
//    	ListNode pro = null;
//        ListNode cur = listNode;
//        ListNode next = listNode.next;
//        while(next != null){
//            pro = cur;
//            cur = next;
//            next = next.next;
//            cur.next = pro;
//        }
//        listNode.next = null;
//        while(cur!=null){
//            list.add(cur.val);
//            cur = cur.next;
//        }
//        return list;
//    }
	public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<Integer>();
    	ReversePrint(listNode,list);
        return list;
    }
    
    public static void ReversePrint(ListNode listNode,ArrayList<Integer> list){
        if(listNode!=null){
            if(listNode.next != null)
            	ReversePrint(listNode.next,list);
            list.add(listNode.val);
        }
    }
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8};
		MyLinkedList list = new MyLinkedList();
		list.addAll(a);
//		list.printList();
		System.out.print(printListFromTailToHead(list.head));
	}

}
