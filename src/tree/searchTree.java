package tree;
import java.util.Random;
import java.util.HashMap;
public class searchTree {
			node head;
			public searchTree(){
				head=null;
			}
			public node getHead(){
				return head;
			}
			public void printTree() throws NullPointerException{
				HashMap dic = new HashMap<node,Boolean>();
				if(head==null){
					throw new NullPointerException();
				}
				else{
					DFS(head,dic);
				}
			}
			//public node searchHash(node cur){
			//	int val= cur.getVal();
			//	return dic.get(val);
			//	}
			public node searchNode(node cur) {
				node start = this.getHead();
				HashMap dict = new HashMap<node,Boolean> ();
				return searchHelper(cur,start,dict);
			}
			private node searchHelper(node cur,node start,HashMap<node,Boolean> dic){
				if(start==null){
					return null;
				}
				else if(cur.getVal()==start.getVal()){
					return start;
				}
				else if (dic.isEmpty()||dic.get(start)==null){
							dic.put(start,true);
							node node_1=searchHelper(cur,start.getLeft(),dic);
							node node_2=searchHelper(cur,start.getRight(),dic);
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
				else {// cur is already visited
					return null;
				}
			}
			public void DFS(node cur,HashMap<node,Boolean> dic){
				if(cur==null){
					return;
				}
				else if (dic.isEmpty()||dic.get(cur)==null) {
					dic.put(cur, true);
					System.out.println(cur);
					DFS(cur.getLeft(),dic);
					DFS(cur.getRight(),dic);
				}
				else {// cur is already visited
					return;
				}
			}
			public void addNode(node newNode){
				if (head==null){
					head=newNode;
					System.out.println("new head is generated");
					return;
				}

				else{
					node tmp = head;
					while(tmp!=null){
						if (tmp.getLeft()==null){
							tmp.addLeft(newNode);
							return;
						}
						else if (tmp.getRight()==null){
							tmp.addRight(newNode);
							if (tmp.getVal()==20) {
								tmp.addLeft(this.getHead());
							}
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
