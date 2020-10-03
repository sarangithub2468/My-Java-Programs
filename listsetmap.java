package myJavaPrograms;

import java.util.ArrayList;
import java.util.List;

public class listsetmap {

	//store  multiple values
	//we can string[] array = new string[5]
	//2 way st storr ecolleciton

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		String[] arr = new String[4];

		arr[0]="r";
		
		System.out.println(arr[0]);
	}*/
		
	//Removing dupliate elements from list
		List<String> Dup = new ArrayList<String>();
		Dup.add("Science");
		Dup.add("Maths");
		Dup.add("Science");
		Dup.add("Bio");
		Dup.add("Physics");
		System.out.println(Dup);
	/*	for (int i = 0; i < Dup.size(); i++) {
			System.out.println(Dup.get(i));
			
		}*/
		System.out.println(Dup.size());
		for (int i = Dup.size()-1; i>=0; i--) {
			System.out.println(Dup.get(i));

		}
	}	


}
