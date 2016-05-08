package tree;
import java.util.HashMap;
public class Main {
	public static void main(String[] args){
		searchTree tree=new searchTree();
		for (int i = 1; i<100;i++){
			//System.out.println(i);
			tree.addNode(new node(i));
		}
		tree.printTree();
		testSearchNode(new node(58),tree);
		testSearchNode(new node(101),tree);

	}
	public static void testSearchNode(node cur,searchTree tree){
		node found = tree.searchNode(cur);
		if(found==null){
			System.out.printf("Not found the node %d\n",cur.getVal());
		}
		else{
			System.out.printf("found the node %d\n",found.getVal());
		}
	}
}
