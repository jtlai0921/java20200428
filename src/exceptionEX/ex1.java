package exceptionEX;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] x=new int[3];
		System.out.println("¿é¤J¯Á¤Þ");
		int n=sc.nextInt();
		
		try
		{
			x[n]=100;// new ArrayIndexOutOfBoundsException();
		
		
			for(int i=0;i<=10;i++)
			{
				System.out.println("hello");
			}
		}
		catch(ArrayIndexOutOfBoundsException e)//=?
		{
			System.out.println("0~2");
		}
		

	}

}