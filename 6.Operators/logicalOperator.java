public class logicalOperator {
    public static void main(String args[]){
        System.out.println((3>2)&&(4<6)); //True
		System.out.println((3>6)&&(4<6)); //False

		System.out.println((3>6)||(4<6)); //True
		System.out.println((3>6)||(4>6)); //False
		
		System.out.println(!(3>2)); //False
		System.out.println(!(3<2)); //true

    }
}
