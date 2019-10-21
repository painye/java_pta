package pta11_3;

import java.util.Scanner;
class TDVector {
	private double x;
	private double y;
	public String toString() {
		return "("+this.x+","+this.y+")";
	}
	
	/** 你所提交的代码将被嵌在这里（替换此行） **/
	
	TDVector()
	{
		x=0;
		y=0;
	}
	
	TDVector(double a, double b)
	{
		x=a;
		y=b;
	}
	
	TDVector(TDVector t)
	{
		x=t.x;
		y=t.y;
	}
	
	public double getX()
	{
		return x;
		
	}
	
	public double getY()
	{
		return y;
	}
	
	public void setX(double a)
	{
		x=a;
	}

	
	public void setY(double b)
	{
		y=b;
	}
	
	public TDVector add(TDVector t)
	{
		return new TDVector(this.x+t.x, this.y+t.y);
	}
}

public class pta6_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TDVector a = new TDVector();  /* 无参构造，向量的x和y默认为0 */
		Scanner sc = new Scanner(System.in);
		double x,y,z;
		x = sc.nextDouble();
		y = sc.nextDouble();
		z = sc.nextDouble();		
		TDVector b = new TDVector(x, y);  /* 按照参数构造向量的x和y */
		TDVector c = new TDVector(b);  /* 按照向量b构造向量 */
		a.setY(z);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		c.setX(z);
		a = b.add(c);
		System.out.println(a);
		System.out.println("b.x="+b.getX()+" b.y="+b.getY());
		sc.close();
	}

}
