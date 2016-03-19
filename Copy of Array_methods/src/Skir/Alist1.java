package Skir;


public class Alist1 implements EList{

	private int[] ar = new int[10];
	private int top = 0;


	public Alist1()
	{
		ar=new int[10];
	}

	public Alist1(int[] init_arr)
	{
		init(init_arr);
	}

	//	array init
	public void init (int[] ini)
	{
		for (int i =0;i<ini.length;i++)
		{
			ar[i]=ini[i];
		}
		top=ini.length;
	}
	//	clear
	public void clear()
	{
		top = 0;
	}
	//array size
	public int size ()
	{
		return top;
	}


	// array print
	public void print() {
		for (int i=0;i<top;i++)
		{
			System.out.print(ar[i]+", ");
		}

	}

	// array_to_array
	public int[] ToArray()
	{
		int [] tmp = new int[size()];
		for(int i =0;i<size();i++)
		{
			tmp[i]=ar[i];
		}
		return tmp;
	}


	//	 add start
	public void AddStart(int val)
	{
		for (int i=top;i>0;i--)
		{
			ar[i]=ar[i-1];
		}
		ar[0] = val;
		top++;
	}

	//	add end
	public void AddEnd(int end_1)
	{

		ar[top++]=end_1;
	}


	//	add pos
	public void AddPos(int pos,int val)
	{
		if (size()==0 || pos>size())
		{
			throw new IllegalArgumentException();
		}
		for (int i=top;i>pos;i--)
		{
			ar[i]=ar[i-1];
		}
		ar[pos]=val;
		top++;
	}

	//	del start
	public void Delstart()
	{
		if (size()==0)
		{
			throw new IllegalArgumentException();
		}
		for (int i=0;i<size()-1;i++)
		{
			ar[i]=ar[i+1];
		}
		top--;
	}

	// del end	
	public void DelEnd()
	{
		if (size()==0)
		{
			throw new IllegalArgumentException();
		}
		top--;

	}
	//	del pos
	public void Delpos(int pos)
	{
		if (pos>top)
		{
			throw new IllegalArgumentException();
		}

		for (int i = pos;i<top;i++)
		{
			ar[i]=ar[i+1];
		}
		top--;
	}

	//get pos

	public int GetPos(int pos)
	{
		if (size()==0||pos>top)
		{
			throw new IllegalArgumentException();

		}
		return ar[pos];

	}

	public void SetPos(int pos,int value)
	{
		if (size()==0||pos>top)
		{
			throw new IllegalArgumentException();
		}

		ar[pos]=value;

	}

	// max element
	public int max()
	{

		if (size()==0)
		{
			throw new IllegalArgumentException();

		}
		int ret = ar[0];
		for (int i =1;i<size();i++)
		{
			if (ar[i]>=ret)
			{
				ret=ar[i];
			}
		}

		return ret;
	}

	// min element
	public int min()
	{


		if (size()==0)
		{
			throw new IllegalArgumentException();
		}
		int ret = ar[0];
		for (int i =1;i<size();i++)
		{
			if (ar[i]<ret)
			{
				ret=ar[i];
			}
		}

		return ret;
	}


	public int max_index()
	{

		if (size()==0)
		{
			throw new IllegalArgumentException();
		}
		int ret = ar[0];
		int count_index=0;
		for (int i =1;i<size();i++)
		{
			if (ar[i]>ret)
			{
				count_index=i;
			}
		}

		return count_index;
	}
	// min index
	public int min_index()
	{


		if (size()==0)
			throw new IllegalArgumentException();
		int count_1 = 0;
		int ret = ar[0];
		for (int i =1;i<size();i++)
		{
			if (ar[i]<=ret)
			{
				ret=ar[i];
				count_1=i;
			}
		}

		return count_1;
	}



	// reverse
	public void reverse()
	{
		for (int i =0;i<size()/2;i++)
		{
			int tmp =ar[i];
			ar[i]=ar[size()-i-1];
			ar[size()-i-1]=tmp;
		}
	}
	// half reverse
	public void half_reverse()
	{
		for(int i =0;i<size()/2;i++)
		{
			int tmp =ar[i];
			ar[i]=ar[size()/2+i+size()%2];
			ar[size()/2+i+size()%2]=tmp;
		}
	}
	//insert sorting
	public void insert_sorting()
	{
		int curr_element,prev_index;

		for (int i=1;i<size();i++)
		{
			curr_element=ar[i];
			prev_index=i-1;

			while(prev_index>=0 && ar[prev_index]>curr_element)
			{
				ar[prev_index+1]=ar[prev_index];
				ar[prev_index]=curr_element;
				prev_index--;
			}
		}

	}
	// bubble sorting
	public void bubble_sorting()
	{
		for (int i=0;i<size();i++)
		{
			for (int j=0;j<size()-i-1;j++)
			{
				if (ar[j]>ar[j+1])
				{
					int tmp=ar[j+1];
					ar[j+1]=ar[j];
					ar[j]=tmp;

				}
			}

		}
	}
}





