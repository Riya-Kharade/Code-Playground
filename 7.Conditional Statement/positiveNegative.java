import java.util.*;
public class positiveNegative{
    public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		if(num==0){
			System.out.println("Zero can not be postive or negative");
		}
		else if(num>=1){
			System.out.println("Number is positive");
		}
		else{
			System.out.println("Number is negative");
		}
	}
}