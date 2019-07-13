
public class CodeSignal1 {
	public static void main(String[] args) {
		int[] a = {6,2,3,4,5,4};
		int b = 12345;
		//digitManipulation();
		//System.out.println(myFunction(a));
		System.out.println(checkPalindrome("aabaa"));
	}
	
	public static int myFunction(int[] a) {
		for (int i = 0; i < a.length;) {
			int charNum = a[i];
			
			if (a[Math.abs(charNum) - 1] > 0) {
			      a[Math.abs(charNum) - 1] = -1 * a[Math.abs(charNum) - 1];
			} else {
			      return Math.abs(charNum);
			}
		}

		return -1;
	}
	
	//From USAA Test
	public static void digitManipulation() {
		int b = 456;
		int product = 1;
		int sum = 0;
		//String num = String.valueOf(b);
		char[] arr = String.valueOf(b).toCharArray();
		for (int i = 0;i < arr.length; i++) {
			product = Character.getNumericValue(arr[i]) * product;
			sum += Character.getNumericValue(arr[i]);
		}
		System.out.println(product);
		System.out.println(sum);
		System.out.println(product - sum);
	}
	
	//From Arcade, the Journey Begins.
	public static boolean checkPalindrome(String inputString) {
	    String backstring = new StringBuffer(inputString).reverse().toString();
	    return(inputString.equals(backstring));
		
	}
	
	//From Arcade Edge of the Ocean, intro Level 1
	public static int adjacentElementsProduct(int[] inputArray) {
	    int bigProduct = Integer.MIN_VALUE;
	    for(int i=0;i<inputArray.length - 1;i++){
	    	//if(inputArray[i]*inputArray[i+1] > bigProduct)
	    	//	bigProduct = inputArray[i]*inputArray[i+1];
	    	//OR
	    	bigProduct = Math.max(bigProduct, inputArray[i] * inputArray[i+1]); 
	    }
	    return bigProduct;
	}
}
