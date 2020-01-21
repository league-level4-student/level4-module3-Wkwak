package _02_gotta_catchem_all;

public class ExceptionMethods {
	
	public double divide (double a, double b) throws IllegalArgumentException {
		if(b==0) {
			throw new IllegalArgumentException();
		}
		return a/b;
	}
	
	public String reverseString (String word) throws IllegalStateException{
		if(word.length()==0) {
			throw new IllegalStateException();
		}
		String reversed = "";
		for (int i = 0; i < word.length(); i++) {
			reversed += word.charAt(word.length()-1-i);
		}
		
		return reversed;
	}
}
