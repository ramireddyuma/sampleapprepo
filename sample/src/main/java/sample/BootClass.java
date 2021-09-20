package sample;

public class BootClass {

	public static void main(String[] args) {
		System.out.println("Hello World");
		show();
	}
	public static void show() {
		int[] arr= {12,34,56,56};
		int sum=0;
		for(int n:arr)
		{
			sum+=n;
			System.out.println(n);
		}
		System.out.println("show method");
	}
		
}
