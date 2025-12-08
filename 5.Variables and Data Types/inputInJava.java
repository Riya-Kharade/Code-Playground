import java.util.*;

public class inputInJava {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        String name=sc.next();
        System.out.println("Hello, "+name);
		
		
		int age=sc.nextInt();
		System.out.println("Age "+age);
		
		long mobileNo=sc.nextLong();
		System.out.println("Mobile No "+mobileNo);
		
		Boolean isVoting=sc.nextBoolean();
		System.out.println("Voting "+isVoting);
		
		float pi=sc.nextFloat();
		System.out.println("PI "+pi);
		
		double Aadhar=sc.nextDouble();
		System.out.println("Aadhar "+Aadhar);
		
		byte b=sc.nextByte();
		System.out.println("Byte Number "+b);

       

        String fullName=sc.nextLine();
		System.out.println("Full Name "+fullName);
		
    }
}
/*this is the simple code for various input using various datatype*/

