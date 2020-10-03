package myJavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class CountWordsinthstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Count the words ii a tirng
		
		String str = "Hi Hi How are are you";
		
		//hi -2
		//how-1
		//are-2
		//you-1
		//sprlits the strung wiwththe white apce 
		//string into an array - itratrion
		//use Hash map for cocunting the works -- create aone ampa  and we qre goinf to check wjrtehr yhe woerds are presen tinthe mao if presen\
		//if present cunt and pri'
		//if nit present eabe
		
		String[] ArrayString = str.split(" ");
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		int count= 1;
		
		for (int i = 0; i < ArrayString.length; i++) {
			
			if(!map.containsKey(ArrayString[i])) {
				map.put(ArrayString[i], count);
				
			}
			else {
				map.put(ArrayString[i],map.get(ArrayString[i])+1);
			}
			
		}
				
//f or printing
		
		for (String a : map.keySet()) {

			
			System.out.println("The cou tof te words "+a+" = "+map.get(a));
			
		}
	}

}
