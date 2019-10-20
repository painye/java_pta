package pta11_3;

import java.util.*;

public class pta6_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List persons=getPersons();  //�õ�һ�������˵����Ա�
		
		List teachers=new ArrayList();
		List students=new ArrayList();
	
		MyTool.separateStu_T( persons,teachers,students); //��persons���Ա��е� teacher��student�ֱ�ŵ�teachers,students�������Ա���
		
		Collections.sort(teachers);  //�Խ�ʦ���Ա�����
		Collections.sort(students);  //��ѧ�����Ա�����
		
		showResult(teachers);  //��ʾ��ʦ���Ա������Ժ�Ľ��
		showResult(students);  //��ʾѧ�����Ա������Ժ�Ľ��
		
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

  /* ��������д��Ĵ��� */

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
	
	
	//��д�ñȽϺ���
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Student stu=(Student) o;
		//�Ƚ��ض������ԣ�ע��get�õ�˽�еķ���
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
		//�Ƚ��ض������ԣ�ע��get�õ�˽�еķ���
		return this.getAge() - t.getAge();
	}
}
 
 
 class MyTool{ 
	 public static void separateStu_T(List persons,List teachers,List students){
			 int n=persons.size();
			 //���������е�ÿ���ڵ�
			 for(int i=0;i<n;i++)
			 {
				 //�жϸýڵ��Ƿ���Student��
				 if(persons.get(i) instanceof Student) {
					 students.add(persons.get(i));
				 }
				 //�жϸýڵ��Ƿ���Teacher��
				 if(persons.get(i) instanceof Teacher) {
					 teachers.add(persons.get(i));
				 }
			 }  
	 }
 }