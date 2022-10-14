import java.util.Scanner;
class Stack
{
	int arr[];
	int top;
	int size;
	Stack(int l)
	{
		arr = new int[l];
		size = l;
		top = -1;
	}
	void push(int x)
	{
		if(isFull())
		{
			System.out.println("Stack is full");
			System.exit(-1);
		}
		System.out.println("Pushed " + x);
		arr[++top] = x;
	}
	int pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack is empty");
			System.exit(-1);
		}
		System.out.println("Popped");
		return arr[top--];
	}
	int peek()
	{
		if(!isEmpty())
			return arr[top];
		else{
			System.out.print("Stack is empty");
			System.exit(-1);
			return -1;
		}
	}
	boolean isEmpty()
	{
		return top == -1;
	}
	boolean isFull()
	{
		return top == size - 1;
	}
}
public class StackDemo
{
	public static void main(String s[])
	{
		int l, n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of stack: ");
		l = sc.nextInt();
		Stack stack = new Stack(l);
		System.out.print("Enter number to be pushed: ");
		n = sc.nextInt();
		stack.push(n);
		System.out.println("Top: " + stack.peek());
		System.out.print("Enter number to be pushed: ");
		n = sc.nextInt();
		stack.push(n);
		System.out.println("Top: " + stack.peek());
		stack.pop();
		System.out.println("Top: " + stack.peek());
		System.out.print("Enter number to be pushed: ");
		n = sc.nextInt();
		stack.push(n);
		System.out.println("Top: " + stack.peek());
	}
}
