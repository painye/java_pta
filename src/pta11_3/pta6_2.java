package pta11_3;

import java.util.Scanner;
import java.text.DecimalFormat;

interface IShape {
    public abstract double getArea();

    public abstract double getPerimeter();
}


class RTriangle implements IShape
{
	double a,b;
	RTriangle(){
		a=0;
		b=0;
	}
	
	
	RTriangle(double x, double y)
	{
		a=x;
		b=y;
	}


	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return a*b/2.0;
	}


	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return (a+b+Math.sqrt(a*a+b*b));
	}
	
	
}


public class pta6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat d = new DecimalFormat("#.####");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        IShape r = new RTriangle(a, b);
        System.out.println(d.format(r.getArea()));
        System.out.println(d.format(r.getPerimeter()));
        input.close();
		
	}

}
