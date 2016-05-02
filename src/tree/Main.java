package tree;

public class Main {
	public static void main(String[] args){
		searchTree tree=new searchTree();
		for (int i = 1; i<100;i++){
			System.out.println(i);
			tree.addNode(new node(i));
		}
		tree.printTree();
		node testNode=new node(101);
				tree.searchNode(testNode);
	}
}
