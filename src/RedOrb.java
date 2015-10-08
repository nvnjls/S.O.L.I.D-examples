
public class RedOrb extends Collectible {

	// Color of the orb is red, if this orb is collected the score is reduced by 5 points
	
	private int score = -5;
	private String color = "red";
	
	public int getScore() {
		return score;
	}
	public String getColor() {
		return color;
	}
}
