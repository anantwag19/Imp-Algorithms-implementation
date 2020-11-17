import java.util.*;

class ThreeLargestNumber {
  public static int[] findThreeLargestNumbers(int[] array) {
	  
	  int [] target = {0,0,0 }  ;
	  int tempH=0;
	  int tempM=0;
	  int tempL=0;
	  
	  for(int i=0;i<array.length;i++) {
		  if(array[i]>target[2]) {
			  tempH = target[2];
			  tempM= target[1];
			  target[2]=array[i];
			  target[1]= tempH;
			  target[0]=tempM ;
		  }//if
			  else if(array[i]>target[1]) {
				 tempM= target[1];
				 target[1]=array[i];
				 target[0]=tempM;
				 
				  
			  }//
			  
			  else if(array[i]>target[0]) {
				
				  target[0]=array[i];
				  
				  
			  }//
			  
		  
		  
		  }
		  
		  
	  return target ;

    // Write your code here.
   
  }
  
  
  public static void main (String args[]) {
	  
	  int[] array = {10,19,50,27,33,128};
	  
	  int[] getTarged= findThreeLargestNumbers(array);
	  
	  for (int i=0;i<getTarged.length;i++) {
		  System.out.println(getTarged[i]);
	  }
	  
  }
}
