package myJavaPrograms;

public class CountdigitsinaNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count= 0;
		int num =564656;
		
		while (num>0) {
			num=num/10;
			count++;
		}
System.out.println(count);
	}

}
