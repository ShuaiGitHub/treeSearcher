package tree;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
public class treeTester {
	searchTree emptyTree;
	searchTree realTree;
	//@throws java.lang.exception
	@Before
	public void setUp() {
		searchTree emptyTree = new searchTree();
		searchTree realTree=new searchTree();
		for (int i = 1; i<100;i++){
			//System.out.println(i);
			realTree.addNode(new node(i));
			//realTree.printTree();
		}
	}
	@Test
	public void testSet(){
		try {
			emptyTree.printTree();
			fail("Check if tree is empty");
		}
		catch (NullPointerException e) {
			
		}
	}
	@Test
	public void testGet(){
		try {		
		node test_2 = new node(58);
		assertEquals("check second case",58,realTree.searchNode(test_2, realTree.getHead()));
		}
		catch (NullPointerException e){
			
		}
	}
	
}
