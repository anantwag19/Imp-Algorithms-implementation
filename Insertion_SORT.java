
import java.util.*;
//array			[8,2,1]


			
public class Insertion_SORT {

public int[] sortArray(int[] array) throws Exception  {
	for(int i=1;i<array.length;i++) {
		int j=i;
		while(j>0 && array[j]< array[j-1]) {
		
				
				int temp =array[j];
				array[j]=array[i];
				array[i]=temp;
				
			
			j=j-1 ;
			
		}//while
		
	}//forloop
	return array;
	
	
	
}

public static void main(String args[]) {
	try {
	int[] arrayneeds_To_Sort = {8,6,9,7,1 } ;
	Insertion_SORT sort= new Insertion_SORT();
	int[] myarray=sort.sortArray(arrayneeds_To_Sort);
	for(int i=0;i<myarray.length;i++) {
		System.out.println(myarray[i]);
	}
	}
	catch(Exception e) {
		e.getStackTrace();
	}
}


}
