package Program1;

public class GameOfCrapsDemo {

	public static void main(String[] args) {
		GameOfCraps game;
		int wins = 0, loses = 0;
		final int ROUNDS = 1000000;
		
		for (int i = 0; i < ROUNDS; i++ ) {
			game = new GameOfCraps();
			if (game.result == GameOfCraps.RESULT.WIN || 
				game.result == GameOfCraps.RESULT.NATURAL)
				wins++;
			if (game.result == GameOfCraps.RESULT.LOSE ||
				game.result == GameOfCraps.RESULT.CRAPS)
				loses++;
			System.out.println(game);
		}
		
		System.out.println();
		System.out.printf("Wins: %d (%.2f%%)\n", wins, wins * 100.0 / ROUNDS); 
		System.out.printf("Loses: %d (%.2f%%)\n", loses, loses * 100.0 / ROUNDS);
	}

}
