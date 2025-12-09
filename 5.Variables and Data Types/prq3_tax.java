import java.util.*;
public class prq3_tax {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner (System.in);

	System.out.print("Enter Pen Cost:");
	float pen=sc.nextFloat();
	System.out.print("Enter Pencil Cost:");
	float pencil=sc.nextFloat();
	System.out.print("Enter Eraser Cost:");
	float eraser=sc.nextFloat();
	
	double total=pen+pencil+eraser;
	
	System.out.println("Total of pen,pencil and eraser is "+total+" rs");
	
	
	//using tax 18%
	
	double tax=total+(total*0.18);
	System.out.println("Total of pen,pencil and eraser is "+tax+" rs with tax");
    }
}
