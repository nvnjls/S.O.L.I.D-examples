
public class RunnerGame {

	ScoreCalculator sc = new ScoreCalculator();
	//some game logic
	Collectible col;
	//some game logic
	private void orbCollectedListener() {
		//TODO: some event handler finds the type of collectible and returns
		col= new RedOrb();//type of orb is hard coded
		sc.setScore(col, getCurrentScore());
	}
	
	public int getCurrentScore()
	{
		return 50;
	}
	// some game logic
	
	
}
