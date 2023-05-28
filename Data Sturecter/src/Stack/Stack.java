package Stack;

public class Stack {

  static int [] stack;
  static int top;
  static void createStack(int size)
  {
	  stack=new int[size];
	  top=-1;
	  System.out.println("Stack is Created successfuly with size:"+size);
  }
  static void push(int ele)
  {
	  if(top==stack.length-1)
	  {
		  System.out.println("Static OverFlow.....!!!!!!");
	  }
	  else
	  {
		  top++;
		  stack[top]=ele;
		  System.out.println(ele+"is inserted successfuly");
	  }
  }
  static void pop()
  {
	 if(top==-1)
	 {
		 System.out.println("StackUnderFlow.....!!!!!!");
	 }
	 else
	 {
		 System.out.println(stack[top]+"has be popped/deleted....!!!");
		 stack[top]=0;
		 top--;
	 }
  }
  static boolean isEmpty()
  {
	  if(top==-1)
	  {
		  return true;
	  }
	  else
	  {
		  return false;
	  }
  }
  static boolean isFull()
  {
	  if(top==stack.length-1)
	  {
		  return true;
	  }
	  return false;
  }
	public static void main(String[] args) 
	{
		createStack(5);
		 push(10);
		 push(20);
		 push(30);
		 push(40);
		 push(50);
		 push(60);
		 pop();
		 pop();
		 pop();
		 pop();
		 pop();
		 pop();
		 System.out.println(isEmpty());
		 System.out.println(isFull());

	}

}
