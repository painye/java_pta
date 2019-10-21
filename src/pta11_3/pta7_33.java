package pta11_3;

import java.util.ArrayList;

public class pta7_33 {
	private ArrayList<Student33> slist = new ArrayList();
	

	public void addStudent(Student33 s){
		this.slist.add(s);
	}
	
	public void showStudent(){
		for(Student33 s: this.slist){
			System.out.println(s);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pta7_33 t = new pta7_33();
		t.addStudent(new Student33("2016001","rose",18));
		t.addStudent(new Student33("2016002","hunifu",19));
		t.addStudent(new Student33("2016003","britsh",20));
		t.addStudent(new Student33("2016004","sunni",17));
		t.showStudent();
	}

}


class Student33 implements Comparable<Student33>{
	//²¹È«´úÂë´¦
	private String no;
	private String name;
	private int age;
	
	Student33(String string, String n, int a)
	{
		no=string;
		name=n;
		age=a;
	}

	public String getNo()
	{
		return no;
	}
	
	@Override
	public int compareTo(Student33 arg0) {
		// TODO Auto-generated method stub
		return  this.getNo().compareTo(arg0.getNo());
	}
	
	
	public String toString()
	{
		return no+" "+name+" "+age;
	}

	


	}
	
	



