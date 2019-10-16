package pta11_3;

import java.util.Scanner;
import java.text.DecimalFormat;

abstract class shape {// ������
     /* ���󷽷� ����� */
    public abstract double getArea( );

    /* ���󷽷� ���ܳ� */
    public abstract double getPerimeter( );
}


class Circle extends shape
{
	double r;
	Circle()
	{
		r=0;
	}
	
	Circle(double x)
	{
		if(x<0) r=0;
		else r=x;
	}
	
	public double getArea()
	{
		return  3.1415926535898*r*r;
	}
	
	public double getPerimeter()
	{
		return 2* 3.1415926535898*r;
	}
}


public class pta6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("#.####");// ����4λС��
         double r = input.nextDouble( ); 
        shape c = new  Circle(r);

        System.out.println(d.format(c.getArea()));
        System.out.println(d.format(c.getPerimeter()));
        input.close();
	}

}
