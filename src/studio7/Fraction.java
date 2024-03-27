package studio7;

public class Fraction {
	private double numerator;
	private double denominator;
	
	public Fraction(double n, double den) {
		numerator = n;
		denominator = den;
	}
	
	public Fraction() {
		numerator = 1;
		denominator = 1;
	}
	
	public double getValue() {
		return numerator/denominator;
	}
	
	public double getNumerator() {
		return numerator;
	}
	
	public double getDenominator() {
		return denominator;
	}
	
	public String toString() {
		String output = "This is a fraction with numerator " + numerator + " and denominator " + denominator;
		return output;
	}
	
	public static Fraction fractionAddition(Fraction a, Fraction b) {
		double num = a.getNumerator()*b.getDenominator()+b.getNumerator()*a.getDenominator();
		double den = a.getDenominator() * b.getDenominator();
		Fraction output = new Fraction(num, den);
		
		return output;
	}
	
	public static Fraction fractionMultiplication(Fraction a, Fraction b) {
		Fraction output = new Fraction(a.getNumerator()*b.getNumerator(), a.getDenominator()*b.getDenominator());
		
		return output;
	}
	


	public static void main(String[] args) {
		Fraction a = new Fraction(1, 2);
		Fraction b = new Fraction(1, 4);
		
		System.out.println(a.getValue());
		System.out.println(fractionAddition(a, b));
		System.out.println(a);
	}
}
