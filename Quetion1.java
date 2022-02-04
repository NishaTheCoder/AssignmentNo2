/*Follow naming convention rule
 -number of positive numbers
 -number of negative numbers
 -number of odd numbers
 -number of even numbers
 -number of 0s.

*/

package assignmentQuetions;

import java.util.Scanner;

public class Quetion1 {

	public static void main(String[] args) {
		
		
        Scanner sc = new Scanner(System.in);
		
		int pos=0,neg=0,even=0,odd=0,zero=0;
		
		int []array = new int[20];
		
		System.out.println("Enter 20 array elements:");
		
		for(int i=0;i<20;i++)
		{
			System.out.println("Enter" +"["+i+"]"+ "index element:");
			array[i]=sc.nextInt();
		}
		
		for(int i=0;i<20;i++)
		{
			
			if(array[i]==0)
			{
				zero++;
			}
		}
			
		for(int i=0;i<20;i++)
		{	
		    if(array[i]>=0)
			{
				pos++;
			}
		    else
		    {
		    	neg++;
		    }
		}
		
		for(int i=0;i<20;i++)
		{	
		    
			if(array[i] % 2 == 0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
			
				
		
		
		System.out.println("Number of positive numbers are:"+pos);
		System.out.println("Number of negative numbers are:"+neg);
		System.out.println("Number of odd numbers are:"+odd);
		System.out.println("Number of even numbers are:"+even);
		System.out.println("Number of zero numbers are:"+zero);
		
		
		
	}

}
