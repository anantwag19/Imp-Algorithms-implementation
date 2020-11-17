import java.util.*;

public class BST_Create{
	static class BST{
		int value;
		BST left;
		BST right ;
		
	
		public BST(int value) {
			this.value =value ;
		
		
		}
	
	
	public BST insert(int value) {
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
BST currentnode  = node10;
		while(true) {
			if(value<currentnode.value) {
				System.out.println("currentnode.value"+currentnode.value);
				if(currentnode.left ==null) {
					BST newNode= new BST(value);
					System.out.println("/"+value);
					currentnode.left=newNode;
				break;
				}
				else {
					//There are some nodes 
					currentnode = currentnode.left;
				}//else
				
			}//if 1
			
			else {
				//value is greater than node.
				currentnode = currentnode.right;
				if(currentnode.right==null) {
					//we can add ;
					BST newnode = new BST(value);
					System.out.println("/"+value);
					currentnode.right=newnode;
					System.out.println("/"+newnode.left);
					break;
				}//if right leaf==null
				else {
					currentnode=currentnode.right;
				}
				
				
			}
			
		}//while 
		return this;
	}
	
	
	}//innser class
	
	public static void main (String args[]) {
		
		try {
			
			BST_Create b = new BST_Create();
			System.out.println("insdie PSVM");
		
		
	
		BST bb = new BST(12).insert(12);
		
	
			
			
			
			
		 
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
	
	}
	
	
	
}