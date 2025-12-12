import java.util.Scanner;
public class whileLoop1toN {
    public static void main(String args[]){
        int counter=1;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(counter<=n){
            System.out.print(counter+" ");
            counter++;
        }
    }
}
