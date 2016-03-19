package Skir;

public class AList2 implements EList {

	public int[] ar = new int[30];
	public int start_el = 15;
	public int end_el=15;

	public AList2()
	{
		ar=new int[30];
	}

	public AList2(int[] init_arr)
	{
		init(init_arr);
	}

	
	public void init1(int[] ini) 
	{
		for (int i =0;i<ini.length;i++)
		{
			ar[end_el++]=ini[i];
		}
	}
	@Override
	public void init(int[] ini) 
	{
		start_el=start_el-ini.length/2;
		end_el=start_el+ini.length;
		
		for (int i =0;i<ini.length;i++)
		{
			ar[start_el+i]=ini[i];
		}
		
	}
	
	@Override
	public void clear() {
		start_el=ar.length/2;
		end_el=ar.length/2;

	}

	@Override
	public int size() {

		return end_el-start_el;
	}

	@Override
	public void print() {
		for (int i=start_el;i<end_el;i++)
		{
			System.out.print(ar[i]+", ");
		}
	}

	@Override
	public int[] ToArray() {

		int [] tmp = new int[size()];
		for(int i =0;i<size();i++)
		{
			tmp[i]=ar[start_el+i];
		}
		return tmp;
	}

	@Override
	public void AddStart(int val) {
		ar[--start_el]=val;
		//		or
		//	ar[start_el-1]=val;
		//		start_el--;

	}

	@Override
	public void AddEnd(int end_1) {
		ar[end_el++]=end_1;


	}

	@Override
	public void AddPos(int pos, int val) 
	{
		if (size()==0 || pos>size())
		{
			throw new IllegalArgumentException();
		}
		if (size()%2==0)
		{
			end_el++;
			for (int i=end_el;i>start_el+pos;i--)
			{
				ar[i]=ar[i-1];
			}
			ar[start_el+pos]=val;
		}
		
		else
		{
			for (int i=start_el;i>start_el+pos;i++)
			{
				ar[i]=ar[i+1];
			}
			ar[start_el+pos]=val;
			start_el--;
		}
			
			
	}

	@Override
	public void Delstart() 
	{
		if (size()==0)
		{
			throw new IllegalArgumentException();

		}
		start_el++;

	}

	@Override
	public void DelEnd() {
		if (size()==0)
		{
			throw new IllegalArgumentException();

		}

		end_el--;;
	}

	@Override
	public void Delpos(int pos) {
		if ( size()==0 || pos>size())
		{
			throw new IllegalArgumentException();
		}

		for (int i = pos;i<size();i++)
		{
			ar[start_el+i]=ar[start_el+i+1];
		}
		end_el--;

	}

	@Override
	public int GetPos(int pos) {
		// TODO Auto-generated method stub
		if (pos>size()-1)
		{
			throw new IllegalArgumentException();

		}
		return ar[start_el+pos];
	}

	@Override
	public void SetPos(int pos, int value) {
		if (pos>size()-1)
		{
			throw new IllegalArgumentException();
		}

		ar[start_el+pos]=value;

	}

	@Override
	public int max() {

		if (size()==0)
		{
			throw new IllegalArgumentException();

		}
		int ret = ar[start_el];
		for (int i =start_el+1;i<start_el+size();i++)
		{
			if (ar[i]>ret)
			{
				ret=ar[i];
			}
		}

		return ret;
	}

	@Override
	public int min() {
		if (size()==0)
		{
			throw new IllegalArgumentException();

		}
		int ret = ar[start_el];
		for (int i =start_el+1;i<start_el+size();i++)
		{
			if (ar[i]<ret)
			{
				ret=ar[i];
			}
		}
		return ret;
	}

	@Override
	public int max_index() {

		if (size()==0)
		{
			throw new IllegalArgumentException();

		}
		int max_ind=0;
		int ret = ar[start_el];
		for (int i =start_el+1;i<start_el+size();i++)
		{
			if (ar[i]>=ret)
			{
				ret=ar[i];
				max_ind=i-start_el;
			}
		}

		return max_ind;

	}

	@Override
	public int min_index() {
		if (size()==0)
		{
			throw new IllegalArgumentException();

		}
		int min_ind=0;
		int ret = ar[start_el];
		for (int i =start_el+1;i<start_el+size();i++)
		{
			if (ar[i]<=ret)
			{
				ret=ar[i];
				min_ind=i-start_el;
			}
		}

		return min_ind;
	}

	@Override
	public void reverse() {
		for (int i =0;i<size()/2;i++)
		{
			int tmp =ar[start_el+i];
			ar[start_el+i]=ar[end_el-i-1];
			ar[end_el-i-1]=tmp;
		}

	}

	@Override
	public void half_reverse() {

		for(int i =0;i<size()/2;i++)
		{
			int tmp =ar[start_el+i];
			ar[start_el+i]=ar[size()/2+i+start_el+size()%2];
			ar[size()/2+i+start_el+size()%2]=tmp;
		}

	}

	@Override
	public void insert_sorting() 
	{
		int curr_element,prev_index;

		for (int i=1;i<size();i++)
		{
			curr_element=ar[start_el+i];
			prev_index=i-1;

			while(prev_index>=0 && ar[prev_index+start_el]>curr_element)
			{
				ar[prev_index+start_el+1]=ar[prev_index+start_el];
				ar[prev_index+start_el]=curr_element;
				prev_index--;
			}
		}

	}

	@Override
	public void bubble_sorting() {
		for (int i=0;i<size();i++)
		{
			for (int j=0;j<size()-i-1;j++)
			{
				if (ar[j+start_el]>ar[j+start_el+1])
				{
					int tmp=ar[start_el+j+1];
					ar[start_el+j+1]=ar[start_el+j];
					ar[start_el+j]=tmp;

				}
			}

		}

	}

}
