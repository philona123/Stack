import java.util.*;
class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
	}
}
class operation
{
	Node start;
	void insertfirst(int d)
	{
		Node newnode=new Node(d);
		newnode.next=start;
		start=newnode;
	}
	void deletefirst()
	{
		start=start.next;
	}
	void traversal()
	{
		Node ptr=start;
		if(ptr==null)
		{
			System.out.print("EMPTY LIST");
			return;
		}
		while(ptr!=null)
		{
			System.out.print(ptr.data+" ");
			ptr=ptr.next;
		}
		System.out.println();
	}
	//Functions for queue
}
class Stack
{
	public static void main(String args[])
	{
		int ch;
		Scanner s=new Scanner(System.in);
		operation o=new operation();
		do
		{
			System.out.print("ENTER CHOICE 1.INSERTFIRST 2.DELETEFIRST 3.TRAVERSAL 4.INSERTAFTER 5.INSERTLAST 6.DELETELAST 7.DELETEKEY 8.EXIT: ");
			ch=s.nextInt();
			switch(ch)
			{
				case 1:
				System.out.println("ENTER DATA: ");
				int data=s.nextInt();
				o.insertfirst(data);
				break;
				case 2:
				o.deletefirst();
				break;
				case 3:
				o.traversal();
				break;
        
				//case4,5,6,7

			}
		}
		while(ch<8);
	}
}
