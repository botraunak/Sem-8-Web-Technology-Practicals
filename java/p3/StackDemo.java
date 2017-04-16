/*
*	Implement an `abstract` Class Stack with methods push, pop, display for two classes: `StaticStack` and `DynamicStack`. StaticStack uses one dimensional integer array to store numbers and DynamicStack uses an integer `ArrayList` to store.
*/
import java.util.*;
// Defining abstract class Stack
abstract class Stack{
	
	abstract void push(int el);
	abstract int pop();
}
// Defining StaticStack
class StaticStack extends Stack
{
	private int stack[];
	private int top;
	StaticStack(int size)
	{
		stack=new int[size];
		top=-1;
	}
	void push(int el)
	{
		if(top<stack.length-1)
		{
			stack[++top]=el;
			System.out.println(top);
		}
		else{
			System.out.println("Stack is Overflow");
		}
	}
	int pop()
	{
		if(top==-1)
		{
			System.out.println("Stack is Underflow");
			return -1;
		}
		else{
			return stack[top--];
		}
	}
}
// Defining DynamicStack
class DynamicStack extends Stack{
	private ArrayList<Integer> stack;
	private int top=-1;
	DynamicStack()
	{
	  stack=new ArrayList<Integer>();	
	}
	void push(int el)
	{
		stack.add(el);
		top++;
	}
	int pop(){
		if(top==-1)
		{System.out.println("Stack is Underflow");
			return -1;}
		return stack.remove(top--);
	}
}
class StackDemo
{
	public static void main(String args[])
	{
		StaticStack s=new StaticStack(1);
		s.push(10);
		s.push(20);
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		DynamicStack s1=new DynamicStack();
		s1.push(30);
		s1.push(40);
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
	}
}