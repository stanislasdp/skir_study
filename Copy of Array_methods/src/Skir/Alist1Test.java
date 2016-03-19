package Skir;
import static org.junit.Assert.*;

import org.junit.Test;

public class Alist1Test {

	

	@Test
	public void test_init_simple() {
		int[] init_1 = {40,20,34,44,56,78,-99};
		
		Alist1 my_arr = new Alist1();
		my_arr.init(init_1);
		int exp[]=my_arr.ToArray();
		assertArrayEquals(exp,init_1);

	}

	
	@Test
	public void Clear_Simple_simple() {
		int[] init_1 = {99};
		int[] exp = {};
		Alist1 my_arr = new Alist1();
		my_arr.init(init_1);
		my_arr.clear();
		int act[]=my_arr.ToArray();
		assertArrayEquals(exp,act);

	}
	
	@Test
	public void Clear_Simple_many() {
		int[] init_1 = {40,20,34,44,56,78,-99};
		int[] exp = {};
		Alist1 my_arr = new Alist1();
		my_arr.init(init_1);
		my_arr.clear();
		int act[]=my_arr.ToArray();
		assertArrayEquals(exp,act);

	}
	
	@Test
	public void Clear_already_cleared() {
		int[] init_1 = {};
		int[] exp = {};
		Alist1 my_arr = new Alist1();
		my_arr.init(init_1);
		my_arr.clear();
		int act[]=my_arr.ToArray();
		assertArrayEquals(exp,act);
	}

	@Test
	public void testSize_pos() {
		int[] init_1 = {40,20,34,44,56,78,-99};
		Alist1 my_arr = new Alist1();
		my_arr.init(init_1);
		int act=my_arr.size();
		int exp=7;
		assertEquals(exp,act);

	}
	@Test
	public void testSize_neg() {
		int[] init_1 = {};
		Alist1 my_arr = new Alist1();
		my_arr.init(init_1);
		int act=my_arr.size();
		int exp=0;
		assertEquals(exp,act);

	}	

	@Test
	public void testToArray_pos() {
		int[] init_1 = {40,20,34,44,56,78,-99};
		Alist1 my_arr = new Alist1();
		my_arr.init(init_1);
		int [] exp=my_arr.ToArray();
		assertArrayEquals(exp,init_1);
	}

	@Test
	public void testToArray_neg() {
		int[] init_1 = {};
		Alist1 my_arr = new Alist1();
		my_arr.init(init_1);
		int [] exp=my_arr.ToArray();
		assertArrayEquals(exp,init_1);
	}


	@Test
	public void testAddStart_simple() {
		int[] init_1 = {41};
		int[] exp = {42,41};
		Alist1 my_arr = new Alist1();
		my_arr.init(init_1);
		my_arr.AddStart(42);
		int [] act = my_arr.ToArray();
		assertArrayEquals(exp,act);
	}

	@Test
	public void testAddStart_two() {
		int[] init_1 = {41,43};
		int[] exp = {42,41,43};
		Alist1 my_arr = new Alist1();
		my_arr.init(init_1);
		my_arr.AddStart(42);
		int [] act = my_arr.ToArray();
		assertArrayEquals(exp,act);
	}

	@Test
	public void testAddStart_a_lot_of() {
		int[] init_1 = {40,20,34,44,56,78,-99};
		int[] exp = {42,40,20,34,44,56,78,-99};
		Alist1 my_arr = new Alist1();
		my_arr.init(init_1);
		my_arr.AddStart(42);
		int [] act = my_arr.ToArray();
		assertArrayEquals(exp,act);
	}

	@Test
	public void testAddStart_null() {
		int[] init_1 = {};
		int[] exp = {42};
		Alist1 my_arr = new Alist1();
		my_arr.init(init_1);
		my_arr.AddStart(42);
		int [] act = my_arr.ToArray();
		assertArrayEquals(exp,act);
	}

	@Test
	public void testAddEnd_simple() {
		int[] init_1 = {41};
		int[] exp = {41,42};
		Alist1 my_arr = new Alist1();
		my_arr.init(init_1);
		my_arr.AddEnd(42);
		int [] act = my_arr.ToArray();
		assertArrayEquals(exp,act);
	}

	@Test
	public void testAddEnd_two() {
		int[] init_1 = {40,41};
		int[] exp = {40,41,42};
		Alist1 my_arr = new Alist1();
		my_arr.init(init_1);
		my_arr.AddEnd(42);
		int [] act = my_arr.ToArray();
		assertArrayEquals(exp,act);
	}


	@Test
	public void testAddEnd_many() {
		int[] init_1 = {40,20,34,44,56,78,-99};
		int[] exp = {40,20,34,44,56,78,-99,42};
		Alist1 my_arr = new Alist1();
		my_arr.init(init_1);
		my_arr.AddEnd(42);
		int [] act = my_arr.ToArray();
		assertArrayEquals(exp,act);
	}

	@Test
	public void testAddEnd_null() {
		int[] init_1 = {};
		int[] exp = {42};
		Alist1 my_arr = new Alist1();;
		my_arr.init(init_1);
		my_arr.AddEnd(42);
		int [] act = my_arr.ToArray();
		assertArrayEquals(exp,act);
	}


	@Test
	public void testAddPos_simple()
	{
		int[] init_1 = {40,42,43};
		int[] exp = {40,41,42,43};
		Alist1 my_arr = new Alist1();;
		my_arr.init(init_1);
		my_arr.AddPos(1, 41);
		int [] act = my_arr.ToArray();
		assertArrayEquals(exp,act);
	}

	@Test
	public void testAddPos_many()
	{
		int[] init_1 = {40,42,43,45,46,47};
		int[] exp = {40,42,43,41,45,46,47};
		Alist1 my_arr = new Alist1();
		my_arr.init(init_1);
		my_arr.AddPos(3, 41);
		int [] act = my_arr.ToArray();
		assertArrayEquals(exp,act);
	}

	@Test (expected=IllegalArgumentException.class)
	public void testAddPos_pos_greater_than_top()
	{
		int[] init_1 = {40,42,43,45,46,47};

		Alist1 my_arr = new Alist1();;
		my_arr.init(init_1);
		my_arr.AddPos(10, 41);
	}

	@Test
	public void testDelstart_simple() {
		int[] init_1 = {47};
		int[] exp = {};
		Alist1 my_arr = new Alist1();
		my_arr.init(init_1);
		my_arr.Delstart();
		int [] act = my_arr.ToArray();
		assertArrayEquals(exp,act);
	}


	@Test
	public void testDelstart_many() {
		int[] init_1 = {40,42,43,45,46,47};
		int[] exp = {42,43,45,46,47};
		Alist1 my_arr = new Alist1();
		my_arr.init(init_1);
		my_arr.Delstart();
		int [] act = my_arr.ToArray();
		assertArrayEquals(exp,act);
	}

	@Test (expected=IllegalArgumentException.class)
	public void testDelstart_zero() {
		int[] init_1 = {};
		Alist1 my_arr = new Alist1();
		my_arr.init(init_1);
		my_arr.Delstart();
	}

	@Test
	public void testDelEnd_simple() {
		int[] init_1 = {47};
		int[] exp = {};
		Alist1 my_arr = new Alist1();
		my_arr.init(init_1);
		my_arr.DelEnd();
		int [] act = my_arr.ToArray();
		assertArrayEquals(exp,act);
	}

	@Test
	public void testDelEnd_many() {
		int[] init_1 = {47,48,49};
		int[] exp = {47,48};
		Alist1 my_arr = new Alist1();
		my_arr.init(init_1);
		my_arr.DelEnd();
		int [] act = my_arr.ToArray();
		assertArrayEquals(exp,act);
	}


	@Test (expected=IllegalArgumentException.class)
	public void testDelEnd_zero() {
		int[] init_1 = {};
		Alist1 my_arr = new Alist1();
		my_arr.init(init_1);
		my_arr.DelEnd();
	}

	@Test
	public void testDelpos_simple() {
		int[] init_1 = {47,48,49,50};
		int[] exp = {47,48,50};
		Alist1 my_arr = new Alist1();
		my_arr.init(init_1);
		my_arr.Delpos(2);
		int [] act = my_arr.ToArray();
		assertArrayEquals(exp,act);
	}

	@Test
	public void testDelpos_many() {
		int[] init_1 = {47,48,49,50,67,67,68};
		int[] exp = {47,48,49,50,67,67};
		Alist1 my_arr = new Alist1();
		my_arr.init(init_1);
		my_arr.Delpos(6);
		int [] act = my_arr.ToArray();
		assertArrayEquals(exp,act);
	}

	@Test (expected=IllegalArgumentException.class)
	public void testDelpos_null() {
		int[] init_1 = {};
		AList0 my_arr = new AList0();
		my_arr.init(init_1);
		my_arr.Delpos(6);
	}

	@Test (expected=NegativeArraySizeException.class)
	public void testDelpos_more_length() {
		int[] init_1 = {47,48,49,50,67,67,68};
		Alist1 my_arr = new Alist1();
		my_arr.init(init_1);
		my_arr.Delpos(8);
	}


	@Test
	public void testGetPos_simple() {
		int[] init_1 = {47,48,49,50};
		int exp =49;
		Alist1 my_arr = new Alist1();
		my_arr.init(init_1);
		int act=my_arr.GetPos(2);
		assertEquals(exp,act);
	}

	@Test
	public void testGetPos_many() {
		int[] init_1 = {47,48,49,50,51,52,53,63,66};
		int exp =63;
		Alist1 my_arr = new Alist1();
		my_arr.init(init_1);
		int act=my_arr.GetPos(7);
		assertEquals(exp,act);
	}


	@Test (expected=IndexOutOfBoundsException.class)
	public void testGetPos_null() {
		int[] init_1 = {10,20};
		Alist1 my_arr = new Alist1();;
		my_arr.init(init_1);
		my_arr.GetPos(3);
	}

	@Test (expected=IndexOutOfBoundsException.class)
	public void testGetPos_more_than_length() {
		int[] init_1 = {47,48,49,50,51,52,53,63,66};
		Alist1 my_arr = new Alist1();
		my_arr.init(init_1);
		my_arr.GetPos(10);

	}


	@Test
	public void testSetPos() {
		int[] init_1 = {63,66};
		int[] exp = {63,69};
		Alist1 my_arr = new Alist1();
		my_arr.init(init_1);
		my_arr.SetPos(1, 69);
		int [] act = my_arr.ToArray();
		assertArrayEquals(exp,act);
	}

	@Test
	public void testSetPos_many() {
		int[] init_1 = {63,66,68,69,70};
		int[] exp = {63,66,88,69,70};
		Alist1 my_arr = new Alist1();
		my_arr.init(init_1);
		my_arr.SetPos(2, 88);
		int [] act = my_arr.ToArray();
		assertArrayEquals(exp,act);
	}


	@Test (expected=IllegalArgumentException.class)
	public void testSetPos_more_than_length() {
		int[] init_1 = {63,66,68,69,70};
		Alist1 my_arr = new Alist1();
		my_arr.init(init_1);
		my_arr.SetPos(15, 88);

	}

	@Test
	public void testMax_simple() {
		int[] init_1 = {63,66,68,69,70};
		int exp = 70;
		Alist1 my_arr = new Alist1();
		my_arr.init(init_1);
		int act=my_arr.max();
		assertEquals(exp,act);
	}

	@Test
	public void testMax_simple_2() {
		int[] init_1 = {63,66,66,66,65};
		int exp = 66;
		Alist1 my_arr = new Alist1();
		my_arr.init(init_1);
		int act=my_arr.max();
		assertEquals(exp,act);
	}

	@Test
	public void testMax_simple_3() {
		int[] init_1 = {65};
		int exp = 65;
		Alist1 my_arr = new Alist1();
		my_arr.init(init_1);
		int act=my_arr.max();
		assertEquals(exp,act);
	}

	@Test (expected=IllegalArgumentException.class)
	public void testMax_simple_zero() {
		int[] init_1 = {};
		Alist1 my_arr = new Alist1();
		my_arr.init(init_1);
		my_arr.max();
	}


	@Test
	public void testMin_simple() {
		int[] init_1 = {63,66,68,69,70};
		int exp = 63;
		Alist1 my_arr = new Alist1();
		my_arr.init(init_1);
		int act=my_arr.min();
		assertEquals(exp,act);
	}

	@Test
	public void testMin_simple_2() {
		int[] init_1 = {467,66,66,69,70};
		int exp = 66;
		Alist1 my_arr = new Alist1();
		my_arr.init(init_1);
		int act=my_arr.min();
		assertEquals(exp,act);
	}

	@Test
	public void testMin_simple_3() {
		int[] init_1 = {70};
		int exp = 70;
		Alist1 my_arr = new Alist1();
		my_arr.init(init_1);
		int act=my_arr.min();
		assertEquals(exp,act);
	}

	@Test (expected=IllegalArgumentException.class)
	public void testMin_zero() {
		int[] init_1 = {};
		Alist1 my_arr = new Alist1();
		my_arr.init(init_1);
		my_arr.min();
	}

	@Test
	public void testMax_index_simple() {
		int[] init_1 = {63,66,45,69,70};
		int exp = 4;
		Alist1 my_arr = new Alist1();
		my_arr.init(init_1);
		int act=my_arr.max_index();
		assertEquals(exp,act);
	}


	@Test
	public void testMax_index_simple2() {
		int[] init_1 = {63,66,45,70,70};
		int exp = 4;
		Alist1 my_arr = new Alist1();
		my_arr.init(init_1);
		int act=my_arr.max_index();
		assertEquals(exp,act);
	}


	@Test
	public void testMax_index_simple3() {
		int[] init_1 = {70};
		int exp = 0;
		Alist1 my_arr = new Alist1();
		my_arr.init(init_1);
		int act=my_arr.max_index();
		assertEquals(exp,act);
	}

	@Test (expected=IllegalArgumentException.class)
	public void testMax_index_zero() {
		int[] init_1 = {};
		Alist1 my_arr = new Alist1();
		my_arr.init(init_1);
		my_arr.max_index();
	}

	@Test
	public void testMin_index_simple1() {
		int[] init_1 = {70,7,58};
		int exp = 1;
		Alist1 my_arr = new Alist1();
		my_arr.init(init_1);
		int act=my_arr.min_index();
		assertEquals(exp,act);
	}

	@Test
	public void testMin_index_simple2() {

	}

	@Test
	public void testMin_index_simple3() {

	}

	@Test (expected=IllegalArgumentException.class)
	public void testMin_index_zero() {
		int[] init_1 = {};
		Alist1 my_arr = new Alist1();
		my_arr.init(init_1);
		my_arr.min_index();
	}


	@Test
	public void testReverse_1() {
		int[] init_1 = {63,66,45,70,72};
		int[] exp = {72,70,45,66,63};
		Alist1 my_arr = new Alist1();
		my_arr.init(init_1);
		my_arr.reverse();
		int act[] =my_arr.ToArray();
		assertArrayEquals(exp,act);
	}
	
	@Test
	public void testReverse_2() {
		int[] init_1 = {63,63,63,63,63};
		int[] exp = {63,63,63,63,63};;
		Alist1 my_arr = new Alist1();
		my_arr.init(init_1);
		my_arr.reverse();
		int act[] =my_arr.ToArray();
		assertArrayEquals(exp,act);
	}
	
	@Test
	public void testReverse_3() {
		int[] init_1 = {99};
		int[] exp = {99};;
		Alist1 my_arr = new Alist1();
		my_arr.init(init_1);
		my_arr.reverse();
		int act[] =my_arr.ToArray();
		assertArrayEquals(exp,act);
	}
	
	@Test
	public void testReverse_null() {
		int[] init_1 = {};
		int[] exp = {};;
		Alist1 my_arr = new Alist1();;
		my_arr.init(init_1);
		my_arr.reverse();
		int act[] =my_arr.ToArray();
		assertArrayEquals(exp,act);
	}

	@Test
	public void testHalf_reverse_1() {
		int[] init_1 = {63,66,45,70};
		int[] exp = {45,70,63,66};
		Alist1 my_arr = new Alist1();
		my_arr.init(init_1);
		my_arr.half_reverse();
		int act[] =my_arr.ToArray();
		assertArrayEquals(exp,act);
	}
	
	
	@Test
	public void testHalf_reverse_2() {
		int[] init_1 = {63,66,0,45,70};
		int[] exp = {45,70,0,63,66};
		Alist1 my_arr = new Alist1();
		my_arr.init(init_1);
		my_arr.half_reverse();
		int act[] =my_arr.ToArray();
		assertArrayEquals(exp,act);
	}
	
	
	@Test
	public void testHalf_reverse_3() {
		int[] init_1 = {70};
		int[] exp = {70};
		Alist1 my_arr = new Alist1();
		my_arr.init(init_1);
		my_arr.half_reverse();
		int act[] =my_arr.ToArray();
		assertArrayEquals(exp,act);
	}
	
	
	@Test
	public void testHalf_reverse_null() {
		int[] init_1 = {};
		int[] exp = {};
		Alist1 my_arr = new Alist1();
		my_arr.init(init_1);
		my_arr.half_reverse();
		int act[] =my_arr.ToArray();
		assertArrayEquals(exp,act);
	}
	

	@Test
	public void testInsert_sorting_1() {
		int[] init_1 = {63,66,0,45,98,72};
		int[] exp = {0,45,63,66,72,98};
		Alist1 my_arr = new Alist1();
		my_arr.init(init_1);
		my_arr.insert_sorting();
		int act[] =my_arr.ToArray();
		assertArrayEquals(exp,act);
		
	}
	
	
	@Test
	public void testInsert_sorting_2() {
		int[] init_1 = {0,4,4,3,3,2};
		int[] exp = {0,2,3,3,4,4};
		Alist1 my_arr = new Alist1();;
		my_arr.init(init_1);
		my_arr.insert_sorting();
		int act[] =my_arr.ToArray();
		assertArrayEquals(exp,act);
		
	}
	
	
	@Test
	public void testInsert_sorting_3() {
		int[] init_1 = {1};
		int[] exp = {1};
		Alist1 my_arr = new Alist1();
		my_arr.init(init_1);
		my_arr.insert_sorting();
		int act[] =my_arr.ToArray();
		assertArrayEquals(exp,act);
	}
	
	@Test
	public void testInsert_zero() {
		int[] init_1 = {};
		int[] exp = {};
		Alist1 my_arr = new Alist1();
		my_arr.init(init_1);
		my_arr.insert_sorting();
		int act[] =my_arr.ToArray();
		assertArrayEquals(exp,act);
	}
	
	
	@Test
	public void testBubble_sorting_1() {
		int[] init_1 = {63,66,0,45,98,72};
		int[] exp = {0,45,63,66,72,98};
		Alist1 my_arr = new Alist1();
		my_arr.init(init_1);
		my_arr.bubble_sorting();
		int act[] =my_arr.ToArray();
		assertArrayEquals(exp,act);
		
	}
	
	
	@Test
	public void testBubble_sorting_2() {
		int[] init_1 = {0,4,4,3,3,2};
		int[] exp = {0,2,3,3,4,4};
		Alist1 my_arr = new Alist1();
		my_arr.init(init_1);
		my_arr.bubble_sorting();;
		int act[] =my_arr.ToArray();
		assertArrayEquals(exp,act);
		
	}
	
	
	@Test
	public void testBubble_sorting_3() {
		int[] init_1 = {1};
		int[] exp = {1};
		Alist1 my_arr = new Alist1();
		my_arr.init(init_1);
		my_arr.bubble_sorting();;
		int act[] =my_arr.ToArray();
		assertArrayEquals(exp,act);
	}
	
	@Test
	public void testBubble_zero() {
		int[] init_1 = {};
		int[] exp = {};
		Alist1 my_arr = new Alist1();
		my_arr.init(init_1);
		my_arr.bubble_sorting();
		int act[] =my_arr.ToArray();
		assertArrayEquals(exp,act);
	}


	



}
