package educards.educards_model.player;

import java.util.ArrayList;
import java.util.Collections;

public class PlayerAdministrator {

	private ArrayList<Player> players = new ArrayList<Player>();
	
	public void addPlayer(Player player) {
		players.add(player);
	}
	
	public int getNumberOfPlayers(){
		return players.size();
	}

	public ArrayList<Player> getRanking() {
		ArrayList<Player> ranking = new ArrayList<Player>(players);
		Collections.sort(ranking, (p1,p2) -> p1.getHiScore().compareTo(p2.getHiScore()));
		Collections.reverse(ranking);
		return ranking;
	}
	
}
