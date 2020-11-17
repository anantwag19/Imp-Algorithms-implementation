import java.util.*;

public class Sorted_Matrix_Positon {

static String  getTargetfromMatrix(int[][] Matrix,int target) {
	
	int row=0;
	int col= Matrix[0].length-1;

	
	while(row<Matrix.length  && col>=0) {
		
		if(Matrix[row][col]<target) {
			row++;
		}
		else if(Matrix[row][col]>target) {
			col--;
		}
		else if(Matrix[row][col]==target) {
			return Integer.toString(row).concat(Integer.toString(col)) ;
		}
		
	}
	
	
return "no";

}

public static void main(String args[]) {
	
	int[][] Matrix = {
			{1,4,7,12,15,1000},
			{2,5,19,31,32,1001},
			{3,8,24,33,35,1002}
			
	} ;
	int col= Matrix[0].length-1;
	System.out.println("Length"+col);
	
	System.out.println(getTargetfromMatrix(Matrix,78));


}

}

