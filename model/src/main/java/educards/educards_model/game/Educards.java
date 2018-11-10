package educards.educards_model.game;

import java.util.ArrayList;

import educards.educards_model.card.Card;
import educards.educards_model.card.CardAdministrator;
import educards.educards_model.player.Player;
import educards.educards_model.player.PlayerAdministrator;

public class Educards {

	PlayerAdministrator playerAdministrator = new PlayerAdministrator();
	CardAdministrator cardAdministrator = new CardAdministrator();
	
	public Educards() {}
	
	public ArrayList<Player> getRanking(){
		return playerAdministrator.getRanking();
	}
	
	public ArrayList<Card> getCards(){
		return cardAdministrator.getCards();
	}
}
