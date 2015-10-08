
public class ScoreCalculator {
	
//This method is called with the collected item and current score when an item is collected
	
	public int setScore(Collectible col, int currentScore)
	{
		currentScore += col.getScore();
		return currentScore;
	}
	
	
	
}
