package studio7;

public class Complex {
	private double real;
	private double imaginary;
	
	public Complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public double getReal() {
		return real;
	}
	
	public double getImaginary() {
		return imaginary;
	}
	
	public Complex add(Complex other) {
		double newReal = this.real + other.real;
		double newImaginary = this.imaginary + other.imaginary;
		return new Complex(newReal, newImaginary);
	}
	
	public Complex multiply(Complex other) {
		double newReal = (this.real * other.real) - (this.imaginary * other.imaginary);
		double newImaginary = (this.real * other.imaginary) + (this.real * other.imaginary);
		return new Complex(newReal, newImaginary);
	}
	
	@Override
    public String toString() {
        if (imaginary >= 0) {
            return real + " + " + imaginary + "i";
        } else {
            return real + " - " + Math.abs(imaginary) + "i";
        }
    }
	
	 public static void main(String[] args) {
	        Complex num1 = new Complex(3, 4);    // Represents 3 + 4i
	        Complex num2 = new Complex(1, -2);   // Represents 1 - 2i

	        System.out.println("Complex Number 1: " + num1);
	        System.out.println("Complex Number 2: " + num2);

	        // Testing addition
	        Complex sum = num1.add(num2);
	        System.out.println("Sum: " + sum);

	        // Testing multiplication
	        Complex product = num1.multiply(num2);
	        System.out.println("Product: " + product);
	    }
}
