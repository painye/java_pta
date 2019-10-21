package pta11_3;

import java.util.Scanner;

public class pta7_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int a,b,c,d,e;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        d = in.nextInt();
        e = in.nextInt();
        RR1 rr = new RR1();
        double dd = rr.fun(a,b,c,d,e);
        System.out.printf("%.2f",dd);
	}

}

class RR1{

	public double fun(int x1,int x2, int x3, int x4, int x5)
	{
		return (x1+x2+x3+x4+x5)/5.0;
	}


}