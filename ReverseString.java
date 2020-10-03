package myJavaPrograms;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "map";
		
		//using stri g budffwer class
		
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		//not using string buffer
			char[] charArray = str.toCharArray();
		
		for (int i = charArray.length-1; i >=0; i--) {
			
			System.out.println(charArray[i]);
		}
		
	}

}
