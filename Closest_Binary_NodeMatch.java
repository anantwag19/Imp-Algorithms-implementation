
import java.util .*;

import java.lang.* ;
public class Closest_Binary_NodeMatch {
	
	static class BST{
		int value ;
		BST left;
		BST right;
		
		BST(int value){
			this.value =value ;
			
		}
		
		
	}
	
	
	 public static int findClosestValueInBst(BST tree, int target) {
		 BST currentNode =tree ;
		    // Write your code here.
		 int diffrence =0;
		 int expected = 1000;
		 BST capture =null;
		 
		
		 while(currentNode!=null) {
			 
			 if(currentNode.value<target) 
			 {
				 //target is bigger and get good match at right
				 
				 diffrence = Math.abs(currentNode.value - target ) ;
			
				 if (diffrence<expected) 
				 {
					 expected=diffrence;
					 capture =currentNode;
				 }
				 currentNode = currentNode.right;
				 
				
			 }
			 else
			 {
				 //target is lower and good match can be found out at left
				 diffrence = Math.abs(currentNode.value - target ) ;
				
				 if (diffrence<expected) 
				 {
					 expected=diffrence;
					 capture =currentNode;
				 }
				 currentNode = currentNode.left;
			 }
			 
			
		
		 
		 }//end of while
		return capture.value;
		 
		 
		
	  }//end of method 
	 

	
	public static void main (String args[]) {
		BST node10=new BST(10);
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

	BST tree = node10 ;
	
	
	System.out.println(findClosestValueInBst(tree, 19)) ;
		
		
		
		
	}//end of psvm
	
	
}//End of Class
