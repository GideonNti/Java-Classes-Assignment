//Q2

public class Triangle {
	

	
	int x;
	int y;
	int z;
	
	public double getArea() {
		double s =(x+y+z)/2;
		
		return Math.pow((s*(s-x)*(s-y)*(s-z)), 1/2);
	}
	
	public double getParameter() {
		return (x+y+z)/2;
	}
	
	public static void main(String[] args) {
		//Write a program to print the area and pemeter of a triangle having sides of 3, 4, and 5
		//units by creating a class named 'Triangle' without any parameter in its constructor.

		Triangle obj = new Triangle();
		obj.x =3;
		obj.y =4;
		obj.z =5;
		
		System.out.println("The area is "+obj.getArea());
		System.out.println("The perimeter is "+obj.getParameter());

	
	}
}
