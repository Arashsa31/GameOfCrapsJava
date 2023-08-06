package Program1;

import java.util.ArrayList;

public class GameOfCraps {
	public enum RESULT {
		// Fill code here
		WIN, NATURAL, LOSE, CRAPS
	}

	protected RESULT result;
	private int point = 0;
	private ArrayList<Integer> rolled = new ArrayList<Integer>();

	public GameOfCraps() {
		// Fill code here

		// first round of rolls
		PairOfDice diceRoll = new PairOfDice();
		diceRoll.rollDice();
		point = diceRoll.getDiceValue();

		// adds to the ArrayList
		rolled.add(point);

		// lose
		if (point == 2 || point == 3 || point == 12) {
			result = RESULT.CRAPS;
		}
		// win
		else if (point == 7 || point == 11) {
			result = RESULT.NATURAL;
		} else
			keepRolling();
	}

	private void keepRolling() {
		// Fill code here

		// second+ round of rolls
		PairOfDice diceRoll = new PairOfDice();

		while (true) {
			diceRoll.rollDice();
			int keepRolling = diceRoll.getDiceValue();

			// adds to the ArrayList
			rolled.add(keepRolling);

			if (keepRolling == 7) {
				result = RESULT.LOSE;
				break;
			} else if (keepRolling == point) {
				result = RESULT.WIN;
				break;
			}
		}
	}

	public RESULT getResult() {
		return result;
	}

	public String toString() {
		return rolled + " => " + result;
	}
}
