import java.util.*;
public class parameterFunction{
	
	public static void sumOfNumber(int num1,int num2){
		int sum=num1+num2;
        System.err.println("The sum is: "+sum);
	}
	
	public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		 int num2=sc.nextInt();
		sumOfNumber(num1,num2); //function call with parameters
	}
}