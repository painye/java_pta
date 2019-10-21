package pta11_3;

import java.util.Scanner;

public class pta7_23 {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		boolean gender;
		Person23[] p= new Person23[n];
		for(int i=0;i<n;i++)
		{
			String name=in.next();
			int age=in.nextInt();
			String g=in.next();
			if(g.equals("true")) gender=true;
			else	gender=false;
			p[i]= new Person23(name, age,gender);
		}
		
		for(int i=n-1;i>=0;i--)
		{
			System.out.println(p[i]);
		}
		
		Person23 p2=new Person23();
		System.out.println(p2);
	}

}


class Person23
{
	private String name;
	private int age;
	private boolean gender;
	private int id;
	
	Person23()
	{
		name=null;
		age=0;
		gender=false;
		id=0;
		System.out.println("This is constructor");
		System.out.println(name+","+age+","+gender+","+id);
	}
	
	Person23(String n, int a, boolean g)
	{
		name=n;
		age=a;
		gender=g;
		id=0;
	}
	
	public String toString()
	{
		return "Person "+"[name="+name+", age="+age+", gender="+gender+"e, id="+id+"]";
	}
}
