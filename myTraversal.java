/* traverse(BST.left, array);
addto(array)
traverse(BST.right,array);                           */

import java.util.*;




public class myTraversal{
static class BST{

int value ;
BST left;
BST right;

BST(int value){
this.value=value;
}//constructor 
}//BST inner class 

public static List<Integer> inOrderTraversal(BST tree,List<Integer> MyArray) {
	BST currentnode=tree;
	 if(currentnode.left!=null) {
		 inOrderTraversal(currentnode.left,MyArray);
	 }
	 MyArray.add(currentnode.value);
	 if(currentnode.right!=null) {
		 inOrderTraversal(currentnode.right,MyArray);
	 }
	 
		return MyArray;

	}
public static void main(String args[]) {
	BST node10= new BST(10);
	BST node5_1= new BST(5);
	BST node15= new BST(15);
	BST node5= new BST(5);
	BST node2= new BST(2);
	BST node22= new BST(22);
	BST node5_2= new BST(5);
	BST node1= new BST(1);
	
	
	node10.left=node5_1;
	node5_1.left=node2;
	node2.left=node1;
	node10.right=node15;
	node5_1.right=node5_2;
	node15.right=node22;
	
	BST tree= node10;
	
	List<Integer> MyArray = new ArrayList<Integer>();
	try {
	
Iterator i	=inOrderTraversal(tree,MyArray).iterator() ;	
	//	Iterator i	=preOrderTraversal(tree,MyArray).iterator() ;
	//	Iterator i	=postOrderTraversal(tree,MyArray).iterator() ;
		
		
while(i.hasNext()) {
	
	System.out.println(i.next());
}
	
	}
	catch(Exception e){
		e.getCause().printStackTrace();
		
	}
	
}

}


