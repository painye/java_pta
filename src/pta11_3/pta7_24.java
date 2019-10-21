package pta11_3;

import java.util.Scanner;

public class pta7_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		boolean gender;
		Person24[] p= new Person24[n];
		for(int i=0;i<n;i++)
		{
			String name=in.next();
			int age=in.nextInt();
			String g=in.next();
			if(g.equals("true")) gender=true;
			else	gender=false;
			p[i]= new Person24(name, gender, age);
		}
		
		for(int i=n-1;i>=0;i--)
		{
			System.out.println(p[i]);
		}
		
		Person24 p2=new Person24();
		System.out.println(p2);
	}

}


class Person24
{
	private String name;
	private boolean gender;
	private int age;
	private int count;
	private static int id;
	
	static{
		id=0;
		System.out.println("This is static initialization block");
	}
	
	Person24()
	{
		name=null;
		gender=false;
		age=0;
		count=id;
		id++;
		System.out.println("This is constructor");
		System.out.println(name+","+age+","+gender+","+count);
	}
	
	{
		System.out.println("This is initialization block, id is "+id);
	}
	
	Person24(String n, boolean g, int a)
	{
		name=n;
		gender=g;
		age=a;
		count=id;
		id++;
	}
	
	public String toString()
	{

		return "Person "+"[name="+name+", age="+age+", gender="+gender+", id="+count+"]";
	}
}