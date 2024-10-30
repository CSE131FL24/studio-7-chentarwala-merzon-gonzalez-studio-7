package studio7;

public class Fraction {
    private int numerator;   // Numerator of the fraction
    private int denominator; // Denominator of the fraction

    // Constructor
    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        simplify(); // Simplify the fraction upon creation
    }

    // Getter for numerator
    public int getNumerator() {
        return numerator;
    }

    // Getter for denominator
    public int getDenominator() {
        return denominator;
    }

    // Method to add this fraction to another fraction
    public Fraction add(Fraction other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    // Method to multiply this fraction by another fraction
    public Fraction multiply(Fraction other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    // Method to get the reciprocal of this fraction
    public Fraction reciprocal() {
        if (numerator == 0) {
            throw new ArithmeticException("Cannot take reciprocal of a fraction with numerator zero.");
        }
        return new Fraction(denominator, numerator);
    }

    // Method to simplify the fraction
    private void simplify() {
        int gcd = gcd(Math.abs(numerator), Math.abs(denominator));
        numerator /= gcd;
        denominator /= gcd;

        // Ensure denominator is positive
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    // Helper method to calculate the Greatest Common Divisor (GCD)
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // toString method for displaying fraction
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        Fraction frac1 = new Fraction(3, 4);
        Fraction frac2 = new Fraction(4, 3);

        System.out.println("Fraction 1: " + frac1);
        System.out.println("Fraction 2: " + frac2);

        // Testing addition
        Fraction sum = frac1.add(frac2);
        System.out.println("Sum: " + sum);

        // Testing multiplication
        Fraction product = frac1.multiply(frac2);
        System.out.println("Product: " + product);

        // Testing reciprocal
        Fraction reciprocal = frac1.reciprocal();
        System.out.println("Reciprocal of Fraction 1: " + reciprocal);
    }
}
