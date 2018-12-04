package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s)->{
			String n = "";
			for(int i = s.length()-1; i >= 0; i--) {
				n += s.charAt(i);
			}
			System.out.println(n);
		}, "backwards");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s)->{
			String n = "";
			for(int i = 0; i < s.length(); i++) {
				if(i % 2 == 0) {
					n+= s.toUpperCase().charAt(i);
				}else {
					n+= s.toLowerCase().charAt(i);
				}
				
			}
			System.out.println(n);
			
		}, "qwertyuiop");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s)->{
			String n = "";
			for(int i = 0; i < s.length(); i++) {
				n+= s.charAt(i);
				n+= '.';
				
			}
			System.out.println(n);
			
		}, "asdfhjklagd;slfjl");
		
		
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s)->{
			String n = "";
			for(int i = 0; i < s.length(); i++) {
				if(!(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'o' || s.charAt(i) == 'i' || s.charAt(i) == 'u')) {
					n+=s.charAt(i);
				}
			}
			System.out.println(n);
			
		}, "asdjkflhqiweabvlkjad");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
