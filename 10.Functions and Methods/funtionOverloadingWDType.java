import java.util.*;
public class funtionOverloadingWDType {

    //function to calculate sum of two integers
    public static int sum(int a,int b){
        return a+b;
    }
     public static float sum(float a,float b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter  numbers to calculate their sum:");
        int a=sc.nextInt();
        int b=sc.nextInt();
                System.out.println("Sum of two integers is "+ sum(a,b));

        System.out.println("Enter  numbers to calculate their sum:");
        float aa=sc.nextFloat();
        float bb=sc.nextFloat();
        System.out.println("Sum of two integers is "+ sum(aa,bb));
    }
}
//this is the function overloading using diff data type program 