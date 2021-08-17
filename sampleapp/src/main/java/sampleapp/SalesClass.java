package sampleapp;

public class SalesClass {
	public static void display() {
		int[] arr= {1,5,78,34,82};
		int sum = 0;
		for (int num:arr)
		{
			sum+=num;
			System.out.println(num);
		}
		System.out.println(sum);
		System.out.println("Printing");
		System.out.println("Yes");
	}
	public static void main(String[] args)
	{
		System.out.println("Printing numbers");
		display();
	}
}
