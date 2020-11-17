import java.util.*;
public class RoughWork {
	
	static class BinaryTree{
		int value ;
		BinaryTree left ;
		BinaryTree right;
		
		BinaryTree(int value){
			this.value =value ;
		}
		
		
		
	}
	
	public List<Integer> branchSums (BinaryTree root) {
	    List<Integer> sumsList = new ArrayList<>();
	    return branchSums(root, 0, sumsList);
	}
	public List<Integer> branchSums (BinaryTree root, int sum, List<Integer> sumsList) {
	    if (root == null) {
	        return sumsList;
	    }
	    // sum = sum + root.value
	    sum += root.value;
	    if (root.left == null && root.right == null) {
	        // Then we've hit a leaf node
	        sumsList.add(sum);
	    }
	    if (root.left != null) {
	        branchSums(root.left, sum, sumsList);
	    }
	    if (root.right != null) {
	        branchSums (root.right, sum, sumsList);
	    }
	    // When everything's done, return sumsList
	    return sumsList;

	}
	
	public static void main (String args[]) {
		
		 BinaryTree node10=new  BinaryTree(10);
		 BinaryTree node5 = new  BinaryTree(5);
		 BinaryTree node2 = new  BinaryTree(2);
		 BinaryTree node15 = new  BinaryTree(15);
		 BinaryTree node13 = new  BinaryTree(13);
		 BinaryTree node22 = new  BinaryTree(22);
		 BinaryTree node8 = new  BinaryTree(8);
	node10.left = node5 ;
	node10.right=node15;
	node15.left=node13;
	node15.right=node22;
	node5.right=node8;
	 BinaryTree currentnode  = node10;

	 RoughWork rw = new RoughWork();
	List<Integer> i= rw.branchSums(node10);
	
	while(i.iterator().hasNext()) {
		System.out.println(i.iterator().next());
	}
		
	}
	
}