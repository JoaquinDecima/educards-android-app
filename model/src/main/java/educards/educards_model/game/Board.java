package educards.educards_model.game;

import java.util.ArrayList;
import java.util.Collections;

import educards.educards_model.card.Card;

public class Board {
	
	private ArrayList<Card> cardsToPlay;
	private ArrayList<Card> playedCards = new ArrayList<Card>();
	private ArrayList<Card> correctOrder;

	public Board(ArrayList<Card> cards) {
		cardsToPlay = cards;
		this.generateCorrectOrder();
	}
	
	public void playCard(Card card) {
		playedCards.add(card);
	}
	
	public ArrayList<Card> getPlayedCards(){
		return playedCards;
	}
	
	public ArrayList<Card> getCorrectOrder(){
		return correctOrder;
	}
	
	public void generateCorrectOrder() {
		correctOrder = new ArrayList<Card>(cardsToPlay);
		Collections.sort(correctOrder, (c1,c2) -> c1.getYear().compareTo(c2.getYear()));
	}
	
	public ArrayList<Boolean> checkPlayedCards(){
		ArrayList<Boolean> results = new ArrayList<Boolean>();
		for(int i=0; i< playedCards.size(); i++) {
			Boolean result = playedCards.get(i) == correctOrder.get(i);
			results.add(result);
		}
		return results;
	}
}