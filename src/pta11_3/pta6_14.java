package pta11_3;

import java.util.*;

public class pta6_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List persons=getPersons();  //得到一个所有人的线性表
		
		List teachers=new ArrayList();
		List students=new ArrayList();
	
		MyTool.separateStu_T( persons,teachers,students); //将persons线性表中的 teacher，student分别放到teachers,students两个线性表中
		
		Collections.sort(teachers);  //对教师线性表排序
		Collections.sort(students);  //对学生线性表排序
		
		showResult(teachers);  //显示教师线性表排序以后的结果
		showResult(students);  //显示学生线性表排序以后的结果
		
	}
	
	public static List getPersons()
	{
		List persons=new ArrayList();
		
		Scanner in=new Scanner(System.in);
		Person person=null;
		
		int num=Integer.parseInt(in.nextLine());
		
		for(int i=0;i<num;i++)
		{	String str=in.nextLine();
			String []data=str.split(",");
			
			if(data[0].equalsIgnoreCase("student"))
			     person=new Student(Integer.parseInt(data[1]),data[2],data[3],Integer.parseInt(data[4]),data[5]);
			else if (data[0].equalsIgnoreCase("teacher"))
				  person=new Teacher(Integer.parseInt(data[1]),data[2],data[3],Integer.parseInt(data[4]),data[5]);
			else person=null;
			     persons.add(person);
		}
		return persons;
	}
	
	public static void showResult(List persons)
	{
		for(int i=0;i<persons.size();i++)
		{
			Person per=(Person)persons.get(i);
			System.out.println(per.getName()+","+per.getGender()+","+per.getAge());
		}
	}

}

abstract class Person  implements Comparable
{    private String name;
     private String gender;
     private int age;

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person(String name, String gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}


}

  /* 请在这里写你的代码 */

 class Student extends Person
{
    private String name;
    private String gender;
    private int age;
	private int sno;
	private String major;
	Student(int s, String n, String g, int a, String m)
	{
		super(n, g,a);
		sno=s;
		major=m;
	}
	
	
	public int getSno()
	{
		return sno;
	}
	
	public String getMajor()
	{
		return major;
	}
	
	
	//重写该比较函数
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Student stu=(Student) o;
		//比较特定的属性，注意get得到私有的方法
		return stu.getSno()-this.getSno();
	}


	
}
 
 class Teacher extends Person
 {
	 private int age;
	 private String name;
	 private String gender;
	 private int tno;
	 private String subject; 
	 public Teacher(int t, String name ,String gender, int age, String s) {
		 super(name, gender, age);
		 // TODO Auto-generated constructor stub
		 tno=t;
		 subject=s;
	}

	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Teacher t=(Teacher) o;
		//比较特定的属性，注意get得到私有的方法
		return this.getAge() - t.getAge();
	}
}
 
 
 class MyTool{ 
	 public static void separateStu_T(List persons,List teachers,List students){
			 int n=persons.size();
			 //遍历链表中的每个节点
			 for(int i=0;i<n;i++)
			 {
				 //判断该节点是否是Student类
				 if(persons.get(i) instanceof Student) {
					 students.add(persons.get(i));
				 }
				 //判断该节点是否是Teacher类
				 if(persons.get(i) instanceof Teacher) {
					 teachers.add(persons.get(i));
				 }
			 }  
	 }
 }