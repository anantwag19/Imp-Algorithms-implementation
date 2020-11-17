
import java.util.Iterator;
import java.util.*;
public class MyHashMap {
	
	public static void main(String args[]) {
		HashMap h = new HashMap();
		h.put("1", "one");
		h.put("2", 2);
		h.put(3,4);

		Iterator it=  h.entrySet().iterator();
		
			for(int i=0;it.hasNext();i++) {
				Map.Entry m= (Map.Entry)it.next();
				System.out.println("key:"+m.getKey());
				
				System.out.println("value:"+m.getValue());
				
				
			}
		
		
		}
		
	}


