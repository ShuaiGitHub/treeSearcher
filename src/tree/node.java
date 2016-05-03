package tree;
//import junit.*;
public class node {
		private int val;
		private node left;
		private node right;
		public node(int n){
			this.val = n;
			left = null;
			right = null;
		}
		public node(){
			left = null;
			right = null;
		}
		public void addLeft(node next){
			this.left=next;
		}
		public void addRight(node next){
			this.right=next;
		}
		public node getLeft(){
			return this.left;
		}
		public int getVal(){
			return this.val;
		}
		public node getRight(){
			return this.right;
		}
		public String toString(){
			return Integer.toString(val);
		}
}
