package Program1;

import java.util.Random;

public class PairOfDice {
	
	/*
	 * The only attributes of such an object are the face values of the dice. 
	 * They should be declared with private modifier.
	 */
	private int faceValue_1, faceValue_2;
	
	/*
	 * Provide a constructor which will initialize the face values of the dice.
	 */
	public PairOfDice() {
		faceValue_1 = 0;	
		faceValue_2 = 0;
		//alternative
		//rollDice();
	}

	/*
	 * Provide a void type public rollDice method that simulates rolling the dice.
	 */
	public void rollDice() {
		Random roll = new Random();
		faceValue_1 = roll.nextInt(6) + 1;
		faceValue_2 = roll.nextInt(6) + 1;
	}
	/*
	 * Provide a public getDiceValue method that returns the sum of the 
	 * face values of the dice.
	 */
	public int getDiceValue() {
		return faceValue_1 + faceValue_2;
	}
	/*
	 * Provide a toString method that returns a nicely formatted string 
	 * representing the pair of dice, for example “5 : 3 = 8”.
	 */
	public String toString() {		
		return faceValue_1 + " : " + faceValue_2 + " = " + this.getDiceValue();		
	}
}
