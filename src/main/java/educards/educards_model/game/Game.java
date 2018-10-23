package educards.educards_model.game;

import java.util.ArrayList;

import educards.educards_model.card.Card;
import educards.educards_model.player.Player;

public class Game {

	Player player;
	Board board;
	Integer finalScore;
	
	public Game(Player player, ArrayList<Card> playerCards) {
		this.player = player;
		this.board = new Board(playerCards);
	}
	
	public void finishGame() {
		int score = this.calculateScore(board.checkPlayedCards());
		player.saveHiScore(score);
	}
	
	private int calculateScore(ArrayList<Boolean> result) {
		int score = 0;
		for(int i=0; i<result.size();i++) {
			if(result.get(i)) {
				score += 20;
			}
		}
		return score;
	}
}
