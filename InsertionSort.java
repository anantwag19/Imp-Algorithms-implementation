
public class InsertionSort {
	public int[] doSort(int [] array){
		for(int i=0;i<array.length;i++){ 
			for(int j=i+1;j<array.length;j++){

			if(array[j]<array[i]){
				int temp= array[j] ;
				array[j]=array[i];
				array[i]=temp;
	 
			}//if
			}//innerfor
		}//outerfor
		return array ;
	}//end of method 

	public static void main(String args[]) {
		int[] array = {10,4,5,5,8,12,7,2}; 
		InsertionSort IS =new InsertionSort();
	int[] temp=	IS.doSort(array);
	for(int i=0;i<temp.length;i++) {
		System.out.println(temp[i]);
		
	}
		
	}




}
