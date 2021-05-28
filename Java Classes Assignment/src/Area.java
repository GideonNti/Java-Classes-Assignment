//Q4

import java.util.Scanner;

public class Area {


		
	int length;
	int breadth;
	
	public Area(int l, int b) {
		length = l;
		breadth =b;
	
	}
	public int getArea() {
		return length*breadth;
	}
	public static void main(String[] args) {
	//Write a program to print the area of a rectangle by creating a class named 'Area' taking
		//the values of its length and breadth as parameters of its constructor and having a
		//method named 'returnArea' which returns the area of the rectangle. The length and
		//breadth of the rectangle are entered through the keyboard	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length : ");
		int l = scan.nextInt();
		System.out.println("Enter the breadth : ");
		int b = scan.nextInt();
		
		Area obj = new Area(l,b);
		System.out.println("The area of the triangle is given as : "+obj.getArea());
		
		
		scan.close();
	}

}
