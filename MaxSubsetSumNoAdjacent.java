import java.util.*;

public class MaxSubsetSumNoAdjacent {

	public int[] maxSubsetSumNoAdjacent(int[] array) {
		
		int finalsum = 0;
		int sum=0;

		for (int i = 0; i < array.length - 1; i++) {
			int size = 6;
			int secondHighest = array[i + 2];
			int position = i + 2;
		
			int thirdHigestposition = callThirdHighest(array, position);
			if (thirdHigestposition != position + 1) {

			sum = array[i] + array[position] + array[thirdHigestposition];

			if (sum > finalsum) {
					return new int[] { array[i], array[position], array[thirdHigestposition] };
			} 
			else {
				
				finalsum = sum;
			}
		} // if
			

	}// for loop
		return new int[]{1,2};
	}
	public int callThirdHighest(int[] array, int position) {
		int current = position + 1;
		int thirdhighest = array[current];
		int counter = 0;

		while (current < array.length - 1) {
			if (array[current] > array[current + 1]) {
				thirdhighest = array[current];
				counter = current;

			} // ifend
			else {
				thirdhighest = array[current + 1];
				counter = current + 1;
			} // endelse

			current = current + 1;
		} // while loop

		return counter;

	}// callThirdHighest

}// Class ending