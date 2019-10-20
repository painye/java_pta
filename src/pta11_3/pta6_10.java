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
		//1. 从键盘接收用户输入的4本书的名称（仅有英文字符构成）、出版日期（格式：1998-10-09）、价格，生成Book对象，构造包含4本书的数组
		for(int i=0;i<4;i++){
			String name = scan.next();
			String date_str = scan.next();
			
			//将键盘录入的日期字符串转换为Date
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			try {
				date = sdf.parse(date_str);
			} catch (ParseException e) {
				System.out.println("日期格式有误");;
			}
			
			double price = Double.parseDouble(scan.next());
			
			Book book = new Book(name, date, price);
			books[i] = book;
		}
		
		//2.将books按照出版日期降序排序；然后输出books
		Arrays.sort(books, new BookComparatorByPubDate());
		for(Book book:books){
			System.out.println(book);
		}
		
		//3.将books按照价格升序排序，如果价格相同，则按照书名字母顺序排列。然后输出books
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
		return "书名:"+name+",定价:"+price;
	}
	
}


//将一组Book对象按照出版日期降序排序
class BookComparatorByPubDate implements Comparator<Book>
{
	//重写接口compare()
	@Override
	public int compare(Book b1,Book b2)
	{
		return b2.publishDate.compareTo(b1.publishDate);
	}
}


//这是一个接口类，实现特定的排序方法
class BookComparatorByPrice implements Comparator<Book>
{
	//重写compare函数用来比较某一个特定属性下，两个对象的大小
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
		//当价钱一样时，按照升序排列
		else
		{
			return b1.name.compareTo(b2.name);
		}
	}
}
