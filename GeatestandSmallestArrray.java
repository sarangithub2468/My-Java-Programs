package myJavaPrograms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class GeatestandSmallestArrray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numarray = {10,100,200,5,-1};
		System.out.println(Arrays.toString(numarray));

		int largest = numarray[0];
		int smallest = numarray[0];
				
		for (int i = 1; i < numarray.length; i++) {
			
			if(numarray[i]>largest) {
				largest=numarray[i];
						
			}
			else if(numarray[i]<smallest) {
				smallest=numarray[i];

			}
		}
		
		System.out.println("the smallest number is "+smallest);
		System.out.println("the largest number is "+largest);

	}

}
