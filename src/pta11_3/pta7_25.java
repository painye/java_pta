package pta11_3;

import java.util.Arrays;
import java.util.Scanner;

public class pta7_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int w1=in.nextInt();
		int l1=in.nextInt();
		int w2=in.nextInt();
		int l2=in.nextInt();
		int r1=in.nextInt();
		int r2=in.nextInt();
		Circle25[] c=new Circle25[2]; 
		Rectangle25[] r=new Rectangle25[2];
		c[0]=new Circle25(r1);
		c[1]=new Circle25(r2);
		r[0]=new Rectangle25(w1,l1);
		r[1]=new Rectangle25(w2,l2);
		System.out.println(r[0].getPerimeter()+r[1].getPerimeter()+c[0].getPerimeter()+c[1].getPerimeter());
		System.out.println(r[0].getArea()+r[1].getArea()+c[0].getArea()+c[1].getArea());
		System.out.println(Arrays.deepToString(r));
		System.out.println(Arrays.deepToString(c));
		
	}

}

class Circle25
{
	int r;
	Circle25(int r1)
	{
		this.r=r1;
	}
	
	public int getPerimeter()
	{
		return (int) (Math.PI*2*r);
	}
	
	public int getArea()
	{
		return (int) (Math.PI*r*r);
	}
	
	public String toString()
	{
		return "Circle [radius="+r+"]";
	}
}

class Rectangle25
{
	private int width;
	private int length;
	
	Rectangle25(int w, int l)
	{
		width=w;
		length=l;
	}
	
	public int getPerimeter()
	{
		return 2*(width+length);
	}
	
	public int getArea()
	{
		return width*length;
	}
	
	public String toString()
	{
		return "Rectangle [width="+width+", length="+length+"]";
	}
}