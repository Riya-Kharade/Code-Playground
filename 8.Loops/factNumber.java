public class factNumber {
    public static void main(String args[]){
        int fact=1;
        int n=5;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+n+" is: "+fact);
    }
}
//5! = 5 × 4 × 3 × 2 × 1 = 120
