package CaesarCypher;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CaesarCypherTest {
	
	private CaesarCipher caesarCipher = new CaesarCipher();

	@Test
	void testCipheredMessageWithOffsetOf12() {
		assertEquals("ftue xqeeaz ue hqdk rgz", caesarCipher.cipher("this lesson is very fun", 12));
	}
	
	@Test
	void testEmptyString() {
		assertEquals("", caesarCipher.cipher("", 12));
	}

}
