package pta11_3;

import java.util.Scanner;

public class pta7_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y,m,d;
		Scanner in=new Scanner(System.in);
		y=in.nextInt();
		m=in.nextInt();
		d=in.nextInt();
		Birthday b=new Birthday(y,m,d);
		System.out.println("age="+b.getAge());
	}

}


class Birthday
{
	int year,month,day;
	
	Birthday(int y,int m,int d)
	{
		year=y;
		month=m;
		day=d;
	}
	
	public int getAge()
	{
		if(month==12&&day>=25) {
			return 2017-year;
		}
		else
			return 2017-year+1;
	}
	
}

