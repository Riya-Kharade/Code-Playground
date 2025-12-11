public class largestOfThree{
    public static void main(String args[]){
		int A=11;
		int B=11;
		int C=1;
		
		if(A>=B && A>=C){
			System.out.println("Largest is A "+A);
		}
		else if(B>=C){
			System.out.println("Largest is B "+B);

		}
		else{
			System.out.println("Largest is C "+C);
		}
	}
	
}