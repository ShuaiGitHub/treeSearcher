package tree;

public class Main {
	public static void main(String[] args){
		searchTree tree=new searchTree();
		for (int i = 1; i<100;i++){
			//System.out.println(i);
			tree.addNode(new node(i));
		}
		//tree.printTree();
		node testNode=new node(58);
				if(tree.searchNode(testNode,tree.getHead())==null){
					System.out.println("Not found");
				}
				else{
					System.out.printf("found the node %d",testNode.getVal());
				}
	}
}
