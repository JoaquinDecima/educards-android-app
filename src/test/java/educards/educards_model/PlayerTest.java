package educards.educards_model;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class PlayerTest {

	Player player;
	
	@Before
	public void setUp() {
		player = new Player(1,"pepe");
	}
	
	@Test
	public void testGetId() {
		assertTrue(1 == player.getId());
	}

	@Test 
	public void testGetUsername() {
		assertTrue("pepe" == player.getUsername());
	}
	
	@Test
	public void testGetHiScore() {
		assertTrue(0 == player.getHiScore());
	}
}
