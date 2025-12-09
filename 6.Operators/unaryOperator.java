public class unaryOperator {
    public static void main(String args[]){
        int a=10;
        int b=a++;
        System.out.println("Value of a after post-increment: "+a); 
        System.out.println("Value of b after post-increment: "+b); 

        int c=20;
        int d=++c;
        System.out.println("Value of c after pre-increment: "+c); 
        System.out.println("Value of d after pre-increment: "+d);


        int e=30;
        int f=e--;
        System.out.println("Value of e after post-decrement: "+e);
        System.out.println("Value of f after post-decrement: "+f);

        int g=40;
        int h=--g;      
        System.out.println("Value of g after pre-decrement: "+g);
        System.out.println("Value of h after pre-decrement: "+h);
    }
}
