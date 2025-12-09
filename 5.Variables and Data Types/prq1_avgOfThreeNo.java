import java.util.*;
public class prq1_avgOfThreeNo {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number1:");
		int num1=sc.nextInt();
		System.out.print("Enter Number2:");
		int num2=sc.nextInt();
		System.out.print("Enter Number3:");
		int num3=sc.nextInt();
		
		int total=num1+num2+num3;
		System.out.println("Total:"+total);
		
		float avg=total/3f;
		System.out.print("Average of Three NUmber="+avg);
	}
}
// Average of Three Numbers= (num1+num2+num3)/3