package LinkedList;

public class LinkedList 
{
	Node head;
	void insert(int ele)
	{
		Node n = new Node(ele);
		if(head==null)
		{
			head=n;
		}
		else
		{
			Node temp=head;
			while(temp.next != null)
			{
				temp=temp.next;
			}
			temp.next=n;	
		}
		System.out.println("Node Added with Value: "+ele);
	}
	void display()
	{
		if(head==null)
		{
			System.out.println("LinkedList Empty...!!!");
		}
		else
		{
			System.out.println("===LinkedList Elements Are===");
			Node temp = head;
			while(temp.next != null)
			{
				System.out.println(temp.data);
				temp=temp.next;
			}
			System.out.println(temp.data);
			System.out.println("=============================");
		}
	}
	void delete(int ele)
	{
		Node temp = head,prev=null;
		if(temp!=null && temp.data==ele)
		{
			System.out.println(temp.data);
			head=temp.next;
		}
		while(temp != null && temp.data!=ele)
		{
			prev=temp;
			temp=temp.next;
		}
		if(temp==null)
		{
			System.out.println(temp.data);
			prev.next=temp.next;
		}
	}
}
