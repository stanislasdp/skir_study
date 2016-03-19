package Skir;


public class AList0 implements EList {



	private int[] ar = {};

	public AList0()
	{
		ar=new int[0];
	}

	public AList0(int[] init_arr)
	{
		init(init_arr);
	}

	//	array init
	public void init (int[] ini)
	{
		this.ar=new int[ini.length];

		for (int i =0;i<ini.length;i++)
		{
			ar[i]=ini[i];
		}
	}



	//	clear
	public void clear()
	{
		int [] tmp = new int[0];
		ar=tmp;
	}


	//array size
	public int size ()
	{
		return ar.length;
	}


	// array print
	public void print() {
		for (int i:ar) 
		{
			System.out.print(i+", ");
		}
		System.out.println(" ");
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
	public void AddStart(int str)
	{

		int[] tmp = new int[size()+1];
		tmp[0]=str;

		for (int i=0;i<size();i++)
		{
			tmp[i+1]=ar[i];
		}
		ar=tmp;

	}

	//	add end
	public void AddEnd(int end_1)
	{

		int[] tmp = new int[size()+1];
		tmp[size()]=end_1;

		for (int i=0;i<size();i++)
		{
			tmp[i]=ar[i];
		}
		ar=tmp;
	}


	//	add pos
	public void AddPos(int pos,int val)
	{
		if (size()==0 || pos>size())
		{
			throw new IllegalArgumentException();

		}

		int[] tmp = new int[size()+1];


		for (int i=0;i<pos;i++)
		{
			tmp[i]=ar[i];
		}
		tmp[pos]=val;

		for (int i=pos+1;i<(size()+1);i++)
		{
			tmp[i]=ar[i-1];
		}

		ar=tmp;
	}

	//	del start
	public void Delstart()
	{
		if (size()==0)
		{
			throw new IllegalArgumentException();

		}

		int[] tmp = new int[size()-1];

		for (int i=0;i<size()-1;i++)
		{
			tmp[i]=ar[i+1];
		}
		ar=tmp;
	}

	// del end	
	public void DelEnd()
	{
		if (size()==0)
		{
			throw new IllegalArgumentException();

		}

		int[] tmp = new int[size()-1];

		for (int i=0;i<size()-1;i++)
		{
			tmp[i]=ar[i];
		}
		ar=tmp;
	}
	//	del pos
	public void Delpos(int pos)
	{
		if (size()==0 || pos>size())
		{
			throw new IllegalArgumentException();
		}
		int [] tmp = new int [size()-1];
		for (int i =0;i<pos;i++)
		{
			tmp[i]=ar[i];
		}

		for (int i=pos;i<size()-1;i++)
		{
			tmp[i]=ar[i+1];

		}
		ar=tmp;
	}

	//get pos

	public int GetPos(int pos)
	{
		int pos_elem;
		if (size()==0 || pos>size())
		{
			throw new IllegalArgumentException();

		}
		return pos_elem=ar[pos];

	}

	public void SetPos(int pos,int value)
	{

		if (size()==0 || pos>size())
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
			if (ar[i]>ret)
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
		{
			throw new IllegalArgumentException();
		}
		int ret = ar[0];
		int count_index=0;
		for (int i =1;i<size();i++)
		{
			if (ar[i]<=ret)
			{
				ret=ar[i];
				count_index=i;
			}
		}
		return count_index;
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





