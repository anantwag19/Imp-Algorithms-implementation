import java.util.* ;

public class TwoNumberSum_nlogn{

public int[] getResult(int[] myArray,int Sum){

	
	System.out.println("myArray.length "+myArray.length);
	int i=0,j=myArray.length-1;
	Arrays.sort(myArray);//So that we can get this as a sorted order 
	First:while(i<myArray.length){
	System.out.println("inside"+i+""+j);
	if(myArray[i]+myArray[j]==Sum){
			System.out.println("Hurrey");
		break First;

		}//ifequalsum
	if(myArray[i]+myArray[j]<Sum){
	i++;
	}//ifgreater
	else{
		j=j-1;
	}//else
 }//while

	return new int[]{myArray[i],myArray[j]} ;
}//method

public static void main(String args[]) throws Exception{

int[]sendArray ={10,3,1,4,5,20,15,12,7,9} ;
 
TwoNumberSum_nlogn googleTest= new TwoNumberSum_nlogn();
int[] t =googleTest.getResult(sendArray,29);
for(int i=0;i<t.length;i++){
   System.out.println("---"+t[i]);
}

}//psvm

}//Test