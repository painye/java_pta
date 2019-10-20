package pta11_3;

import java.util.*;

public class pta6_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <Book>books=new ArrayList<Book>();
		Scanner in=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{	String str=in.nextLine();
			String []data=str.split(",");
			Book book=new Book(data[0],Integer.parseInt(data[1]),data[2],Integer.parseInt(data[3]));
			books.add(book);
		}
		
		System.out.println(totalprice(books));	
	}
	
	/*计算所有book的总价*/
	public static int totalprice(List <Book>books) 
	{  int result=0;
		for(int i=0;i<books.size();i++){result+=books.get(i).getPrice();}
		return result;
	}

}


class Book
{
	String name;
	int price;
	String author;
	int year;
	Book()
	{
		name=null;
		price=0;
		author=null;
		year=0;
	}
	
	public int getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	Book(String n, int p, String a, int y)
	{
		name=n;
		price=p;
		author=a;
		year=y;
	}
	
	
}


