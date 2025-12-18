import java.util.*;
public class funtionOverloadingWPara {

    //function to calculate sum of two integers
    public static int sum(int a,int b){
        return a+b;
    }
     public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter  numbers to calculate their sum:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("Sum of two integers is "+ sum(a,b));
        System.out.println("Sum of two integers is "+ sum(a,b,c));
    }
}
//this is the function overloading using diff parameter program 