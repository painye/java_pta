package pta11_3;

import java.util.Arrays;
import java.util.Scanner;

public class pta7_38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
		Shape38[] s=new Shape38[n];
		for(int i=0;i<n;i++)
		{
			String shape=in.next();
			if(shape.equals("rect"))
			{
				int w=in.nextInt();
				int l=in.nextInt();
				Rectangle38 r=new Rectangle38(w, l);
				s[i]=r;
			}else if(shape.equals("cir")) {
				int r=in.nextInt();
				Circle38 c=new Circle38(r);
				s[i]=c;
			}
		}
		System.out.println(sumAllArea(s));
		System.out.println(sumAllPerimeter(s));
		System.out.println(Arrays.toString(s));
		for(int i=0;i<n;i++)
		{
			System.out.println(s[i].getClass()+","+s[i].getClass().getSuperclass());
		}
		
	}
	
	public static double sumAllArea(Shape38[] s)
	{
		double sum=0;
		for(int i=0;i<s.length;i++)
		{
			sum=sum+s[i].getArea();
		}
		return sum;
	}
	
	public static double sumAllPerimeter(Shape38[] s)
	{
		double sum=0;
		for(int i=0;i<s.length;i++)
		{
			sum=sum+s[i].getPerimeter();
		}
		return sum;
	}

}

abstract class Shape38
{
	static double PI=3.14;
	public abstract double getPerimeter();
	public abstract double getArea();
}

class Rectangle38 extends Shape38
{
	int width,length;
	
	Rectangle38(int w, int l)
	{
		width=w;
		length=l;
	}
	
	

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*(width+length);
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width*length;
	}
	
	public String toString()
	{
		return "Rectangle [width="+width+", length="+length+"]";
	}
	
}


class Circle38 extends Shape38
{
	
	int radius;
	
	Circle38(int r)
	{
		radius=r;
	}
	
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return this.radius*this.PI*2;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return radius*PI*radius;
	}
	
	public String toString()
	{
		return "Circle [radius="+radius+"]";
	}
	
}