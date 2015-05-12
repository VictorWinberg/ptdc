package inl2;

public class Complex {
	
	private double re, im;
	
	/** Skapar en komplex variabel med realdelen re och imagin√§rdelen im */
	public Complex(double re, double im) {
		this.re = re;
		this.im = im;
	}
	/** Tar reda på realdelen */
	double getRe() { return re; }
	/** Tar reda på imagin√§rdelen */
	double getIm() { return im; }
	/** Tar reda på talets absolutbelopp i kvadrat */
	double getAbs2() { return re * re + im * im; }
	
	/** Adderar det komplexa talet c till detta tal */
	void add(Complex c) {
		re += c.re;
		im += c.im;
	}
	/** Multiplicerar detta tal med det komplexa talet c */
	void mul(Complex c) {
		double tempRe = re * c.re - im * c.im;
		im = re * c.im + im * c.re;
		re = tempRe;
	}
}