package educards.educards_model.card;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import educards.educards_model.card.Card;

public class CardTest {

	Card card;
	
	@Before
	public void setUp() {
		card = new Card(1,"The invention of Soap", "History", -1500);
	}
	
	@Test
	public void testGetId() {
		assertTrue(1 == card.getId());
	}

	@Test
	public void testGetName() {
		assertTrue("The invention of Soap" == card.getName());
	}
	
	@Test
	public void testGetHistory() {
		assertTrue("History" == card.getHistory());
	}
	
	@Test
	public void testGetYear() {
		assertTrue(-1500 == card.getYear());
	}
}
