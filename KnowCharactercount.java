package myJavaPrograms;

public class KnowCharactercount {
//if we knw the character which we want the count 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sentence = "i am an confident person";
		System.out.println(sentence.length());
		int result = sentence.length()-sentence.replace("a", "").length();
		System.out.println(sentence.replace("a", "").length());

		System.out.println("The count of word a is : "+result);
	}

}
