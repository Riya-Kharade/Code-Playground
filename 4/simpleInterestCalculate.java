import java.util.*;
public class simpleInterestCalculate{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
double principal=sc.nextDouble();
double rate=sc.nextDouble();
double time=sc.nextDouble();

double simpleInterest=(principal*rate*time)/100;

System.out.println("Interest="+simpleInterest);
}
}

/*
This is a simple code to calculate simple interest given principal, rate and time.
Comes under basic mathematics.
*/