//Authors: Heidi Hufford and Evan Lim
public class JavaBatPair {

	//Problem 1: Logic-2 > evenlySpaced
	public static boolean evenlySpaced(int a, int b, int c) {
		  //variables
		int small;
		int medium;
		int large;
		
		int smallMediumDiff;
		int mediumLargeDiff;
		
		//Determine which variable is the smallest, medium, and largest values
		//a is smallest
		if (a <= b && a <= c) {
			small = a; 
			
			if (b <= c) {
				medium = b;
				large = c;
			}
			else {
				large = b;
				medium =c;
			}
		}
		//b is smallest
		else if (b <= a && b <=c) {
			small = b; 
			
			if (a <= c) {
				medium = a;
				large = c;
			}
			else {
				large = a;
				medium =c;
			}
		}
		//c is smallest
		else {
			small = c; 
			
			if (a <= b) {
				medium = a;
				large = b;
			}
			else {
				large = a;
				medium =b;
			}
		}
		
		
		//find differences between values
		smallMediumDiff = medium-small;
		mediumLargeDiff = large-medium;
		
		//determine if differences are equivalent
		if (smallMediumDiff == mediumLargeDiff) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/*
	 * JavaBat Results:
	 * Expected	Run		
		evenlySpaced(2, 4, 6) → true	true	OK	
		evenlySpaced(4, 6, 2) → true	true	OK	
		evenlySpaced(4, 6, 3) → false	false	OK	
		evenlySpaced(6, 2, 4) → true	true	OK	
		evenlySpaced(6, 2, 8) → false	false	OK	
		evenlySpaced(2, 2, 2) → true	true	OK	
		evenlySpaced(2, 2, 3) → false	false	OK	
		evenlySpaced(9, 10, 11) → true	true	OK	
		evenlySpaced(10, 9, 11) → true	true	OK	
		evenlySpaced(10, 9, 9) → false	false	OK	
		evenlySpaced(2, 4, 4) → false	false	OK	
		evenlySpaced(2, 2, 4) → false	false	OK	
		evenlySpaced(3, 6, 12) → false	false	OK	
		evenlySpaced(12, 3, 6) → false	false	OK	
		other tests
		OK	
		
		All Correct
	 */
	
	
	
	
	
	
	//Problem 2: String-2 > plusOut
	
	public static String plusOut(String str, String word) {
		 //define variables
		String sub = "";
		String answer = "";
		int stringLength = str.length();
		int wordLength = word.length();
		
		//go through each substring to check if it equals word
		for (int i = 0; i < stringLength-wordLength+1; i++) {
			sub = str.substring(i, i+wordLength);
			//if yes, skip to next location
			if (sub.equals(word)) {
				answer += word;
				i += wordLength-1;
				
			}
			//if no, change first character to a plus sign
			else {
				answer += "+";
			}
			
			//if next position is within the word length of the end of the string, change all remaining to plus signs
			if (i >= (stringLength-wordLength)) {
				for (int j = 0; j < stringLength-i-1; j++) {
					answer += "+";
				}
			}
		}
		
		return answer;
	}
	/*
	 * JavaBat Results
	 * Expected	Run		
		plusOut("12xy34", "xy") → "++xy++"	"++xy++"	OK	
		plusOut("12xy34", "1") → "1+++++"	"1+++++"	OK	
		plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"	"++xy++xy+++xy"	OK	
		plusOut("abXYabcXYZ", "ab") → "ab++ab++++"	"ab++ab++++"	OK	
		plusOut("abXYabcXYZ", "abc") → "++++abc+++"	"++++abc+++"	OK	
		plusOut("abXYabcXYZ", "XY") → "++XY+++XY+"	"++XY+++XY+"	OK	
		plusOut("abXYxyzXYZ", "XYZ") → "+++++++XYZ"	"+++++++XYZ"	OK	
		plusOut("--++ab", "++") → "++++++"	"++++++"	OK	
		plusOut("aaxxxxbb", "xx") → "++xxxx++"	"++xxxx++"	OK	
		plusOut("123123", "3") → "++3++3"	"++3++3"	OK	
		other tests
		OK	
		
		All Correct
	 */
	
	
	
	
	
	
	//Problem 3: Array-3 > countClums
	public static int countClumps(int[] nums) {

	    if (nums.length <2){
	    return 0;
	  }
	  
	  //variables
	  int temp = nums[0];
	  int counter = 1;
	  int numClumps = 0;
	  

	  
	  //check temp againt next 
	  for(int i = 0; i < nums.length-1; ++i)
	  {
	   //if temp = next move to next spot
	   if(temp == nums[i+1])
	   {
	     counter++;
	     if (i == nums.length-2 && counter >=2){
	       numClumps++;
	     }
	     continue;
	   }
	  
	  //if temp != next, and counter < 2
	  else if((temp != nums[i+1]) && counter < 2)
	    {
	      
	    //don;t at to number of clumps 
	    //move the temp to the current next
	    temp = nums[i+1];
	    //reset counter
	    counter = 1;
	    }
	  //if temp != next, and counter >= 2
	  else if ((temp != nums[i+1]) && counter >= 2)
	  {
	    // add 1 to the number of clumps
	    numClumps++;
	    //reset counter
	    counter = 1;
	    //move the temp to the current next
	    temp = nums[i+1];
	  }
	  
	  }
	  
	  return numClumps;

	}
	/*
	 * JavaBat Results:
	 * Expected	Run		
		countClumps([1, 2, 2, 3, 4, 4]) → 2	2	OK	
		countClumps([1, 1, 2, 1, 1]) → 2	2	OK	
		countClumps([1, 1, 1, 1, 1]) → 1	1	OK	
		countClumps([1, 2, 3]) → 0	0	OK	
		countClumps([2, 2, 1, 1, 1, 2, 1, 1, 2, 2]) → 4	4	OK	
		countClumps([0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2]) → 4	4	OK	
		countClumps([0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2]) → 5	5	OK	
		countClumps([0, 0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2]) → 5	5	OK	
		countClumps([]) → 0	0	OK	
		other tests
		OK	
		
		All Correct
	 */

	
	
	
	
	
	//Problem 4: Array-3 > fix34
	public static int[] fix34(int[] nums) {
		  
		  //variables
		  int[] newArray1 = new int[nums.length];
		  int[] newArray2 = new int[nums.length];
		  int[] newArray3 = new int[nums.length];
		  int k = 0;
		  
		  //first for loop fills newArray1 with zeros and 3s and 4s
		  for (int i = 0; i < nums.length; i++)
		  {
		    if (nums[i] == 3){
		      newArray1[i] = 3;
		      newArray1[i+1] =4;
		      i++;
		    }
		    else{
		      newArray1[i] = 0;
		      
		      
		    }
		  }
		  
		  for (int m = 0; m < nums.length; m++){
		    if (nums[m] !=4 && nums [m] !=3){
		        newArray2[k] = nums[m];
		        k++;
		      }
		  }
		  
		  
		  
		  int counter = 0;
		  //second for loop fills in extra numbers
		  for (int j = 0; j < nums.length; j++)
		  {
		    if (newArray1[j] == 0)
		    {
		      newArray3[j] = newArray2[counter];
		      counter++;
		    }
		    else{
		      newArray3[j] = newArray1[j];
		    }
		  }
		  
		  
		  return newArray3;
	}
	/*
	 * JavaBat Results:
	 * Expected	Run		
		fix34([1, 3, 1, 4]) → [1, 3, 4, 1]	[1, 3, 4, 1]	OK	
		fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]	[1, 3, 4, 1, 1, 3, 4]	OK	
		fix34([3, 2, 2, 4]) → [3, 4, 2, 2]	[3, 4, 2, 2]	OK	
		fix34([3, 2, 3, 2, 4, 4]) → [3, 4, 3, 4, 2, 2]	[3, 4, 3, 4, 2, 2]	OK	
		fix34([2, 3, 2, 3, 2, 4, 4]) → [2, 3, 4, 3, 4, 2, 2]	[2, 3, 4, 3, 4, 2, 2]	OK	
		fix34([5, 3, 5, 4, 5, 4, 5, 4, 3, 5, 3, 5]) → [5, 3, 4, 5, 5, 5, 5, 5, 3, 4, 3, 4]	[5, 3, 4, 5, 5, 5, 5, 5, 3, 4, 3, 4]	OK	
		fix34([3, 1, 4]) → [3, 4, 1]	[3, 4, 1]	OK	
		fix34([3, 4, 1]) → [3, 4, 1]	[3, 4, 1]	OK	
		fix34([1, 1, 1]) → [1, 1, 1]	[1, 1, 1]	OK	
		fix34([1]) → [1]	[1]	OK	
		fix34([]) → []	[]	OK	
		fix34([7, 3, 7, 7, 4]) → [7, 3, 4, 7, 7]	[7, 3, 4, 7, 7]	OK	
		fix34([3, 1, 4, 3, 1, 4]) → [3, 4, 1, 3, 4, 1]	[3, 4, 1, 3, 4, 1]	OK	
		fix34([3, 1, 1, 3, 4, 4]) → [3, 4, 1, 3, 4, 1]	[3, 4, 1, 3, 4, 1]	OK	
		other tests
		OK	
		
		All Correct
	 */
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
	}
}
