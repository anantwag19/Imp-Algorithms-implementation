
import java.util.*;


public class Graph_Breadth_First_Search{

static class Node{

String name;
ArrayList<Node> children = new  ArrayList<Node>();

Node(String name){
this.name = name ;
}//constructor
}//Node inner class 

public static  ArrayList<String> traverse(Node parent, ArrayList<String> array) {//A,B,E
	
	Queue<Node> q = new LinkedList<Node>();
	q.add(parent);	
	while(!q.isEmpty()) {
	Node current =q.poll();
	array.add(current.name);	
	q.addAll(current.children);
			
	}
	
	return array;

}// 
	
public static void main (String args[]) {
	
	Node A= new Node("A");
	Node B =new Node("B");
	Node C =new Node("C");
	Node D =new Node("D");
	Node E =new Node("E");
	Node F =new Node("F");
	Node G =new Node("G");
	Node H =new Node("H");
	Node K =new Node("K");
	Node I =new Node("I");
	Node J =new Node("J");
	A.children.add(B);
	A.children.add(C);
	A.children.add(D);
	B.children.add(E);
	B.children.add(F);
	D.children.add(G);
	D.children.add(H);
	G.children.add(K);
	F.children.add(I);
	F.children.add(J);
	
	
	ArrayList<String> array =new ArrayList<String>();
	
	
	Iterator<String> i = traverse(A,array).iterator();
	
	while(i.hasNext()) {
	System.out.println(i.next());
	}
	
	
}


}//BST
