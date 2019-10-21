package pta11_3;

import java.util.Scanner;

public class pta6_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int array[]= new int[n];
		
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		
		MyArrays.printArray(array);//显示数组的内容
		MyArrays.sortArray(array);	//对数组元素排序
		MyArrays.printArray(array);//显示排序后的结果
		int sum=MyArrays.sumOfArray(array);//数组元素求和
		System.out.println(sum);//显示数组元素的和

	}

}


class MyArrays
{
	public static void printArray(int[] x)
	{
		for(int i=0;i<x.length;i++)
		{
			if(i!=x.length-1) {
				System.out.printf("%d,", x[i]);
			}
			else
			{
				System.out.println(x[i]);
			}
		}
	}

	public static void sortArray(int[] x) {
		// TODO Auto-generated method stub
		int temp;
		for(int i=0;i<x.length;i++)
		{
			for(int j=i+1; j<x.length;j++)
			{
				if(x[i]>x[j]) {
					temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
		}
	}
		
	public static int sumOfArray(int[] x)
	{
		int sum=0;
		for(int i=0;i<x.length;i++) {
			sum=sum+x[i];
		}
		
		return sum;
	}
	
	
}
