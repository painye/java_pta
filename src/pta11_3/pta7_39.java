package pta11_3;

import java.util.Arrays;
import java.util.Scanner;

public class pta7_39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n1=in.nextInt();
		int n2=in.nextInt();
		PersonOverride[] p1=new PersonOverride[n1];
		PersonOverride[] p2=new PersonOverride[n2];
		for(int i=0;i<n1;i++)
		{
			p1[i]=new PersonOverride();
		}
		for(int i=0;i<n2;i++)
		{
			String name=in.next();
			int age=in.nextInt();
			String flag=in.next();
			boolean gender;
			if(flag.equals("true"))  gender=true;
			else	 gender=false;
			PersonOverride p=new PersonOverride(name, age, gender);
			gender=false;
			for(int j=0;j<i;j++)
			{
				if(p.equals(p2[j]))
				{
					gender=true;
					break;
				}
			}
			if(!gender) {
				p2[i]=p;
			}
		}
		int count=0;
		
		for(int i=0;i<n1;i++)
		{
			System.out.println(p1[i]);
		}
		
		for(int i=0;i<n2;i++)
		{
			if(p2[i]!=null) {
				System.out.println(p2[i]);
				count++;
			}
		}
		
		System.out.println(count);
		System.out.println(Arrays.toString(PersonOverride.class.getConstructors()));
	}

}

class PersonOverride implements Comparable<PersonOverride>
{
	private String name;
	private int age;
	private boolean gender;
	
	public PersonOverride()
	{
		this("default", 1, true);
	}
	
	public PersonOverride(String n, int a, boolean g)
	{
		name=n;
		age=a;
		gender=g;
	}
	
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public boolean getGender()
	{
		return gender;
	}
	
	public String toString()
	{
		return name+"-"+age+"-"+gender;

	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(this==obj)  return true;
		else if(obj instanceof PersonOverride)
		{
			PersonOverride p=(PersonOverride) obj;
			return this.getName().equals(p.getName())&&(this.getAge()==p.getAge())&&(this.getGender()==p.getGender());
		}
		else {
			return false;
		}
	}
	

	 @Override
	 public int hashCode() {
	       // return super.hashCode();
	       return 1;
	  }

	@Override
	public int compareTo(PersonOverride o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}