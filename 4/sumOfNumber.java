import java.util.*;
public class sumOfNumber{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int value=1;
int sum=0;

while(value<=num){
sum=sum+value;
value=value+1;
}
System.out.println(sum);

}
}

/*
This program calculates the sum of all natural numbers up to a given number.
*/