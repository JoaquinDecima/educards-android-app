package educards.educards_model;

public class Card {

	private Integer idCard;
	private String name;
	private String history;
	private Integer year;
	
	public Card(Integer id, String cardName, String cardHistory, Integer cardYear) {
		idCard = id;
		name = cardName;
		history = cardHistory;
		year = cardYear;
	}
	
	public Integer getId() {
		return idCard;
	}
	
	public String getName() {
		return name;
	}
	
	public String getHistory() {
		return history;
	}
	
	public Integer getYear() {
		return year;
	}
}
