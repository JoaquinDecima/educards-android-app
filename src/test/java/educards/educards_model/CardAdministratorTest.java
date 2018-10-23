package educards.educards_model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class CardAdministratorTest {

	CardAdministrator cardAdministrator;
	Card mockCard;
	Card mockCard2;
	Card mockCard3;
	
	@Before
	public void setUp() {
		cardAdministrator = new CardAdministrator();
		mockCard = mock(Card.class);
		mockCard2 = mock(Card.class);
		mockCard3 = mock(Card.class);
	}
	
	@Test
	public void addCard() {
		cardAdministrator.addCard(mockCard);
		assertEquals(1,cardAdministrator.getCards().size());
	}
	
}
