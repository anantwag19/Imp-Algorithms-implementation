import java.util.*;

public class VerifyBST {
	
static class BST{
	double value;
	BST left;
	BST right;
	
	BST(int value){
		this.value=value;
	}
}
public static boolean validateBST(BST tree) {
	BST currentnode = tree;
	Double maxvalue = Double.POSITIVE_INFINITY;
	Double  minvalue = Double.POSITIVE_INFINITY;
	return validateBSTHelper(tree,maxvalue,minvalue);
	
	
	
	
	 }

public static boolean validateBSTHelper(BST currentnode,Double minvalue,Double maxvalue) {
	if(currentnode.value<minvalue ||currentnode.value>=maxvalue ) {
		return false ;
	}
	if(currentnode.left!=null&& !validateBSTHelper(currentnode,minvalue,currentnode.value)) {
		return false;
		
	}
	
	if(currentnode.left!=null&& !validateBSTHelper(currentnode,currentnode.value,maxvalue)) {
		return false;
		
	}
	
	return true ;
	
}

public static void main (String args[]) {
	BST node10= new BST(10);
	BST node8= new BST(8);
	BST node12= new BST(12);
	node8=node10.left;
	node12 =node10.right;
	
	
	BST tree= node10;
	

	System.out.println(validateBSTHelper(tree,Double.NEGATIVE_INFINITY,  Double.POSITIVE_INFINITY));
	
	
	
}


}
