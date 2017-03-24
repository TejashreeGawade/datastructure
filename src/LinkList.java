import java.awt.List;

public class LinkList {
	
	//private LinkNode head;
	private Object next;
	
	//1) Print total elemnts of link list
	public void display(LinkNode head)
	{
		if(head==null)
		{
			return;
		}
		LinkNode current=head;
		while(current!=null)
		{
			System.out.print(current.data+"-->");
			current=current.next;
		}
		System.out.print(current);
	}
	
	//2) Find total length of Link List
	
	public int printLength(LinkNode head)
	{
		if(head==null)
		{
			return 0;
		}
		//Count variable to count the elements
		int count=0;
		LinkNode current=head;
		while(current!=null)
		{
			count++;
			current=current.next;
		}
		return count;
	}
	
	//3) Insert Node at the Beggining
	public LinkNode insertAtBegining(LinkNode head, int data)
	{
		LinkNode newNode=new LinkNode(data);
		if(head==null)
		{
			return newNode;
		}
		newNode.next=head;
		head=newNode;
		return head;
	}
	//4)Insert the node at the END
	public LinkNode insertAtEnd(LinkNode head, int data)
	{
		LinkNode newLastNode= new LinkNode(data);
		if(head==null)
		{
			return newLastNode;
		}
		LinkNode current=head;
		while(current.next!=null)
		{
			current=current.next;
			
		}
		current.next=newLastNode;
		return head;
	}
	//5)Insert Node At Position
	
	public LinkNode insertAtPos(LinkNode head, int data, int pos)
	{
		int size=printLength(head);
		if(pos>size+1 || pos<1)
		{
			System.out.println("You Have Enterd Invalid Data");
			return head;
		}
		LinkNode newNode=new LinkNode(data);
		if(pos==1)
		{
			newNode.next=head;
			return newNode;
		}
		else{
			LinkNode previous=head;
			int count=1;
			while(count<pos-1)
			{
				previous=previous.next;
				count++;
			}
			LinkNode current=previous.next;
			newNode.next=current;
			previous.next=newNode;
			return head;
		}
	}
	//7)Search the Element in given Link List
	public boolean search(LinkNode head, int searchkey)
	{
		if(head==null)
		{
			return false;
		}
		LinkNode current=head;
		while(current!=null)
		{
			if(current.data==searchkey)
			{
				return true;
			}
			current=current.next;
		}
		return false;
	}
	//8)Delete Node by Given Position
	public LinkNode deleteByPos(LinkNode head, int pos)
	{
		int size=printLength(head);
		if(pos>size||pos<1)
		{
			System.out.println("You have Entered Invalid POsition");
			return head;
		}
		if(pos==1)
		{
			LinkNode temp=head;
			head=head.next;
			temp.next=null;
			return head;
		}
		else{
			LinkNode previous=head;
			int count=1;
			while(count<pos-1)
			{
				previous=previous.next;
				count++;
			}
			LinkNode current=previous.next;
			previous.next=current.next;
			current.next=null;
			return current;
		}
	}
	
	//9) Delete First Node form Link List
	public LinkNode deleteFirst(LinkNode head)
	{
		if(head==null)
		{
			return head;
		}
		LinkNode temp=head;
		head=head.next;
		temp.next=null;
		return temp;
	}
	
	//) Delete Last Node from link list
	public LinkNode deleteLast(LinkNode head)
	{
		if(head==null)
		{
			return head;
		}
		LinkNode last=head;
		LinkNode previousToLast=null;
		while(last.next!=null)
		{
			previousToLast=last;
			last=last.next;
		}
		previousToLast.next=null;
				return last;
	}
	//Node class
	private static class LinkNode{
		
		private int data;
		private LinkNode next;
	
	public LinkNode(int data)
	{
		this.data=data;
		this.next=null;
	}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create the Link list
		LinkNode head=new LinkNode(10);
		LinkNode second=new LinkNode(8);
		LinkNode third=new LinkNode(1);
		LinkNode fourth=new LinkNode(9);
		
		head.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=null;
			
		//Print All Elements of Link List
		LinkList llobj=new LinkList();
		llobj.display(head);
		
		//Find the total Length of Link List
		System.out.println();
		System.out.println("Total Length is:-"+llobj.printLength(head));
		System.out.println();

		
		//Insert at beggining
		LinkNode newHead=llobj.insertAtBegining(head, 12);
		llobj.display(newHead);
		System.out.println();

		System.out.println("Total Length is:-"+llobj.printLength(newHead));
		System.out.println();
		
		//Insert at End
				LinkNode newLast=llobj.insertAtEnd(newHead, 23);
				llobj.display(newLast);
				System.out.println();

				System.out.println("Total Length is:-"+llobj.printLength(newHead));
				System.out.println();
				
		//Insert At POsition
				newHead=llobj.insertAtPos(newHead, 32, 3);
				llobj.display(newHead);
				System.out.println();
				
				System.out.println("Total Length is:-"+llobj.printLength(newHead));
				System.out.println();
		
		//Search Key Element
				if(llobj.search(newHead, 8))
				{
					System.out.println("Search key is Found");
					System.out.println();
				}
				else
				{
					System.out.println("Search key Not Found");
					System.out.println();
				}
		//Delete By Position
				newHead=llobj.deleteByPos(newHead, 2);
				llobj.display(newHead);
				System.out.println();
				
				System.out.println("Total Length is:-"+llobj.printLength(newHead));
				System.out.println();
		
		//Delete First Node
				LinkNode first=llobj.deleteFirst(newHead);
				System.out.println("The First Deleted Node is:- "+first.data);
				
		
				
	}

}
