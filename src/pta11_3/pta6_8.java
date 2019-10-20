package pta11_3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;


public class pta6_8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student[] stus = new Student[3];
		
		for(int i=0;i<3;i++){
			int no = scan.nextInt();
			String name = scan.next();
			Student s = new Student(no,name);
			stus[i] =s;
		}
		//将stus中的3个学生对象，放入到HashSet中
		HashSet<Student> stuSet = new HashSet<Student>();
		for(Student s: stus){
			stuSet.add(s);
		}
		//要放入的第4个Student
		Student fourth = new Student(scan.nextInt(),scan.next());
		stuSet.add(fourth);//如果fourth的学号（no）与stuSet中的已有学生的no重复则无法放入
		System.out.println(stuSet.size());
		
		Arrays.sort(stus);//对stus中的3个原有对象，按照姓名首字符有小到大排序
		for(int i=0;i<stus.length;i++){
			System.out.println(stus[i]);//输出的格式为：no=XX&name=YY
		}
		
		scan.close();
	}

}


class Student implements Comparable<Student>
{
	private int no;
	private String name;
	Student()
	{
		no=0;
		name="***";
	}
	Student(int n, String n2)
	{
		no=n;
		name=n2;
	}
	
	@Override
	public int compareTo(Student o)
	{
		for(int i=0;i<this.name.length()&&i<o.name.length();i++)
		{
			if(this.name.charAt(i)<o.name.charAt(i)) return -1;
			else if(this.name.charAt(i)>o.name.charAt(i)) return 1;
		}
		return Integer.compare(this.no, o.no);		
	}
	
	public String toString()
	{
		return "no="+no+"&name="+name;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(this == obj) return true;
		else if(obj instanceof Student) {
			Student s=(Student) obj;
			return this.no==s.no;
		}
		else return false;
	}
	
	
	 @Override
	    public int hashCode() {
	        // return super.hashCode();
	        return 1;
	    }

	
}
