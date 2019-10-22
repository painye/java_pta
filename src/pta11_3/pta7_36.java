package pta11_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class pta7_36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student36> s1=new ArrayList();
		boolean flag=false;;
		String str1;
		String[] str2=new String[4];
		Scanner in=new Scanner(System.in);
		str1=in.nextLine();
		while(!str1.equals("exit"))
		{
			str2=str1.split(",");
			Student36 s2=new Student36(str2[0], str2[1], str2[2], Integer.parseInt(str2[3]));
			for(Student36 s: s1)
			{
				if(str2[0].equals(s.getName()))
				{
					flag=true;
					int grade=0;
					grade=s.getGrade()+Integer.parseInt(str2[3]);
					s.setGrade(grade);
					break;
				}

			}
			if(!flag) {
				s1.add(s2);
			}
			str1=in.nextLine();
		}
		
		int i=0;  
		Collections.sort(s1);
		for(Student36 s: s1)
		{
			System.out.println("No"+(++i)+":"+s);
		}
		
	}

}

class Student36 implements Comparable<Student36>
{
	private String no;
	private String name;
	private String subject;
	private int grade;
	
	Student36(String name2, String no2, String sub2,int grade2 )
	{
		name=name2;
		no=no2;
		subject=sub2;
		grade=grade2;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getGrade()
	{
		return grade;
	}
	
	public void setGrade(int a)
	{
		this.grade=a;
	}

	public String getNo()
	{
		return no;
	}
	
	public String toString()
	{
		return no+","+name;
	}
	
	@Override
	public int compareTo(Student36 arg0) {
		// TODO Auto-generated method stub
		if(this.getGrade()>arg0.getGrade()) {
			return -1;
		}
		else if(this.getGrade()<arg0.getGrade())
		{
			return 1;
		}
		else
		{
			return this.getNo().compareTo(arg0.getNo());
		}
	}
}
