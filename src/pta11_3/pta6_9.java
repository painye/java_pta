package pta11_3;
import java.util.Scanner;

public class pta6_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
	    double l = input.nextDouble();
	    double w = input.nextDouble();
	    double h = input.nextDouble();
	    Cuboid myCuboid = new Cuboid(l, w, h);
	    System.out.println(myCuboid.getArea());
	    System.out.println(myCuboid.getVolume());

	    input.close();
	}

}

class Cuboid
{
	private double length;
	private double width;
	private double height;
	Cuboid()
	{
		length=1;
		width=1;
		height=1;
	}
	
	Cuboid(double l,double w, double h)
	{
		length=l;
		width=w;
		height=h;
	}
	
	public double getArea()
	{
		return 2*(length*width+length*height+width*height);
	}
	
	public double getVolume() {
		return   length*width*height;
	}
}