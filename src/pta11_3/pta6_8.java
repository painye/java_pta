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
		//��stus�е�3��ѧ�����󣬷��뵽HashSet��
		HashSet<Student> stuSet = new HashSet<Student>();
		for(Student s: stus){
			stuSet.add(s);
		}
		//Ҫ����ĵ�4��Student
		Student fourth = new Student(scan.nextInt(),scan.next());
		stuSet.add(fourth);//���fourth��ѧ�ţ�no����stuSet�е�����ѧ����no�ظ����޷�����
		System.out.println(stuSet.size());
		
		Arrays.sort(stus);//��stus�е�3��ԭ�ж��󣬰����������ַ���С��������
		for(int i=0;i<stus.length;i++){
			System.out.println(stus[i]);//����ĸ�ʽΪ��no=XX&name=YY
		}
		
		scan.close();
	}

}


//ArrayҪʵ��Comparable�ӿڣ����򱨴�,��д�ӿ��еıȽϺ������еȺ���
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
	//�ú�����������������еĸ��ֻ����������͵����Խ��бȽϣ�����int
	//������������Ҫ�ıȽϺ�����ע����Ҫȷ����һ�������ǵ�һ�ж�������Ȼ��ڶ�������
	public int compareTo(Student o)
	{
		for(int i=0;i<this.name.length()&&i<o.name.length();i++)
		{
			if(this.name.charAt(i)<o.name.charAt(i)) return -1;
			else if(this.name.charAt(i)>o.name.charAt(i)) return 1;
		}
		//��Student�е��������ʱ�Ƚ����ǵ�ѧ�ţ�Ҳ����Ĭ���˸ú���
		//��Ҫ�Ƚϵ����������ڶ��Ƚ�ѧ��
		return Integer.compare(this.no, o.no);		
	}
	
	public String toString()
	{
		return "no="+no+"&name="+name;
	}
	
	@Override
	//��д�ú�������Ϊ��Ҫ���������ȥ��
	//��д��ԭ���ǣ�������Ҫ�ڶ����е�ĳһ���ض��������ʱ����ȥ��
	//������д��ĺ������������ж�ʱֻҪĳһ���ض������Ƿ���ȼ���
	//���籾��ֻ��Ҫ�ж�ѧ���Ƿ����
	public boolean equals(Object obj)
	{
		if(this == obj) return true;
		else if(obj instanceof Student) {
			Student s=(Student) obj;
			return this.no==s.no;
		}
		else return false;
	}
	
	
	//������ʲôĿǰδ֪��������дequalsҲ��Ҫ��д�ú���
	 @Override
	    public int hashCode() {
	        // return super.hashCode();
	        return 1;
	    }

	
}
