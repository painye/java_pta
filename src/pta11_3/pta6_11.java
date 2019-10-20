package pta11_3;

import java.util.Scanner;

public class pta6_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner in=new Scanner(System.in);
			int data=in.nextInt();
			System.out.println(isOdd(data));
	}
	
	//ДњТы---------------------------------------------------------

	public static boolean isOdd(int data)
	{
		if(data%2==0) return true;
		else	return false;
	}
}
