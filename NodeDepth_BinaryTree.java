import java.util.*;

public class NodeDepth_BinaryTree {
	
	static class BT{
		int value ;
		BT left;
		BT right;
		
		BT(int value){
			this.value =value;
		}
		
	}
	

	
	
	public static int traverseTree(BT tree,int counter ) {
		
	
		if(tree!=null) {
			
		int depth = (traverseTree(tree.left,counter+1)+traverseTree(tree.right,counter+1));
		return depth ;
		}
		
		return 1;
	
	}
	
	public static void main(String args[]) {
		BT node10=new BT(10);
		BT node5 = new BT(5);
		BT node2 = new BT(2);
		
	node10.left = node5 ;
	node10.right =node2;
	
	BT currentnode  = node10;
	System.out.println(traverseTree(currentnode,0));
		
	}


}
