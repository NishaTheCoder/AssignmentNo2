/*
 Write a java program to count the even and odd numbers in given array.
*/


package assignmentQuetions;

import java.util.Arrays;
import java.util.Scanner;

public class Que4 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       
        int even=0,odd=0;
		
		int []array = new int[5];
		
		for(int i=0;i<=4;i++)
		{
			System.out.println("Enter" +"["+i+"]"+ "index element:");
			array[i]=sc.nextInt();
		}
		
        System.out.print("Entered array elements are:");
        System.out.println(Arrays.toString(array));
		for(int i=0;i<=4;i++)
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
			
		System.out.println("Number of even numbers are:"+even);
		System.out.println("Number of odd numbers are:"+odd);
		
	}

}
