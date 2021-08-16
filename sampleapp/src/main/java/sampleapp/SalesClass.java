package sampleapp;

public class SalesClass {
	public static void display() {
		int[] arr= {1,5,78,34,82};
		for (int num:arr)
			System.out.println(num);
	}
	public static void main(String[] args)
	{
		System.out.println("Printing numbers");
		display();
	}
}
