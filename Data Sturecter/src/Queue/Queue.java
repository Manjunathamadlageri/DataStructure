package Queue;

public class Queue {
	static int [] queue;
	static int front,rear,capacity;
	static void createQueue(int size)
	{
		queue=new int [size];
		front=0;
		rear=0;
		capacity=0;
		System.out.println("queue has been created with size of :"+size);
	}
	static void enqueue(int ele)
	{
		if(rear==queue.length)
		{
			System.out.println("Queue is Empty....!!!!");
		}
		else
		{
			queue[rear]=ele;
			rear++;
			capacity++;
			System.out.println(ele+"has be added successfully..!!!!");
		}
	}
	static void dequeue()
	{
		if(rear==0)
		{
			System.out.println("Queue is Empty....!!!!");
		}
		else
		{
			System.out.println(queue[0]+" :get deleted ..!!!");
			for(int i=0;i<rear-1;i++)
			{
				queue[i]=queue[i+1];
			}
			rear--;
			capacity--;
		}
	}
	static void display()
	{
		if(rear==0)
		{
			System.out.println("Queue is Empty....!!!!");
		}
		else
		{
			System.out.println("=== Queue Elements Are ===");
			for(int i=front;i<rear;i++)
			{
				System.out.print(queue[i]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
      createQueue(5);
      enqueue(5);
      enqueue(10);
      enqueue(20);
      enqueue(30);
      enqueue(40);
      display();
      dequeue();
      display();
      

	}

}
