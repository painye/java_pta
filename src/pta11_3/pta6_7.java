package pta11_3;

import java.util.Scanner;

public class pta6_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
	    //这边是你的代码
		int n= sc.nextInt();
		double m;
		int x;
		String s;
		String c;
		Object[] obj=new Object[n];
		for(int i=0;i<n;i++)
		{
			c=sc.next();
			switch(c.charAt(0))
			{
				case 'c': obj[i] = new Computer();break;
				case 'd': m=sc.nextDouble();obj[i] = new Double(m);break;
				case 'i': x=sc.nextInt(); obj[i]=new Integer(x);break;
				case 's': s=sc.next(); obj[i]=new String(s);break;
				default:
					obj[i]=null;
			}		
		}
		
		for(int i=n-1; i>=0;i--)
		{
			if(obj[i]!=null) System.out.println(obj[i]);
            else if(obj[i] instanceof Computer)
            {
                System.out.println(obj[i].toString());
            }
		}
	    sc.close();

	}

}
