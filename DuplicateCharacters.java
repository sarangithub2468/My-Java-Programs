package myJavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "amazon";
		
		char[] charArray = str.toCharArray();
		
		int count =1;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < charArray.length; i++) {
			
			if(!map.containsKey(charArray[i])){
				
				map.put(charArray[i], count);
			}
			else
			{
				map.put(charArray[i], map.get(charArray[i])+1);
				
			}
			
			
		}
		System.out.println(map.keySet());
		//printing
		for (char c : map.keySet()) {
			System.out.println("the count of charactwer "+c+" = "+map.get(c));
			if(c>1) {
				System.out.println(c);
			}
			else {
				System.out.println("no duplicates");
			}
		}
		
	}

}
