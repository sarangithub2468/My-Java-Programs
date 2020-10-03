package myJavaPrograms;

public class Reversenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//reverse a num using algorith lo
		
		int rev=0;//using algorithm logic
		int num = 12345;
	
		while (num>0) {
			rev=rev*10+num%10;
			num =num/10;
			
		}
		System.out.println(rev);
		
	/*	for (int i = 1; i <6; i++) {
			
		rev=rev*10+num%10;
		num =num/10;
		}
		
		System.out.println(rev);*/
	}

}
