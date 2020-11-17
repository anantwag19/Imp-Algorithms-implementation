import java.util.Stack;

public class RoughWork2 {
	public static void main (String args[]) {
		Stack s = new Stack();
		s.add("X");
		s.add("Y");
		s.add("Z");
		s.pop();
		
		for(int i=0;i<=s.size();i++) {
			System.out.println(s.get(i));
		}
	}

}
