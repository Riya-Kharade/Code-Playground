public class FactorialOfNumber{
	public static void factNum(int num){
        int fact=1;
		while(num>0){
			fact=fact*num;
            num--;
		}
        System.out.println("Factorial is:"+fact);

	}

	public static void main(String args[]){
		factNum(5);

	}
}