package LinkedList;

public class Main 
{
	public static void main(String[] args) 
	{
		LinkedList l = new LinkedList();
		l.insert(12);
		l.insert(25);
		l.insert(35);
		l.insert(44);
		l.display();
		l.insert(55);
		l.insert(66);
		l.display();
		l.delete(12);
		l.display();
		l.delete(25);
		l.display();
	}
}
