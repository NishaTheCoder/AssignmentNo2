/*Follow naming convention rule
 -Write a program to find the sum and product of all elements of an array

*/

package assignmentQuetions;

import java.util.Scanner;

public class Que2 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int sum=0,mul=1;
		
		int []array = new int[5];
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter" +"["+i+"]"+ "index element:");
			array[i]=sc.nextInt();
			sum=sum+array[i];
			mul=mul*array[i];
		}
		
		System.out.println("Sum of array elements are:"+sum);
		System.out.println("Product of array elements are:"+mul);
	}

}
