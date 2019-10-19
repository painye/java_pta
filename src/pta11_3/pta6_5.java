package pta11_3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class pta6_5 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Company c1 = new Company("MicroSoft");
		Company c2 = new Company("IBM");
		Person e1 = new Employee("Li", 35, true, 60000.124, c1);
		Person e2 = new Employee("Li", 35, true, 60000.124, c1);
		Person e3 = new Employee("Li", 35, true, 60000.124, c2);
		Person e4 = new Employee("Li", 35, true, 60000.123, c2);
		Person e5 = new Employee("Li", 35, true, 60000.126, c2);
		Person e6 = new Employee("Li", 35, true, 60000.126, null);
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
		System.out.println(e3.equals(e4));
		System.out.println(e3.equals(e5));
		System.out.println(e5.equals(e6));
		
	}
	
}

class Company
{
	String s;
	Company(String x)
	{
		s=x;
	}
}

class Person
{
	String name;
	int age;
	boolean flag;
	Person(String n, int a, Boolean f)
	{
		name=n;
		age=a;
		flag=f;
	}
	
	public boolean equals(Object obj)
	{
		Person p=(Person) obj;
		boolean f1=false, f2=false, f3=false;
		if((this.name.equals(p.name))) f1=true;
		else f1=false;
		
		
		if(age==p.age)  f2=true;
		else f2=false;
		
		if(flag==p.flag) f3=true;
		else f3=false;
		
		
		if(f1&&f2&&f3) return true;
		else return false;
		
	}
}

class Employee extends Person
{
	String name;
	int age;
	boolean flag;
	double salary;
	Company company; 
	
	Employee(String n, int a, boolean f, double s, Company c){
		super(n, a, f);
		salary=s;
		company=c;
	}
	
	
	public boolean equals(Object obj)
	{
		
	    boolean f1=false,f2=false,f3=false;
	    
	    Employee p= (Employee) obj;

	    DecimalFormat df = new DecimalFormat("0.00");
	    if((df.format(this.salary)).equals(df.format(p.salary))) f2=true;
	    else f2=false;
	    

	    if((this.company==null)&&(p.company==null))   return true;
	    else if(this.company.equals(p.company)) f1=true; 
	    else f1=false;
	    
	    
	    if(super.equals(p))   f3=true;
	    else f3=false;


	    if(f1&&f2&&f3) return true;
	    else  return false; 
	    
	    
	}
}

