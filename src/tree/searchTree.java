package tree;
import java.util.Random;
import java.util.HashMap;
public class searchTree {
			node head;
			HashMap<Integer,node> dic;
			public searchTree(){
				head=null;
				dic = new HashMap<Integer,node>();
			}
			public node getHead(){
				return head;
			}
			public void printTree() throws NullPointerException{
				if(head==null){
					throw new NullPointerException();
				}
				else{
					DFS(head);
				}
			}
			public node searchHash(node cur){
				int val= cur.getVal();
				return dic.get(val);
				}
			public node searchNode(node cur,node start){
				if(start==null){
					return null;
				}
				else if(cur.getVal()==start.getVal()){
					return start;
				}
				else {
							node node_1=searchNode(cur,start.getLeft());
							node node_2=searchNode(cur,start.getRight());
						if (node_1!=null){
							return node_1;
						}
						else if (node_2!=null){
							return node_2;
						}
						else {
							return null;
						}
				}
			}
			public void DFS(node cur){
				if(cur==null){
					return;
				}
				else{
					System.out.println(cur);
					DFS(cur.getLeft());
					DFS(cur.getRight());
				}
			}
			public void addNode(node newNode){
				if (head==null){
					head=newNode;
					dic.put(head.getVal(),head);
					System.out.println("new head is generated");
					return;
				}

				else{
					node tmp = head;
					while(tmp!=null){
						if (tmp.getLeft()==null){
							tmp.addLeft(newNode);
							dic.put(newNode.getVal(),newNode);
							return;
						}
						else if (tmp.getRight()==null){
							tmp.addRight(newNode);
							dic.put(newNode.getVal(),newNode);
							return;
						}
						else{//randomly find a next node
						double num=Math.random();
						if(num<0.5){
							tmp = tmp.getLeft();
						}
						else{
							tmp=tmp.getRight();
						}
						}
					}
				}
			}
}
