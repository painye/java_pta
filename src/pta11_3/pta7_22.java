package pta11_3;

public class pta7_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myBook b1=new myBook("Java�������", 34.5);
		System.out.println(b1);
		myBook b2=new myBook("���ݽṹ", 44.8);
		System.out.println(b2);
		myBook b3=new myBook("C++�������", 35.8);
		System.out.println(b3);
		b3.print();
	}

}


class myBook
{
	private static int no;
	
	static{
		no=0;
	}
	
	private double price;
	private String name;
	
	myBook()
	{
		name=null;
		price=0;
		no++;
	}
	
	myBook(String n, double p)
	{
		name=n;
		price=p;
		no++;
	}
	
	public String toString()
	{
		return "������"+name+", ��ţ�"+no+", ��ۣ�"+price;
	}
	
	public void print()
	{
		System.out.println("ͼ���ܲ���Ϊ��"+no);
	}
	
}
