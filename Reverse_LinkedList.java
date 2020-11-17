import java.util.*;
public class Reverse_LinkedList{

Node head ;
Node tail ;


static class Node{

int value ;
Node next ;

Node(int value){
    this.value =value ;
}

}//Node Class 


public void createLinkedList(int value){

Node newNode= new Node(value);

if (head==null){
head=tail=newNode ;
}//if

else{
tail.next = newNode;
tail =newNode;
tail.next =null ;

}//else

}//Method .

public void print() {
	Node current = head;
	while(current!=null) {
		System.out.println(current.value);
		
		current=current.next;
	}
}

public Node doReverse(Reverse_LinkedList r) {
	Node previousNode =null;
	Node currentNode=r.head;
	Node nextNode=null;
	
	while(currentNode!=null) {
		previousNode =currentNode.next;
		previousNode =currentNode;
		nextNode=currentNode.next;
		currentNode=nextNode;
	
	
	}
	
	return previousNode;
	
	
/*	this guy below iterates over linkedlist and print
Node current = mynewhead;
while(current!=null) {
	
	System.out.println("----"+current.value);
	
	current =current.next;
	
}*/
	
}



public static void main(String args[]) {
	Reverse_LinkedList test = new Reverse_LinkedList();
	test.createLinkedList(1);
	test.createLinkedList(2);
	test.createLinkedList(3);
//	test.print();
//	System.out.println("-------LinkedList");
	test.doReverse(test);
//	System.out.println("-------LinkedList");
//	test.print();

}

}//Linked list 
