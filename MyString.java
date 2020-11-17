import java.lang.*;
import java.util.HashMap;
//
public class MyString {
	public String getPalindromDecison(String s ) {
		char[] c= s.toCharArray();	
		String temp="";
		for(int i=0;i<c.length;i++) {
			while(c.length-1-i>=0) {
				if(c[i]==c[c.length-1-i]) {
					temp =temp+c[i];
				}
				break;
			}
		}
		
		return temp;
	
	}
	
public static void main(String args[]) {
		String s ="abcdefg";
		MyString st= new MyString();
		System.out.println(st.getPalindromDecison(s));
		
		
	}

}

