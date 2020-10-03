package myJavaPrograms;

public class Swappin2num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//logic 1 third variable		
		int a =1;
		int b =2 ;
		/*int c;
		
        c=a;
        a=b;
        b=c;	
        
        System.out.println("After Swapping the values are"   +a+"   "+b);*/
        
     //logic 2 -- using incremnetal and decre,ental operator
        
     a=a+b;//3
     b=a-b; //3-2 = 1
     a=a-b;
     System.out.println("After Swapping the values are"   +a+"   "+b);

     
        
	}

}
