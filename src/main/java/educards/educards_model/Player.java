package educards.educards_model;

public class Player {
	
	private Integer idPlayer;
	private String username;
	private Integer hiScore;
	
	public Player(Integer id, String name) {
		idPlayer = id;
		username = name;
	}
	
	public Integer getHiScore() {
		return hiScore;
	}
}