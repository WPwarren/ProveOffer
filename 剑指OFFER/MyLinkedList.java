package Arithmetic2;

public class MyLinkedList 
{
	public ListNode head = null;
	public void addListNode(int val)
	{
		ListNode newListNode = new ListNode(val);
		if(head == null)
		{
			head = newListNode;
			return;
		}
		ListNode currListNode = head;
		while(currListNode.next != null)
		{
			currListNode = currListNode.next;
		}
		currListNode.next = newListNode;
	}
	
	public void addAll(int[] array){
		for(int i=0;i<array.length;i++){
			addListNode(array[i]);
		}
	}
	
	public Boolean deleteListNode(int index)
	{
		if(index<1 || index>length())
			return false;
		if(index == 1)
		{
			head = head.next;
			return true;
		}
		int i=1;
		ListNode proListNode = head;
		ListNode curListNode = head.next;
		while(i != index)
		{
			proListNode = curListNode;
			curListNode = curListNode.next;
			i++;
		}
		proListNode.next = curListNode.next;
		return true;
	}
	
	public int length()
	{
		int len=0;
		ListNode temp=head;
		while(temp != null)
		{
			len++;
			temp = temp.next;
		}
		return len;
	}
	
	public ListNode orderList()
	{
		ListNode curListNode = head;
		ListNode nextListNode = null;;
		int temp = 0;
		while(curListNode.next != null)
		{
			nextListNode = curListNode.next;
			while(nextListNode != null)
			{
				if(curListNode.val > nextListNode.val)
				{
					temp = curListNode.val;
					curListNode.val = nextListNode.val;
					nextListNode.val = temp;
				}
				nextListNode = nextListNode.next;
			}
			curListNode = curListNode.next;
		}
		return head;
	}
	
	public static void printList(ListNode head)
	{
		ListNode curListNode = head;
		while(curListNode!= null)
		{
			System.out.print(curListNode.val+" ");
			curListNode = curListNode.next;
		}
	}
	
	
}
