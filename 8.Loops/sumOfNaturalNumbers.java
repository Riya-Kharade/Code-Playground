import java.util.Scanner;
public class sumOfNaturalNumbers {
    public static void main(String args[]){
        int counter=1;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        while(counter<=n){
            sum=sum+counter;
            counter++;
        }
        System.out.println("The sum is: "+sum);
    
    }
}
