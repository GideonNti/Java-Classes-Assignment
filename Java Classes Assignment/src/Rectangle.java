//Q3
public class Rectangle {


	int length;
	int width;
	
	public Rectangle(int a, int b) {
		length = a;
		width = b;
	}
	
	public int Area() {
		return length*width;
	}
	public int Perimeter() {
		return 2*(length+width);
	}
	
	public static void main(String[] args) {
		//Write a program to print the area of two rectangles having sides (4,5) and (5,8)
		//respectively by creating a class named 'Rectangle' with a method named 'Area' which
		//returns the area and length and breadth passed as parameters to its constructor.

		Rectangle obj1 = new Rectangle(4,5);
		Rectangle obj2 = new Rectangle(5,8);
		
		System.out.println("The area is "+obj1.Area()+" and the perimeter is "+obj1.Perimeter());
		System.out.println("The area is "+obj2.Area()+" and the perimeter is "+obj2.Perimeter());
	
	}
}
