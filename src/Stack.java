import java.util.Scanner;

public class Stack {
	static Scanner sc=new Scanner(System.in);
	static int stack[], top =-1,item=0,size=0,i;
	
	static
	{
		Stack.create();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		
		while(true)
		{
		System.out.println("1      :        Push");
		System.out.println("2      :        Pop");
		System.out.println("3      :        Peek");
		System.out.println("4      :        Traverse");
		System.out.println("5      :        Quit");
		
		System.out.println("Enter your choice :\n");
		ch=Stack.sc.nextInt();
			switch(ch)
			{
				case 1: System.out.println("Enter the stack elements");
				        item=Stack.sc.nextInt();
						Stack.push(item);
						break;
				case 2: item=Stack.pop();
						if(item==0)
						{
							System.out.println("Srack is Empty");
						}
						else
						{
							System.out.println("The Poped Element is:"+item);
						}
						break;
				case 3: item=Stack.peek();
						if(item==0)
						{
							System.out.println("Srack is Empty");
						}
						else
						{
							System.out.println("The Peek Element is:"+item);
						}
						break;
				case 4: Stack.traverse();
						break;
				case 5: System.exit(1);
				default: System.out.println("Invalid Choice:");
						
			}
		}
	}
	static void create()
	{
		//int size;
		System.out.println("Enter the Size of the Stack");
		size=Stack.sc.nextInt();
		Stack.stack= new int[size];
		System.out.println("Stack Created Successfully:"+size);
	}
	static void push(int item)
	{
		//System.out.println("The Size of Stack:"+size);
		if(Stack.isFull())
		{
			System.out.println("Stack is Overflow");
		}
		else
		{
			stack[++top]=item;
		}
	}
	static boolean isFull()
	{
		if(top==size-1)
		{
			return true;
		}
		
			return false;
		
	}
	static int pop()
	{
		if(Stack.isEmpty())
		{
			return 0;
		}
		else
		{
			return Stack.stack[top--];
		}
	}
	static boolean isEmpty()
	{
		if(top == -1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	static int peek()
	{
		if(Stack.isEmpty())
		{
			return 0;
		}
		else
		{
			return Stack.stack[top];
		}
	}
	static void traverse()
	{
		if(Stack.isEmpty())
		{
			System.out.println("Stack is Empty\n");
		}
		else
		{
			//System.out.println("Stack Elements are:\n");
			for(i=top;i>=0;i--)
			{
				System.out.println(Stack.stack[i]);
			}
		}
	}
}
