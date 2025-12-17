public class swapNumbers{
	public static void swap(int a,int b){
		int temp =a;
		a=b;
		b=temp;
		System.out.println("After Swapping value of a is "+a);
		System.out.println("After Swapping value of b is "+b);
	}

	public static void main(String args[]){
		int a=10;
		int b=20;
		System.out.println("Before Swapping value of a is "+a);
		System.out.println("Before Swapping value of b is "+b);
		swap(a,b);

	}
}
//swap function code