//doubly linked list --->we made as static class and inside that we made ...all methods 
//this to keep in mind .
public class MyLinkedList {
	
	Node head;
	Node tail ;
	static class Node{
		int value ;
		Node prev;
		Node next;
		
		Node(int x){
			
			this.value=x;
		}
	}
	
		
		
	public void  addnodeafterTail(int value ) {
		
		Node newNode= new Node(value);
		if(head==null) {
			head = tail = newNode;  
            //head's previous will be null  
            head.prev = null;  
            //tail's next will be null  
            tail.next = null;  
		}
		//if need to insert at end 
		else {
			
			newNode.prev=tail;
			tail.next=newNode;
			tail=newNode;
			tail.next=null;
		
				
		}
			
		
	
	}
	
	public void printNodes() {
		Node current =head ;
		if(head==null) {
			System.out.println("linkedlist is empty");
		}
		
		else {
			while(current!=null){
				System.out.println(current.value);
				current= current.next;
				
			}
		
			
		}
	}
	
	public void  insertafter(int after,int value)
	{
		System.out.println("**Head***"+head.value);
	
		Node current =head;
		Node newNode = new Node(value);
		
		
		while(current!=null) {
			
			if(current.value==after) {
			newNode.prev=current;
			newNode.next=current.next;
			current.next.prev=newNode.next;
			current.next= newNode;
			return ;
			}
			
			current = current.next;		
		
		}
	
}
	
	public void  insertBefore(int Before,int value)
	{
		System.out.println("**Head***"+head.value);
	
		Node current =head;
		Node newNode = new Node(value);
		
		
		while(current!=null) {
			
			if(current.value==Before) {
				newNode.next=current;
				newNode.prev=current.prev;
				current.prev.next=newNode;
				current.prev=newNode.next;
			
			return ;
			}
			
			current = current.next;		
		
		}
	
}
	
	public void  removeNode(int value)

	{
		System.out.println("**removeNode***"+head.value);
		Node current =head;
		
		while(current!=null) {
			if(current.value==value) {
			
				current.prev.next = current.next;
				current.next.prev=current.prev;
				
			
				return;
				
			}
			current =current.next;
		}
		
		
		
	
	
}
	

	public void removeAfterNode(int value) {
		Node current =head;
		
		Node temp =null;
		while(current!=null) {
			if(current.value==value) {
				temp=current.next;				
				temp.prev=temp.next;
				current.next=temp.next;
			
				return;
			
			}
			current=current.next;
		}
		
	}
	
//this below removeBeforeNode we have not cretated becuase its useless .
	public void removeBeforeNode(int value) {
		Node current =head ;
		Node temp =null;
		while(current!=null) {
			if(current.value==value) {
				temp= current.prev;
				current =current.prev.prev;
				temp.prev=temp.next;
				return;
			}
		
		
			current = current.next;
		}
		
		
		
	}
	
	
public static void main (String args[]) {

	MyLinkedList test = new MyLinkedList();
	test.addnodeafterTail(1 );
	test.addnodeafterTail(3);
	test.addnodeafterTail(5);
	test.addnodeafterTail(7);
	test.printNodes();
	
	System.out.println("**Called to insert node***=");
	
//	test.insertafter(3,4);
//	test.insertBefore(5,6);
//	test.removeNode(5);
	test.removeAfterNode(5);

	test.printNodes();
	

	
	
	
	
	
}



}
