package Skir;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EListTest {
//EList list = new AList0();
//EList list = new Alist1();
//EList list = new AList2();
EList list = new LList1();
//EList list = new Llist2();
	

	@Before
	public void SetUp()
	{
		list.clear();
	}


	//==========================================
	// Init, toArray, size
	//==========================================


	@Test
	public void init__0() {
	int[] init_1 = {};
	list.init(init_1);
	assertEquals(0,list.size());
	int [] exp = {};
	int [] act =list.ToArray();
	assertArrayEquals(exp,act);
	}
	
	
	@Test
	public void init__1() {
		int[] init_1 = {99};
		list.init(init_1);
		assertEquals(1,list.size());
		int [] exp = {99};
		int [] act =list.ToArray();
		assertArrayEquals(exp,act);
	}
	@Test
	public void init_2() {
		int[] init_1 = {99,98};
		list.init(init_1);
		assertEquals(2,list.size());
		int [] exp = {99,98};
		int [] act =list.ToArray();
		assertArrayEquals(exp,act);
	}
	
	@Test
	public void init_7() {
		int[] init_1 = {99,98,95,89,67,56,45};
		list.init(init_1);
		assertEquals(7,list.size());
		int [] exp = {99,98,95,89,67,56,45};
		int [] act =list.ToArray();
		assertArrayEquals(exp,act);
	}

	
//	clear
	@Test
	public void clear__1() {
		int[] init_1 = {99};
		list.init(init_1);
		list.clear();
		assertEquals(0,list.size());
		int [] exp = {};
		int [] act =list.ToArray();
		assertArrayEquals(exp,act);
	}
	
	@Test
	public void clear__2() {
		int[] init_1 = {99,98};
		list.init(init_1);
		list.clear();
		assertEquals(0,list.size());
		int [] exp = {};
		int [] act =list.ToArray();
		assertArrayEquals(exp,act);
	}
	
	@Test
	public void clear_7() {
		int[] init_1 = {99,98,95,89,67,56,45};
		list.init(init_1);
		list.clear();
		assertEquals(0,list.size());
		int [] exp = {};
		int [] act =list.ToArray();
		assertArrayEquals(exp,act);
	}
	
//	add end
	@Test
	public void add_end_0() {
		int[] init_1 = {};
		list.init(init_1);
		list.AddEnd(45);
		assertEquals(1,list.size());
		int [] exp = {45};
		int [] act =list.ToArray();
		assertArrayEquals(exp,act);
	}
	
	@Test
	public void add_end_1() {
		int[] init_1 = {99};
		list.init(init_1);
		list.AddEnd(45);
		assertEquals(2,list.size());
		int [] exp = {99,45};
		int [] act =list.ToArray();
		assertArrayEquals(exp,act);
	}
	
	@Test
	public void add_end_2() {
		int[] init_1 = {99,89};
		list.init(init_1);
		list.AddEnd(45);
		assertEquals(3,list.size());
		int [] exp = {99,89,45};
		int [] act =list.ToArray();
		assertArrayEquals(exp,act);
	}
	
	@Test
	public void add_end_7() {
		int[] init_1 = {99,98,95,89,67,56,44};
		list.init(init_1);
		list.AddEnd(45);
		assertEquals(8,list.size());
		int [] exp = {99,98,95,89,67,56,44,45};
		int [] act =list.ToArray();
		assertArrayEquals(exp,act);
	}
	
	
	
//add start
	@Test
	public void add_start_0() {
		int[] init_1 = {};
		list.init(init_1);
		list.AddStart(45);
		assertEquals(1,list.size());
		int [] exp = {45};
		int [] act =list.ToArray();
		assertArrayEquals(exp,act);
	}
	
	@Test
	public void add_start_1() {
		int[] init_1 = {99};
		list.init(init_1);
		list.AddStart(45);
		assertEquals(2,list.size());
		int [] exp = {45,99};
		int [] act =list.ToArray();
		assertArrayEquals(exp,act);
	}
	
	@Test
	public void add_start_2() {
		int[] init_1 = {99,89};
		list.init(init_1);
		list.AddStart(45);
		assertEquals(3,list.size());
		int [] exp = {45,99,89};
		int [] act =list.ToArray();
		assertArrayEquals(exp,act);
	}
	
	@Test
	public void add_start_7() {
		int[] init_1 = {99,98,95,89,67,56,45};
		list.init(init_1);
		list.AddStart(45);
		assertEquals(8,list.size());
		int [] exp = {45,99,98,95,89,67,56,45};
		int [] act =list.ToArray();
		assertArrayEquals(exp,act);
	}
	
	
	

//add_pos
	@Test (expected = IllegalArgumentException.class)
	public void testAddPos_0()
	{
		int[] init_1 = {};
		list.init(init_1);
		list.AddPos(0, 1);
	}
	
	
	@Test 
	public void testAddPos_1()
	{
		int[] init_1 = {45};
		list.init(init_1);
		list.AddPos(0, 46);
		assertEquals(2,list.size());
		int [] exp = {46,45};
		int [] act = list.ToArray();
		assertArrayEquals(exp,act);
		
	}
	
	@Test 
	public void testAddPos_2()
	{
		int[] init_1 = {45,47};
		list.init(init_1);
		list.AddPos(1, 48);
		assertEquals(3,list.size());
		int [] exp = {45,48,47};
		int [] act = list.ToArray();
		assertArrayEquals(exp,act);
		
	}
	
	@Test 
	public void testAddPos_7_1()
	{
		int[] init_1 = {45,47,59,5,0,55,68,79};
		list.init(init_1);
		list.AddPos(3, 48);
		assertEquals(9,list.size());
		int [] exp = {45,47,59,48,5,0,55,68,79};
		int [] act = list.ToArray();
		assertArrayEquals(exp,act);
		
	}
	
	
	@Test 
	public void testAddPos_7_2()
	{
		int[] init_1 = {45,47,59,5,0,55,68,79};
		list.init(init_1);
		list.AddPos(6, 48);
		assertEquals(9,list.size());
		int [] exp = {45,47,59,5,0,55,48,68,79};
		int [] act = list.ToArray();
		assertArrayEquals(exp,act);
		
	}
	
	
//	del Start
	@Test (expected=IllegalArgumentException.class)
	public void DelStart_0()
	{
		int[] init_1 = {};
		list.init(init_1);
		list.Delstart();
		
	}
	
	
	@Test 
	public void DelStart_1()
	{
		int[] init_1 = {57};
		list.init(init_1);
		list.Delstart();;
		assertEquals(0,list.size());
		int [] exp = {};
		int [] act = list.ToArray();
		assertArrayEquals(exp,act);
		
	}
	
	@Test 
	public void DelStart_2()
	{
		int[] init_1 = {57,65};
		list.init(init_1);
		list.Delstart();;
		assertEquals(1,list.size());
		int [] exp = {65};
		int [] act = list.ToArray();
		assertArrayEquals(exp,act);	
	}
	
	@Test 
	public void DelStart_7()
	{
		int[] init_1 = {47,59,5,0,55,48,68};
		list.init(init_1);
		list.Delstart();;
		assertEquals(6,list.size());
		int [] exp = {59,5,0,55,48,68};
		int [] act = list.ToArray();
		assertArrayEquals(exp,act);
		
	}
	
//del end 
	@Test (expected=IllegalArgumentException.class)
	public void DelEnd_0()
	{
		int[] init_1 = {};
		list.init(init_1);
		list.DelEnd();
	}
	
	
	@Test 
	public void DelEnd_1()
	{
		int[] init_1 = {57};
		list.init(init_1);
		list.DelEnd();
		assertEquals(0,list.size());
		int [] exp = {};
		int [] act = list.ToArray();
		assertArrayEquals(exp,act);
		
	}
	
	@Test 
	public void DelEnd_2()
	{
		int[] init_1 = {57,65};
		list.init(init_1);
		list.DelEnd();
		assertEquals(1,list.size());
		int [] exp = {57};
		int [] act = list.ToArray();
		assertArrayEquals(exp,act);	
	}
	
	@Test 
	public void DelEnd_7()
	{
		int[] init_1 = {47,59,5,0,55,48,68};
		list.init(init_1);
		list.DelEnd();
		assertEquals(6,list.size());
		int [] exp = {47,59,5,0,55,48};
		int [] act = list.ToArray();
		assertArrayEquals(exp,act);
	}
	
//	del pos
	@Test (expected=IllegalArgumentException.class)
	public void Delpos_0()
	{
		int[] init_1 = {};
		list.init(init_1);
		list.Delpos(1);
	}
	
//	del pos
	@Test (expected=IllegalArgumentException.class)
	public void Delpos_more_than_length()
	{
		int[] init_1 = {56};
		list.init(init_1);
		list.Delpos(2);
	}
	
	@Test 
	public void DelPos_1()
	{
		int[] init_1 = {57};
		list.init(init_1);
		list.Delpos(0);
		assertEquals(0,list.size());
		int [] exp = {};
		int [] act = list.ToArray();
		assertArrayEquals(exp,act);
		
	}
	
	@Test 
	public void DelPos_2()
	{
		int[] init_1 = {57,68};
		list.init(init_1);
		list.Delpos(1);
		assertEquals(1,list.size());
		int [] exp = {57};
		int [] act = list.ToArray();
		assertArrayEquals(exp,act);
		
	}
	
	@Test 
	public void DelPos_7_1()
	{
		int[] init_1 = {47,59,5,0,55,48,68};
		list.init(init_1);
		list.Delpos(2);
		assertEquals(6,list.size());
		int [] exp = {47,59,0,55,48,68};
		int [] act = list.ToArray();
		assertArrayEquals(exp,act);
	}
	
	@Test 
	public void DelPos_7_2()
	{
		int[] init_1 = {47,59,5,0,55,48,68};
		list.init(init_1);
		list.Delpos(5);
		assertEquals(6,list.size());
		int [] exp = {47,59,5,0,55,68};
		int [] act = list.ToArray();
		assertArrayEquals(exp,act);
	}
	
// get pos
	
	@Test (expected=IllegalArgumentException.class)
	public void testGetPos_0() {
		int[] init_1 = {};
		list.init(init_1);
		list.GetPos(0);
	}	
	
	@Test (expected=IllegalArgumentException.class)
	public void testGetPos_more_than_length1() {
		int[] init_1 = {34};
		list.init(init_1);
		list.GetPos(2);
	}	
	
	@Test 
	public void testGetPos_1() {
		int[] init_1 = {34};
		list.init(init_1);
		int act =list.GetPos(0);
		int exp=34;
		assertEquals(exp,act);
	}	
	
	@Test 
	public void testGetPos_2() {
		int[] init_1 = {34,44};
		list.init(init_1);
		int act =list.GetPos(1);
		int exp=44;
		assertEquals(exp,act);
	}	
	
	@Test 
	public void testGetPos_7_1() {
		int[] init_1 = {47,59,5,0,55,48,68};
		list.init(init_1);
		int act =list.GetPos(6);
		int exp=68;
		assertEquals(exp,act);
	}	
	
	@Test 
	public void testGetPos_7_2() {
		int[] init_1 = {47,59,5,0,55,48,68};
		list.init(init_1);
		int act =list.GetPos(3);
		int exp=0;
		assertEquals(exp,act);
	}	
	
	
//	set pos


	@Test (expected=IllegalArgumentException.class)
	public void testSetPos_0() {
		int[] init_1 = {};
		list.init(init_1);
		list.SetPos(0, 14);
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void testSetPos_more_than_length1() {
		int[] init_1 = {34};
		list.init(init_1);
		list.SetPos(2, 14);
	}
	
	@Test 
	public void testSetPos_1() {
		int[] init_1 = {34};
		list.init(init_1);
		list.SetPos(0, 35);
		assertEquals(1,list.size());
		int [] exp = {35};
		int [] act = list.ToArray();
		assertArrayEquals(exp,act);
	}
	
	@Test 
	public void testSetPos_2() {
		int[] init_1 = {34,44};
		list.init(init_1);
		list.SetPos(1, 35);
		assertEquals(2,list.size());
		int [] exp = {34,35};
		int [] act = list.ToArray();
		assertArrayEquals(exp,act);
	}
	
	@Test 
	public void testSetPos_7_1() {
		int[] init_1 = {47,59,5,0,55,48,68};
		list.init(init_1);
		list.SetPos(2, 99);
		assertEquals(7,list.size());
		int [] exp = {47,59,99,0,55,48,68};
		int [] act = list.ToArray();
		assertArrayEquals(exp,act);
	}
		
		@Test 
		public void testSetPos_7_2() {
			int[] init_1 = {47,59,5,0,55,48,68};
			list.init(init_1);
			list.SetPos(5, 99);
			assertEquals(7,list.size());
			int [] exp = {47,59,5,0,55,99,68};
			int [] act = list.ToArray();
			assertArrayEquals(exp,act);
	}
	
	
//	test max
	
	@Test (expected=IllegalArgumentException.class)
	public void testMax_0() {
		int[] init_1 = {};
		list.init(init_1);
		list.max();
	}
	
	@Test 
	public void testMax_1() {
		int[] init_1 = {47};
		list.init(init_1);
		int exp = 47;
		int act = list.max();
		assertEquals(exp,act);
	}
	
	@Test 
	public void testMax_2() {
		int[] init_1 = {47,49};
		list.init(init_1);
		int exp = 49;
		int act = list.max();
		assertEquals(exp,act);
	}
	
	@Test 
	public void testMax_7() {
		int[] init_1 = {47,59,5,0,55,48,68};
		list.init(init_1);
		int exp = 68;
		int act = list.max();
		assertEquals(exp,act);
	}
	
	@Test 
	public void testMax_equal() {
		int[] init_1 = {47,59,68,-68,0,48,68};
		list.init(init_1);
		int exp = 68;
		int act = list.max();
		assertEquals(exp,act);
	}
	
	
// test min
	
	@Test (expected=IllegalArgumentException.class)
	public void testMin_0() {
		int[] init_1 = {};
		list.init(init_1);
		list.min();
	}
	
	@Test 
	public void testMin_1() {
		int[] init_1 = {47};
		list.init(init_1);
		int exp = 47;
		int act = list.min();
		assertEquals(exp,act);
	}
	
	@Test 
	public void testMin_2() {
		int[] init_1 = {47,49};
		list.init(init_1);
		int exp = 47;
		int act = list.min();
		assertEquals(exp,act);
	}
	
	@Test 
	public void testMin_7() {
		int[] init_1 = {47,59,5,0,55,48,68};
		list.init(init_1);
		int exp = 0;
		int act = list.min();
		assertEquals(exp,act);
	}
	
	@Test 
	public void testMin_equal() {
		int[] init_1 = {47,59,68,-68,0,48,-68};
		list.init(init_1);
		int exp = -68;
		int act = list.min();
		assertEquals(exp,act);
	}
	
//max index
	@Test (expected=IllegalArgumentException.class)
	public void testMaxind_0() {
		int[] init_1 = {};
		list.init(init_1);
		list.max_index();
	}
	
	@Test 
	public void testMaxind_1() {
		int[] init_1 = {47};
		list.init(init_1);
		int exp = 0;
		int act = list.max_index();
		assertEquals(exp,act);
	}
	
	@Test 
	public void testMaxind_2() {
		int[] init_1 = {47,49};
		list.init(init_1);
		int exp = 1;
		int act = list.max_index();
		assertEquals(exp,act);
	}
	
	@Test 
	public void testMaxid_7() {
		int[] init_1 = {47,59,5,0,55,48,68};
		list.init(init_1);
		int exp = 6;
		int act = list.max_index();
		assertEquals(exp,act);
	}
	
	@Test 
	public void testMaxind_equal() {
		int[] init_1 = {47,-59,68,-68,0,48,68};
		list.init(init_1);
		int exp = 6;
		int act = list.max_index();
		assertEquals(exp,act);	
	}
	
//	min index
	@Test (expected=IllegalArgumentException.class)
	public void testMinind_0() {
		int[] init_1 = {};
		list.init(init_1);
		list.min_index();
	}
	
	@Test 
	public void testMinind_1() {
		int[] init_1 = {47};
		list.init(init_1);
		int exp = 0;
		int act = list.min_index();
		assertEquals(exp,act);
	}
	
	@Test 
	public void testMinind_2() {
		int[] init_1 = {47,34};
		list.init(init_1);
		int exp = 1;
		int act = list.min_index();
		assertEquals(exp,act);
	}
	
	@Test 
	public void testMinid_7() {
		int[] init_1 = {47,6,-67,12,0,-8,218};
		list.init(init_1);
		int exp = 2;
		int act = list.min_index();
		assertEquals(exp,act);
	}
	
	@Test 
	public void testMinind_equal() {
		int[] init_1 = {47,59,68,-68,0,48,-68};
		list.init(init_1);
		int exp = 6;
		int act = list.min_index();
		assertEquals(exp,act);	
	}
	
	
	@Test
	public void testReverse_0() {
		int[] init_1 = {};
		list.init(init_1);
		assertEquals(0,list.size());
		int[] exp = {};
		list.reverse();
		int [] act =list.ToArray();
		assertArrayEquals(exp,act);
	}
	
	@Test
	public void testReverse_1() {
		int[] init_1 = {67};
		list.init(init_1);
		assertEquals(1,list.size());
		int[] exp = {67};
		list.reverse();
		int [] act =list.ToArray();
		assertArrayEquals(exp,act);
	}
	
	
	@Test
	public void testReverse_2() {
		int[] init_1 = {67,78};
		list.init(init_1);
		assertEquals(2,list.size());
		int[] exp = {78,67};
		list.reverse();
		int [] act =list.ToArray();
		assertArrayEquals(exp,act);
	}
	
	@Test
	public void testReverse_3() {
		int[] init_1 = {67,78,79};
		list.init(init_1);
		assertEquals(3,list.size());
		int[] exp = {79,78,67};
		list.reverse();
		int [] act =list.ToArray();
		assertArrayEquals(exp,act);
	}
	
	@Test
	public void testReverse_7() {
		int [] init_1 = {47,59,68,-68,0,48,68};
		list.init(init_1);
		assertEquals(7,list.size());
		int[] exp = {68,48,0,-68,68,59,47};
		list.reverse();
		int [] act =list.ToArray();
		assertArrayEquals(exp,act);
	}
	
	@Test
	public void testHalfReverse_0() {
		int[] init_1 = {};
		list.init(init_1);
		assertEquals(0,list.size());
		int[] exp = {};
		list.half_reverse();
		int [] act =list.ToArray();
		assertArrayEquals(exp,act);
	}
	
	@Test
	public void testHalfReverse_1() {
		int[] init_1 = {67};
		list.init(init_1);
		assertEquals(1,list.size());
		int[] exp = {67};
		list.half_reverse();
		int [] act =list.ToArray();
		assertArrayEquals(exp,act);
	}
	
	
	@Test
	public void testHalfReverse_2() {
		int[] init_1 = {67,78};
		list.init(init_1);
		assertEquals(2,list.size());
		int[] exp = {78,67};
		list.half_reverse();
		int [] act =list.ToArray();
		assertArrayEquals(exp,act);
	}
	
	@Test
	public void testHalfReverse_3() {
		int[] init_1 = {67,56,79};
		list.init(init_1);
		assertEquals(3,list.size());
		int[] exp = {79,56,67};
		list.half_reverse();
		int [] act =list.ToArray();
		assertArrayEquals(exp,act);
	}
	
	@Test
	public void testHalfReverse_7() {
		int [] init_1 = {47,59,68,-68,0,48,68};
		list.init(init_1);
		assertEquals(7,list.size());
		int[] exp = {0,48,68,-68,47,59,68};
		list.half_reverse();
		int [] act =list.ToArray();
		assertArrayEquals(exp,act);
	}
	
	
	
	
	@Test
	public void test_Bubblesort0() {
		int [] init_1 = {};
		list.init(init_1);
		assertEquals(0,list.size());
		int[] exp = {};
		list.bubble_sorting();
		int [] act =list.ToArray();
		assertArrayEquals(exp,act);
	}
	
	@Test
	public void test_BubbleSort1() {
		int [] init_1 = {13};
		list.init(init_1);
		assertEquals(1,list.size());
		int[] exp = {13};
		list.bubble_sorting();
		int [] act =list.ToArray();
		assertArrayEquals(exp,act);
	}
	
	
	@Test
	public void test_Bubblesort2() {
		int [] init_1 = {17,8};
		list.init(init_1);
		assertEquals(2,list.size());
		int[] exp = {8,17};
		list.bubble_sorting();
		int [] act =list.ToArray();
		assertArrayEquals(exp,act);
	}
	
	@Test
	public void test_BubbleSort7() {
		int [] init_1 = {13,56,78,45,53,12,8};
		list.init(init_1);
		assertEquals(7,list.size());
		int[] exp = {8,12,13,45,53,56,78};
		list.bubble_sorting();
		int [] act =list.ToArray();
		assertArrayEquals(exp,act);
	}
	
	
	@Test
	public void test_Inseetsort0() {
		int [] init_1 = {};
		list.init(init_1);
		assertEquals(0,list.size());
		int[] exp = {};
		list.insert_sorting();
		int [] act =list.ToArray();
		assertArrayEquals(exp,act);
	}
	
	@Test
	public void testInseertSort1() {
		int [] init_1 = {13};
		list.init(init_1);
		assertEquals(1,list.size());
		int[] exp = {13};
		list.insert_sorting();;
		int [] act =list.ToArray();
		assertArrayEquals(exp,act);
	}
	
	@Test
	public void test_InsertSort2()
	{
		int [] init_1 = {17,8};
		list.init(init_1);
		assertEquals(2,list.size());
		int[] exp = {8,17};
		list.insert_sorting();;
		int [] act =list.ToArray();
		assertArrayEquals(exp,act);
	
	}
	
	@Test
	public void test_InsertSort7() {
		int [] init_1 = {13,56,78,45,53,12,8};
		list.init(init_1);
		assertEquals(7,list.size());
		int[] exp = {8,12,13,45,53,56,78};
		list.insert_sorting();;
		int [] act =list.ToArray();
		assertArrayEquals(exp,act);
	}
	

	
	


}