//Q5
public class Complex {



	
	int real ;
	int imag ;
	
	public Complex(int r, int i) {
		real = r;
		imag = i;
		
	}
	public static Complex add(Complex a, Complex b) {
		return new Complex((a.real+b.real),(a.imag+b.imag));
	}
	public static Complex diff(Complex a, Complex b) {
		return new Complex((a.real-b.real),(a.imag-b.imag));
	}
	
	public static Complex product(Complex a, Complex b) {
		return new Complex(((a.real*b.real)-(a.imag*b.imag)),((a.imag*b.imag)+(a.imag*b.real)));
	}
	
	public void printComplex() {
		if (real ==0 && imag!=0) {
			System.out.println(imag+" i");
		}
		else if (imag ==0 && real !=0) {
			System.out.println(real);
			
		}else {
			System.out.println(real+" + "+"i");
		}
	}
	
	
	public static void main(String[] args) {
		Complex a = new Complex(10,11);
		Complex b = new Complex(8,4);
		
		Complex c= Complex.add(a, b);
		Complex d= Complex.diff(a, b);
		Complex e= Complex.product(a, b);
		
		c.printComplex();
		d.printComplex();
		e.printComplex();

	}

}

