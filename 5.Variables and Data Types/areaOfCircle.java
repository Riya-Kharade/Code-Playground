import java.util.*;
public class areaOfCircle {
    public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius of circle:");
		float pi=3.14f;
		float radius=sc.nextFloat();
		
		double area=pi*radius*radius;
		
		System.out.println("Area Of Circle:"+area);
	}
}
