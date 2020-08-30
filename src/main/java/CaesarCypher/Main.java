package CaesarCypher;

public class Main {

	public static void main(String[] args) {
		
		String message = "this lesson is very fun";
		int offset = 12;
		
		CaesarCipher caesarcipher = new CaesarCipher();
		String cipheredMessage = caesarcipher.cipher(message, offset);
		
		System.out.println("Original message: " + message);
		System.out.println("Our offset: " + offset);
		System.out.println("New message: " + cipheredMessage);
	}

}
