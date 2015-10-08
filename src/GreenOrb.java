public class GreenOrb extends Collectible {
	// Color of the orb is Green, if this orb is collected the score is increased by 5 points
	private int score = 5;
	private String color = "red";
	
	public int getScore() {
		return score;
	}
	public String getColor() {
		return color;
	}
}