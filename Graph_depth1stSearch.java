import java.util.*;


public class Graph_depth1stSearch {
	
	static class Node{
		String name ;
		
		ArrayList<Node> children = new  ArrayList<Node>() ;
		
		public Node(String name) {
			this.name =name;
		}
		
	}
	
	public static ArrayList<String> traverse(Node parent, ArrayList<String> array) {//A,B,E
		
	array.add(parent.name);//Array.ad('A',B,E

		for(int i=0 ;i!=parent.children.size();i++) {
			traverse(parent.children.get(i), array);
			
		}
		return array ;
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
		
		A.children.add(B);
		A.children.add(C);
		A.children.add(D);
		B.children.add(E);
		B.children.add(F);
		D.children.add(G);
		D.children.add(H);
		G.children.add(K);
		
		
		ArrayList<String> array =new ArrayList<String>();
		
		
		Iterator<String> i = traverse(A,array).iterator();
		
		while(i.hasNext()) {
		System.out.println(i.next());
		}
		
		
	}
	
	
}
