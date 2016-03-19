package Skir;

public interface EList
{
	
	public void init (int[] ini);
	public void clear();
	public int size ();
	public void print();
	public int[] ToArray();
	public void AddStart(int str);
	public void AddEnd(int end_1);
	public void AddPos(int pos,int val);
	public void Delstart();
	public void DelEnd();
	public void Delpos(int pos);
	public int GetPos(int pos);
	public void SetPos(int pos,int value);
	public int max();
	public int min();
	public int max_index();
	public int min_index();
	public void reverse();
	public void half_reverse();
	public void insert_sorting();
	public void bubble_sorting();

}