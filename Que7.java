/*Write a java program to insert first 10 prime numbers in an array*/


package assignmentQuetions;

import java.util.Scanner;

public class Que7 {

	public static void main(String[] args) {

		int []array = new int[29];
		int count=0;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter array elements:");
        
        for(int i=0;i<=28;i++)
        {
        	array[i]=sc.nextInt();
        }
   
	    System.out.println("First 10 prime numbers:");
	    
	    for(int i=0;i<=28;i++)
	    {
	    	count=0;
	    	for(int j=2;j<=i/2;j++)
	    	{
	    		if(i%j==0)
	    		{
	    			count++;
	    			break;
	    		}
	    	}
	    	if(count==0)
	    	{
	    		System.out.println(i+"");
	    	}
	    }
		
	}

}
