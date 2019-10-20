package pta11_3;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

public class pta6_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Book[] books = new Book[4];
		Date date= null;
		//1. �Ӽ��̽����û������4��������ƣ�����Ӣ���ַ����ɣ����������ڣ���ʽ��1998-10-09�����۸�����Book���󣬹������4���������
		for(int i=0;i<4;i++){
			String name = scan.next();
			String date_str = scan.next();
			
			//������¼��������ַ���ת��ΪDate
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			try {
				date = sdf.parse(date_str);
			} catch (ParseException e) {
				System.out.println("���ڸ�ʽ����");;
			}
			
			double price = Double.parseDouble(scan.next());
			
			Book book = new Book(name, date, price);
			books[i] = book;
		}
		
		//2.��books���ճ������ڽ�������Ȼ�����books
		Arrays.sort(books, new BookComparatorByPubDate());
		for(Book book:books){
			System.out.println(book);
		}
		
		//3.��books���ռ۸�������������۸���ͬ������������ĸ˳�����С�Ȼ�����books
		Arrays.sort(books, new BookComparatorByPrice());
		for(Book book:books){
			System.out.println(book);
		}
		
		scan.close();
	}

}

class Book
{
	String name;
	Date publishDate;
	double price;
	Book()
	{
		name=null;
		publishDate=null;
		price=0;
	}
	
	Book(String n, Date d, double p)
	{
		name=n;
		publishDate=d;
		price=p;
	}
	
	public String toString()
	{
		return "����:"+name+",����:"+price;
	}
	
}


//��һ��Book�����ճ������ڽ�������
class BookComparatorByPubDate implements Comparator<Book>
{
	//��д�ӿ�compare()
	@Override
	public int compare(Book b1,Book b2)
	{
		return b2.publishDate.compareTo(b1.publishDate);
	}
}


//����һ���ӿ��࣬ʵ���ض������򷽷�
class BookComparatorByPrice implements Comparator<Book>
{
	//��дcompare���������Ƚ�ĳһ���ض������£���������Ĵ�С
	@Override
	public int compare(Book b1, Book b2)
	{
		if((b1.price-b2.price)>0)
		{
			return 1;
		}
		else if(b1.price-b2.price<0)
		{
			return -1;
		}
		//����Ǯһ��ʱ��������������
		else
		{
			return b1.name.compareTo(b2.name);
		}
	}
}
