
//@@@@@ The catch is this :  mid=(left+right)/2,Now if you are not putting left+right  inside () Braket you are gone , This will give Shit results non working ..

import java.util.*;


class BinarySearch {
  public static int binarySearch(int[] array, int target) {
    int left=0 ;int right=array.length-1;
		while(left<=right){
		
			int mid = (left+right)/2;
			if(array[mid]==target){
				return mid;
			}
			if(array[mid]>target){
				right=mid-1;
			}
			else{
					left=mid+1;
			}
				
			
		}
		
    return -1;
  }
  
  public static void main(String args[]) {
	  int[] array= {0, 1, 21, 33, 45, 45, 61, 71, 72, 73};
	  System.out.println(binarySearch(array,33));
	  
  
  
}

}
