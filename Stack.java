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
	void insertafter(int key,int data)
	{
		if(start==null)
		{
			System.out.print("EMPTY");
			return;
		}
		Node ptr=start;
		while(ptr!=null)
		{
			if(ptr.data==key)
			{
				Node newnode=new Node(data);
				newnode.next=ptr.next;
				ptr.next=newnode;
				return;
			}
			ptr=ptr.next;
		}
		System.out.print("KEY NOT FOUND");
	}
	void insertlast(int data)
	{
		Node newnode=new Node(data);
		if(start==null)
		{
			start=newnode;
			return;
		}
		Node ptr=start;
		while(ptr.next!=null)
			ptr=ptr.next;
		ptr.next=newnode;
	}
	void deletelast()
	{
		if(start==null)
		{
			System.out.println("EMPTY");
			return;
		}
		if(start.next==null)
		{
			start=null;
			return;
		}
		Node ptr=start;
		while(ptr.next.next!=null)
		{
			ptr=ptr.next;
		}
		ptr.next=null;
	}
	void deletekey(int key)
	{
		Node ptr=start;
		while(ptr!=null)
		{
			if(ptr.next.data==key)
			{
				ptr.next=ptr.next.next;
				return;
			}
			ptr=ptr.next;
		}
		System.out.println("KEY NOT FOUND");
	}

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
				
                         case 4:
				System.out.println("ENTER KEY: ");
				int key=s.nextInt();
				System.out.println("ENTER DATA: ");
				int d=s.nextInt();
				o.insertafter(key,d);
				break;
			case 5:
				System.out.println("ENTER THE DATA: " );
				int x=s.nextInt();
				o.insertlast(x);
				break;
			case 6:
				o.deletelast();
				break;
			case 7:
				System.out.println("ENTER THE KEY: ");
				int j=s.nextInt();
				o.deletekey(j);
				break;

			}
		}
		while(ch<8);
	}
}
