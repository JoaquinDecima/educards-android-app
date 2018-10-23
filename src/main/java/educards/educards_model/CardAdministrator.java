package educards.educards_model;

import java.util.ArrayList;

public class CardAdministrator {

	private ArrayList<Card> cards = new ArrayList<Card>();
	
	public void addCard(Card card) {
		cards.add(card);
	}
	
	public ArrayList<Card> getCards(){
		return cards;
	}
}