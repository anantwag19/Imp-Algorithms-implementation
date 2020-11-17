import java.util.*;



public class SearchNode_Present_Binary {
	
	static class BST{
		int value ;
		BST left;
		BST right;
	
	
	public BST(int value){
		this.value =value ;
		
	}
	
	public static int searchValueInBst(BST tree, int target) {

		BST currentNode= tree ;
		
		
	while(true) {
		
		if(currentNode.value ==target) {
			return currentNode.value;
		}
		if(currentNode.value<target) {
			//target is greater than current value and can be 
			//found at righthandside
			currentNode=currentNode.right;
			
		}
		else{
			//target is small than currentvalue
			currentNode=currentNode.left;
			
		}
			
	
		
	}//if Leaf
}//while
	
	
	
	public static void main (String args[]) {
		
		BST callmethod= new BST(23);
		
			
		
	
	BST node10=new BST(10);
	BST tree = node10 ;
	BST node5 = new BST(5);
	BST node2 = new BST(2);
	BST node15 = new BST(15);
	BST node13 = new BST(13);
	BST node22 = new BST(22);
	BST node8 = new BST(8);
	node10.left = node5 ;
	node10.right=node15;
	node15.left=node13;
	node15.right=node22;
	node5.right=node8;
	
	System.out.print(callmethod.searchValueInBst(tree, 2));
	
	}//end of psvm




}//end of class 
}