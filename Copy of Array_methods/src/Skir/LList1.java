package Skir;

public class LList1 implements EList {
	public Node first;//ссылка на первый элемент списка
	private boolean length0=true;

	public LList1()
	{
		first=null;//инициализация first, если first=null, список не содержит элементов
	}

	class Node
	{
		private int value;
		private Node next;

		private Node(int value)
		{
			this.value=value;
		}
	}

	@Override
	public void init(int [] arr)
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
		first=null;
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
		Node tmp =first;

		while (tmp!=null)
		{
			ret++;
			tmp=tmp.next;

		}
		return ret;

	}

	@Override
	public int[] ToArray()
	{
		int[] arr;
		if (length0)
		{
			arr=new int[0];
		}
		else 
		{
			arr = new int[size()];
			Node tmp =first;
			int i =0;
			while (tmp!=null)
			{
				arr[i++]=tmp.value;
				tmp=tmp.next;
			}
		}
		return arr;
	}

	// array print
	@Override
	public void print() 
	{
		Node tmp= first;

		while (tmp!=null)
		{
			System.out.print(tmp.value+ " ");
			tmp=tmp.next;
		}

	}

	@Override
	public void AddStart(int val)
	{
		length0=false;
		Node tmp = new Node(val);
		tmp.next=first;// полю next созданного элемента присваивается ссылка на предыдущий элемент, хранящаяся в first; 
		first=tmp;// ссылка на первый элемент изменяется, так что бы она указывала на новый элемент
	}

	@Override
	public void AddEnd(int val)
	{
		if (size()==0)
		{
			AddStart(val);
		}
		else
		{
			Node tmp=first;// создается ссылка на которую указывает first

			while (tmp.next!=null)
			{
				tmp=tmp.next;// до тех пор пока пока поле next не null tmp присваивается поле next предыдущего элемента
			}
			tmp.next=new Node(val);// полю next бывшего последнего элемента присваивается ссылка на новый узел с переданным val
		}
	}

	@Override
	public void AddPos(int pos,int val)
	{
		if (length0 || pos>size()-1)
		{
			throw new IllegalArgumentException();
		}
		if (size()==1)
		{
			AddStart(val);
		}
		else
		{
			Node tmp=first;// создание ссылки,эквивалентой тому ноду, на который ссылается first
			Node tmp_val = new Node(val);// создание нового элемента на основании val
			for (int i =1;i<pos;i++) 
			{
				tmp=tmp.next; // до тех пор пока пока поле next не ссылкается на элемент с pos, tmp присваивается поле next предыдущего элемента
			}
			tmp_val.next=tmp.next;//полю next созданного объекта присваивается поле next которое указывает на элемент (pos+1)
			tmp.next=tmp_val;// полю next элемента pos присваивается ссылка на вставленный элемент
		}

	}
	@Override
	public void Delstart()
	{

		if (length0)
		{
			throw new IllegalArgumentException();
		}
		first=first.next;	//полю first присваивается ссылка на поле nextб указывающее на след. элемент
	}


	@Override
	public void DelEnd()
	{
		if (length0)
		{
			throw new IllegalArgumentException();
		}
		if (size()==1)
		{
			first=null;
			length0=true;
		}
		else
		{
			Node tmp = first;// создается новая ссылка эквивалентная first
			Node tmp_prev = null;// создается ссылка указывающая на null

			while(tmp.next!=null)//до тех пор пока поле next указывает на другой элемент (не null)
			{
				tmp_prev=tmp; //созданная ссылка равна ссылке на tmp
				tmp=tmp.next;// tmp равно след. элементу
			}
			tmp_prev.next=null; //ссылка предпоследнего элемента указывает на null
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
		else
		{
			Node tmp = first;// 
			Node tmp1 = null;

			for (int i =0;i<pos;i++)
			{
				tmp1=tmp;
				tmp=tmp.next;

			}
			tmp1.next=tmp.next;
		}

	}


	@Override
	public int GetPos(int pos)
	{
		if (length0 || pos>size()-1)
		{
			throw new IllegalArgumentException();
		}
		Node tmp = first;
		for (int i=0;i<pos;i++)
		{
			tmp=tmp.next;
		}
		return tmp.value;
	}

	@Override
	public void SetPos(int pos,int val)
	{
		if (length0 || pos>size()-1)
		{
			throw new IllegalArgumentException();
		}

		Node tmp = first;

		for (int i=0;i<pos;i++)
		{
			tmp=tmp.next;
		}
		tmp.value=val;

	}

	@Override
	public int max()
	{

		if (length0)
		{
			throw new IllegalArgumentException();
		}

		int ret = first.value;
		Node tmp= first.next;
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
	public int min()
	{

		if (length0)
		{
			throw new IllegalArgumentException();
		}


		int ret = first.value;
		Node tmp= first.next;
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
		int ret = first.value;
		Node tmp= first.next;
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
	public int min_index()
	{
		if (length0)
		{
			throw new IllegalArgumentException();
		}
		int ret = first.value;
		Node tmp= first.next;
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
	public void reverse()
	{

		if (length0)
		{
			return;
		}
		Node reversedPart=null;
		Node curr_el=first;

		while (curr_el!=null)
		{
			Node next= curr_el.next;
			curr_el.next=reversedPart;
			reversedPart=curr_el;
			curr_el=next;
		}
		first=reversedPart;
	}


	@Override
	public void half_reverse()
	{
		if (length0 || size()==1)
		{
			return;
		}
		Node current = first;

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
		current.next=first;
		first=New_first;	
	}	




@Override
public void bubble_sorting() 
{

	if (length0)
	{
		return;
	}
	for (int i = size() - 1; i >= 1; i--)
	{
		boolean sorted = true;
		for (int j = 0; j < i; j++)
		{
			if (GetPos(j) > GetPos(j + 1))
			{
				int temp = GetPos(j);
				SetPos(j, GetPos(j + 1));
				SetPos(j + 1, temp);
				sorted = false;
			}
		}
		if (sorted)
		{
			break;
		}
	}

}
	

	@Override
	public void insert_sorting() {
		Node prev =null;
		Node curr = first;
		
		
	
		
	}
}


