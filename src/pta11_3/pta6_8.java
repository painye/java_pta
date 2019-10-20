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


//Array要实现Comparable接口（否则报错）,重写接口中的比较函数，判等函数
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
	//该函数用来将数组对象中的各种基本数据类型的属性进行比较，返回int
	//是排序中所需要的比较函数（注意需要确定哪一个属性是第一判断条件，然后第二第三）
	public int compareTo(Student o)
	{
		for(int i=0;i<this.name.length()&&i<o.name.length();i++)
		{
			if(this.name.charAt(i)<o.name.charAt(i)) return -1;
			else if(this.name.charAt(i)>o.name.charAt(i)) return 1;
		}
		//当Student中的姓名相等时比较他们的学号，也就是默认了该函数
		//主要比较的是姓名，第二比较学号
		return Integer.compare(this.no, o.no);		
	}
	
	public String toString()
	{
		return "no="+no+"&name="+name;
	}
	
	@Override
	//重写该函数是因为需要对数组进行去重
	//重写的原因是：我们需要在对象中的某一个特定属性相等时进行去重
	//所以重写后的函数，我们在判断时只要某一个特定对象是否相等即可
	//例如本次只需要判断学号是否相等
	public boolean equals(Object obj)
	{
		if(this == obj) return true;
		else if(obj instanceof Student) {
			Student s=(Student) obj;
			return this.no==s.no;
		}
		else return false;
	}
	
	
	//具体是什么目前未知，反正重写equals也需要重写该函数
	 @Override
	    public int hashCode() {
	        // return super.hashCode();
	        return 1;
	    }

	
}
