public class CodeSignal1 {
	public static void main(String[] args) {
		
		//int inputInt = 456;
		//digitManipulation(inputInt);
		
		//String inputString = "aabaa";
		//System.out.println(checkPalindrome(inputString));
		
		//int[] aepArr = {2,5,7,4,2};
		//System.out.println(adjacentElementsProduct(aepArr));
		
		//int[] macArr = {2,4,6,8};
		//System.out.println(makeArrayConsecutive2(macArr));
		
		//int[] dupArr = {2, 1, 3, 5, 3, 2};
		//System.out.println(firstDuplicate(dupArr));
		
		String s = "abacadbc";
		System.out.println(firstNotRepeatingCharacter(s));
		
	}
	
	//From USAA Test. Take input int, find sum and product of all numbers in Int and return difference.
	public static int digitManipulation(int inputInt) {
		
		int product = 1;
		int sum = 0;
		char[] arr = String.valueOf(inputInt).toCharArray();
		for (int i = 0;i < arr.length; i++) {
			product = Character.getNumericValue(arr[i]) * product;
			sum += Character.getNumericValue(arr[i]);
		}
		return product - sum;
		
	}
	
	//From Arcade, the Journey Begins. Return true if palindrome, false if not.
	public static boolean checkPalindrome(String inputString) {
	    String backstring = new StringBuffer(inputString).reverse().toString();
	    return(inputString.equals(backstring));
		
	}
	
	//From Arcade Edge of the Ocean, Level 1. Return the largest product of adjacent elements in an array.
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
	
	//From Arcade Edge of the Ocean Level 1. Given a array of numbers, find the number of missing values that would
	//make the array contain consectutive numbers. 
	public static int makeArrayConsecutive2(int[] statues) {
		int minStatue = Integer.MAX_VALUE;
		int maxStatue = Integer.MIN_VALUE;
		for(int i=0;i<statues.length;i++){
		    minStatue = Math.min(minStatue, statues[i]);
		    maxStatue = Math.max(maxStatue, statues[i]);
		} 
		return ((maxStatue - minStatue) +1) - statues.length;
	}

	
	//From Interview Practice - Arrays. Return the duplicate number for which the second occurrence has the smallest index. 
	public static int firstDuplicate(int[] a) {
	    for (int i = 0; i < a.length;i++) {
	        int charNum = a[i];
	        if (a[Math.abs(charNum) - 1] > 0) {
	              a[Math.abs(charNum) - 1] = -1 * a[Math.abs(charNum) - 1];
	        } else {
	              return Math.abs(charNum);
	        }
	    }

		return -1;
	}
	public static char firstNotRepeatingCharacter(String s) {        
	    //I took the brute force route. Take each char in string (outer loop) and compare it to each char in String (inner  loop.)
	    //if it repeats, break to next iteration and reset the repeat flag to false. 
	    //I could have iterated through, made an array of the count of each char, iterated through again and if
	    //count==1, then its non repeating. either way works, the 2nd way is probably more efficient. 
	    boolean charRepeats = false;
	    char returnValue = '_';
	    for(int i=0;i<s.length();i++){
	        charRepeats = false;
	        for(int j=0;j<s.length();j++){
	            if(i != j){
	                if(s.charAt(i) == s.charAt(j)){
	                   charRepeats = true;
	                   break;
	                }
	            }
	        }
	        if(!charRepeats){
	            returnValue = s.charAt(i);
	            break;
	        }
	    }
	    return returnValue;
	}

	
	
}
