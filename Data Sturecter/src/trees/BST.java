package trees;

public class BST {

	static class Node
	{
		int data;
		Node left,right;
		Node(int value)
		{
			data=value;
		}
	}
	static void insert(Node n,int value)
	{
		if(n.data>value)
		{
			if(n.left!=null)
			{
				insert(n.left,value);
			}
			else
			{
				System.out.println("Inserted "+value+"  Towords Left of "+n.data);
				n.left=new Node(value);
			}
		}
		else if(n.data<value)
		{
			if(n.right!=null)
			{
				insert(n.right,value);
			}
			else
			{
				System.out.println("Inserted "+value+"  Towords Right of "+n.data);
				n.right=new Node(value);
			}
		}
	}
	static void inOrder(Node n)
	{
		if(n!=null)
		{
			inOrder(n.left);
			System.out.print(n.data+" ");
			inOrder(n.right);
		}

	}
	static void preOrder(Node n)
	{
		if(n!=null)
		{
			System.out.print(n.data+" ");
			preOrder(n.left);
			preOrder(n.right);
		}
	}
	static void postOrder(Node n)
	{
		if(n!=null)
		{
			postOrder(n.left) ;
			postOrder(n.right);
			System.out.print(n.data+" ");
		}
	}
	public static void main(String[] args) 
	{
		//      Node root=new Node(5);
		//      insert(root,3);
		//      insert(root,2);
		//      insert(root,7);
		//      insert(root,6);
		//      insert(root,8);
		int [] n= {70,18,7,19,90,80,96,101,17,77,86};
		Node root = new Node(n[0]);
		for(int i=1;i<n.length;i++)
		{
			insert(root,n[i]);
		}
		System.out.println("===============INORDER TRAVERSING=================");
		inOrder(root);
		System.out.println();
		System.out.println("===============PREORDER TRAVERSING================");
		preOrder(root);
		System.out.println();
		System.out.println("===============POSTORDER TRAVERSING===============");
		postOrder(root);

	}

}
