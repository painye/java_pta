package pta11_3;

import java.util.Scanner;
import java.util.regex.Pattern;


public class pta6_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int HUMANNUM=10;
		String persons[]=new String[HUMANNUM];
		Scanner in=new Scanner(System.in);
		for(int i=0;i<persons.length;i++)
			persons[i]=in.nextLine();
		int result=numofHan(persons);
		System.out.println(result);
	}
	
	
	//-------------------------------------------
	public static int numofHan(String data[])
	{
		int n=data.length,count=0;
		String pattern = ".*ºº×å.*";
		for(int i=0;i<n;i++)
		{
			if(data[i].matches(pattern))
			{
				count++;
			}
		}
		return count;
	}

}
