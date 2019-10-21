package pta11_3;

import java.util.Scanner;

public class pta7_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double dd = RR30.fun();
        System.out.printf("%.2f",dd);
	}

}

class RR30{

	public static double fun()
	{
		Scanner in = new Scanner(System.in);
        int a,b,c,d,e;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        d = in.nextInt();
        e = in.nextInt();
        return c*1.0;
	}

}