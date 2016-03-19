package Skir;

import Skir.LList1.Node;

public class Llist2 implements EList 
{
	boolean length0=true;
	Node root=null;
	Node end = null;

	class Node
	{
		 int value;
		 Node next;
		 Node prev;

		 Node(int value)
		{
			this.value=value;
		}
	}

	@Override
	public void init(int[] arr) 
	{

		if (arr==null)
		{
			arr=new int[0];
		}
		else
		{
			for (int i= arr.length-1;i>=0;i--)
			{
				AddStart(arr[i]);
			}
		}
	}

	@Override
	public void clear() 
	{
		root=null;
		end=null;
		length0=true;		

	}

	@Override
	public int size() 
	{
		int ret = 0;
		if (length0)
		{
			return ret;
		}
		Node tmp =root;

		while (tmp!=null)
		{
			ret++;
			tmp=tmp.next;

		}
		return ret;
	}

	@Override
	public void print() {
		Node tmp= root.next;

		while (tmp.next!=null)
		{
			System.out.println(tmp.value+ " ");
		}

	}

	@Override
	public int[] ToArray() {
		int[] arr;
		if (length0)
		{
			arr=new int[0];
		}
		else 
		{
			arr = new int[size()];
			Node tmp =root;
			int i =0;
			while (tmp!=null)
			{
				arr[i++]=tmp.value;
				tmp=tmp.next;
			}
		}
		return arr;
	}

	@Override
	public void AddStart(int val) 
	{
		Node tmp = new Node(val);

		if (length0)
		{
			root=tmp;
			end =tmp;
			length0=false;
		}
		else 
		{
			root.prev=tmp;
			tmp.next=root;
			root=tmp;
		}
	}

	@Override
	public void AddEnd(int val) 
	{

		if (size()==0)
		{
			AddStart(val);
			length0=false;
		}
		else
		{
			Node tmp = new Node(val);
			end.next=tmp;
			tmp.prev=end;
			end=tmp;
		}

	}

	//	не работает
	@Override
	public void AddPos(int pos, int val)
	{


		if (length0 || pos>size())
		{
			throw new IllegalArgumentException();
		}
		if (pos==0)
		{
			AddStart(val);
		}
		if (pos==size())
		{
			AddEnd(val);
		}
		else
		{
			Node insert_element = new Node(val);
			Node root_tmp=null;
			Node end_tmp =null;

			if (pos<=size()/2)
			{
				root_tmp=root;
				for (int i =1;i<pos;i++)
				{
					root_tmp=root_tmp.next;
				}
				insert_element.next=root_tmp.next;
				insert_element.next.prev=insert_element;
				insert_element.prev=root_tmp;
				root_tmp.next=insert_element;
			}
			else
			{
				end_tmp=end;
				for (int i =size();i>pos+1;i--)
				{
					end_tmp=end_tmp.prev;
				}
				insert_element.prev=end_tmp.prev;
				insert_element.prev.next=insert_element;
				insert_element.next=end_tmp;
				insert_element.prev=insert_element;
			}
		}
	}

	@Override
	public void Delstart() {

		if (length0)
		{
			throw new IllegalArgumentException();
		}
		if (root.next==null)
		{
			root=null;
			end=null;
		}
		else
		{
			root.next.prev=null;
			root=root.next;
		}

	}

	@Override
	public void DelEnd() 
	{
		if (length0)
		{
			throw new IllegalArgumentException();
		}

		if (root.next==null)
		{
			root=null;
			end=null;
		}
		else
		{
			end.prev.next=null;
			end=end.prev;
		}

	}

	@Override
	public void Delpos(int pos) 
	{

		if (length0 || pos>size()-1)
		{
			throw new IllegalArgumentException();
		}
		else if (pos==0)
		{
			Delstart();
		}
		else if (pos==size()-1)
		{
			DelEnd();
		}
		else
		{
			Node root_tmp=null;
			Node end_tmp =null;

			if (pos<size()/2)
			{
				root_tmp=root;
				for (int i =0;i<pos;i++)
				{
					root_tmp=root_tmp.next;
				}
				root_tmp.prev.next=root_tmp.next;
				root_tmp.next.prev=root_tmp.prev;
			}
			else 
			{
				end_tmp=end;
				for (int i =size();i>pos+1;i--)
				{
					end_tmp=end_tmp.prev;
				}
				end_tmp.next.prev=end_tmp.prev;
				end_tmp.prev.next=end_tmp.next;
			}
		}
	}

	@Override
	public int GetPos(int pos) {

		if (length0 || pos>size()-1)
		{
			throw new IllegalArgumentException();
		}
		int ret=0;;
		if (pos==0)
		{
			ret=root.value;
		}
		if (pos==size()-1)
		{
			ret=end.value;
		}
		else
		{
			Node root_tmp = root;
			Node end_tmp=end;
			if(pos<size()/2)
			{
				for (int i=0;i<pos;i++)
				{
					root_tmp=root_tmp.next;
				}
				ret=root_tmp.value;
			}
			else
			{
				for (int i=size();i>pos+1;i--)
				{
					end_tmp=end_tmp.prev;
				}
				ret=end_tmp.value;
			}

		}
		return ret;

	}

	@Override
	public void SetPos(int pos, int value)
	{
		if (length0 || pos>size()-1)
		{
			throw new IllegalArgumentException();
		}
		if (pos==0)
		{
			root.value=value;
		}
		if (pos==size()-1)
		{
			end.value=value;
		}
		else
		{
			Node root_tmp = root;
			Node end_tmp=end;
			if (pos<size()/2)
			{
				for (int i=0;i<pos;i++)
				{
					root_tmp=root_tmp.next;
				}
				root_tmp.value=value;
			}
			else 
			{
				for (int i=size();i>pos+1;i--)
				{
					end_tmp=end_tmp.prev;
				}
				end_tmp.value=value;

			}
		}
	}


	@Override
	public int max()
	{
		
		if (length0)
		{
			throw new IllegalArgumentException();
		}

		int ret = root.value;
		Node tmp= root.next;
		while (tmp!=null)
		{
			if (tmp.value>ret)
			{
				ret=tmp.value;
			}
			tmp=tmp.next;
		}

		return ret;

	}

	@Override
	public int min() {
		if (length0)
		{
			throw new IllegalArgumentException();
		}

		int ret = root.value;
		Node tmp= root.next;
		while (tmp!=null)
		{
			if (tmp.value<ret)
			{
				ret=tmp.value;
			}
			tmp=tmp.next;
		}

		return ret;
	}

	@Override
	public int max_index()
	{
		if (length0)
		{
			throw new IllegalArgumentException();
		}
		int ret = root.value;
		Node tmp= root.next;
		int maxindex=0;
		int counter=0;
		while (tmp!=null)
		{
			counter++;
			if (tmp.value>=ret)
			{	maxindex=counter;
			ret=tmp.value;		
			}
			tmp=tmp.next;
		}
		return maxindex;
	}

	@Override
	public int min_index() {
		if (length0)
		{
			throw new IllegalArgumentException();
		}
		int ret = root.value;
		Node tmp= root.next;
		int minindex=0;
		int counter=0;
		while (tmp!=null)
		{
			counter++;
			if (tmp.value<=ret)
			{	minindex=counter;
			ret=tmp.value;		
			}
			tmp=tmp.next;
		}
		return minindex;
	}

@Override
	public void reverse() {

		if (length0)
		{
			return;
		}
		
		Node current = root;
		while (current!=null)
		{
			Node tmp=current.next;
			current.next=current.prev;
			current.prev=tmp;
			current=tmp;
		}
		current=end;
		end=root;
		root=current;
	}
	
	

	@Override
	public void half_reverse() 
	{

		if (length0 || size()==1)
		{
			return;
		}
		Node current = root;

		Node New_first;
		for (int i=1;i<size()/2;i++)
		{
			current=current.next;
		}
		New_first=current.next;
		current.next=null;
		current=New_first;

		while (current.next!=null)
		{
			current=current.next;
		}
		current.next=root;
		root=New_first;
	}


	@Override
	public void insert_sorting() {
//		Node tmp_Next=fi
		

	}

	@Override
	public void bubble_sorting() {
		// TODO Auto-generated method stub

	}

		
	}




