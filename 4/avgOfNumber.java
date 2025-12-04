import java.util.*;
public class avgOfNumber{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int sum=0;
for (int i=1;i<=25;i++){
System.out.println("Enter number "+i+":");
int marks=sc.nextInt();
sum=sum+marks;

}
double avg=sum/25;

System.out.println("Average of 25 numbers is "+avg);

}
}
