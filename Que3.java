/*Follow naming convention rule
 -Write a program to check if elements of an array are same or not it read from front or back.
 E.g. int[] a={2,3,15,15,3,2};
*/

package assignmentQuetions;

import java.util.Arrays;
import java.util.Scanner;

public class Que3 {

	public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
		
		int []array = new int[]{2,3,15,15,3,2};
		int []revCheArrayEle = new int[5]; 
		
		boolean flag = false;

		System.out.println(Arrays.toString(array));
		
		int j = revCheArrayEle.length-1;
		for(int i=0;i<array.length-1;i++,j--)
		{
			revCheArrayEle[j]=array[i];
		}
		
	  System.out.println();
	  
	  for(int i=0;i<array.length-1;i++)
	  {
		if(array[i]==revCheArrayEle[i])
		{
		  flag = true;
		}
		else
		{
			flag = false;
		}
	  }
	  
	  if(flag==true)
	  {
	  System.out.println("Elements of array are same");
	  }
	  else{
		  System.out.println("Elements of array are not same");
	  }
	    
		//System.out.println(Arrays.toString(revCheArrayEle));
	}

		
	}


