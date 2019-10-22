package pta11_3;

import java.util.Scanner;

public class pta7_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		int n;
		n=in.nextInt();
		Student35[] s=new Student35[n];
		for(int i=0;i<n;i++)
		{
			String no=in.next();
			String name=in.next();
			int age=in.nextInt();
			s[i]= new Student35(no, name, age);
			System.out.println(s[i]);
		}

	}

}

class Student35
{
	private String no;
	private String name;
	private int age;
	Student35(String n1, String n2,int a)
	{
		no=n1;
		name=n2;
		age=a;
	}
	
	public String toString()
	{
		if(age>=7&&age<=60) {
			return name+" "+no+" "+age;
		}
		else
		{
			return "bad";
		}
	}
}
