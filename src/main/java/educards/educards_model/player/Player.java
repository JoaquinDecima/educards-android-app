package educards.educards_model.player;

public class Player {
	
	private Integer idPlayer;
	private String username;
	private Integer hiScore = 0;
	
	public Player(Integer id, String name) {
		idPlayer = id;
		username = name;
	}
	
	public void saveHiScore(int score) {
		if(score > hiScore) {
			hiScore = score;
		}
	}
	
	public Integer getId() {
		return idPlayer;
	}
	
	public String getUsername() {
		return username;
	}
	
	public Integer getHiScore() {
		return hiScore;
	}
}