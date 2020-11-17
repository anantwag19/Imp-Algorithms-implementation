import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

// Amount =7   [1,5,10]
// 5*1+2*1=5+2=7

public class GetCoins {
	
	HashMap coinmap= new HashMap();
	
	public HashMap solvecoins(int[] array) {
		int coins =0;
		int totalamount=15 ;
		
		Arrays.sort(array);
		for(int i=array.length-1; i>=0;i--) {
			if(array[i]<totalamount) {
			 coins=	callgetCoins(totalamount,array[i]);
				int rAmount= totalamount -  coins*array[i];
				coinmap.put(array[i], coins);
				if(rAmount==0) {
					
					return coinmap ;
				}
				totalamount = rAmount;
		}
					
		}
		
		return coinmap ;
	}
	
	public int callgetCoins(int totalamount,int Coin_Type){
		
		int coins = totalamount/Coin_Type;
		
		return coins ;
		
	}
	
	
	
	
	public static void main(String args[]) {
		
			int[] a = {1,5,10};
			GetCoins t = new GetCoins();
		HashMap m	=t.solvecoins(a);

	    m.forEach((k,v)->System.out.println("Coinvalue : " + k + " number_Of_Coins : " + v));
	   
	
	}
	
	
}
