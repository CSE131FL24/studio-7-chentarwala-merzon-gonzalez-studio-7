package studio7;

import java.util.Random;

public class die {

	private int sides;
	private Random random;
	
	public die(int sides) {
		if (sides < 1) {
			throw new IllegalArgumentException("A die must have at least one side.");
		}
		this.sides = sides;
		this.random = new Random();
	}
	
	public int getSides() {
		return sides;
	}
	
	public int roll() {
		return random.nextInt(sides) + 1;
	}
	
	@Override
	public String toString() {
		return "Die with " + sides + "sides";
	}
	
	public static void main(String[] args) {
        die d6 = new die(8);  // Create a 6-sided die
        System.out.println(d6);  // Display die information
        System.out.println("Rolling the die: " + d6.roll());  // Roll the die and display the result

        die d20 = new die(20);  // Create a 20-sided die
        System.out.println(d20);
        System.out.println("Rolling the die: " + d20.roll());
    }
}
