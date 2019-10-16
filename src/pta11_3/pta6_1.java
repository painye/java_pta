package pta11_3;

import java.util.Scanner;

class Rectangle
{
	private double width, height;
	Rectangle()
	{
		width=1;
		height=1;
	}
	
	Rectangle(double w, double h)
	{
		width=w;
		height=h;
	}
	
	public double getArea()
	{
		return width*height;
	}
	
	public double getPerimeter()
	{
		return 2*(width+height);
	}
}

public class pta6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	    double w = input.nextDouble();
	    double h = input.nextDouble();
	    Rectangle myRectangle = new Rectangle(w, h);
	    System.out.println(myRectangle.getArea());
	    System.out.println(myRectangle.getPerimeter());

	    input.close();

	}

}
