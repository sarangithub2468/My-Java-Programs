package myJavaPrograms;

public class MissingNuminArray {
	
public static void main(String[] args) {
	/*
	//logic
	fidn sum of elemtns in array
	find sum of elemtns from min to max numents in araneg of wlwmernts
	subtract bith
	we will get missing number*/
	//
	int[] a = {1,4,3,5};
	
	
	
int sum1=0;
//find sum of elemrnt s in array
for (int i = 0; i < a.length; i++) {
	
	sum1=sum1+a[i];
	
}
System.out.println(sum1);

//sum of rnage of elements

int sum2=0;

for (int i = 1; i <=5; i++) {
	sum2 =sum2+i;
	
}
System.out.println(sum2);

int missingnum =  sum2-sum1;
System.out.println(missingnum);
}

}
