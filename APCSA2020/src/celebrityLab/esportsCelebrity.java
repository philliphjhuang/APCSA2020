package celebrityLab;

public class esportsCelebrity extends Celebrity{
	
	private String esport;
	
	public esportsCelebrity(String answer, String esport,String clue) {
		super(answer, clue);
		// TODO Auto-generated constructor stub
		this.esport = esport;
	}
	
	
	public String getClue() {
		return clue;
	}
	
	public String getClue2() {
		return getClue();
	}
	
	
	@Override
	public String toString() {
		return "Your celebrity is " + getAnswer();
	}
}
