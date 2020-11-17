
import java.util.*;
//Just make sure : Label here First : second, Will help to come out of Loop  using break : 
//requirnment is contorl should come out of both Inner and outside loop .

public class TwoNumberSum {

	public int[] getTwoNumberSum(int myArray[], int Sum) {

		int i = 0;
		int j = 0;
		
		int[] array;

		first: for (i = 0; i < myArray.length; i++) {

			second: for (j = i + 1; j < myArray.length; j++) {

				System.out.println("i  " + myArray[i]);

				System.out.println("j  " + myArray[j]);

				System.out.println("%%%%%%%%%%%%%%%%%");

				if (myArray[i] + myArray[j] == Sum) {
					System.out.println("Hurrey");

				
					break first;

				}

			} 

		
		}
		return new int[]{myArray[i],myArray[j]};

	}

	public static void main(String args[]) {

		int[] you = { 1, 3, 5,10,9,9 };
		int sum = 10;
		TwoNumberSum getResult = new TwoNumberSum();
		int[] traverse=getResult.getTwoNumberSum(you, sum);
		
		for(int i=0;i<traverse.length;i++) {
			System.out.println("number of"+traverse[i]);
		}

	}// psvm

}// Test