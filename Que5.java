package assignmentQuetions;

/*
 Write a java program to find the sum of two array elements?
 array1[]={10,20,30,40,50};
 Take values from keyboard
 array2[]={9,18,27,36,45}
  Take values from keyboard
*/
import java.util.Arrays;
import java.util.Scanner;

public class Que5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int []array1 = new int[5];
	    int []array2 = new int[5];
	    
	    int sum1=0,sum2=0;
	    System.out.println("Enter first array elements:");
	    for(int i=0;i<5;i++)
	    {
	    	array1[i]=sc.nextInt();
	    	sum1=sum1+array1[i];
	    }
	    
	    System.out.println(Arrays.toString(array1));
	    
	    System.out.println("Enter second array elements:");
	    
	    for(int i=0;i<5;i++)
	    {
	    	array2[i]=sc.nextInt();
	    	sum2=sum2+array2[i];
	    }
		
	    System.out.println(Arrays.toString(array2));
	    
	    System.out.println("Sum of first array elements are:"+sum1);
	    System.out.println("Sum of first array elements are:"+sum2);
	}

}
