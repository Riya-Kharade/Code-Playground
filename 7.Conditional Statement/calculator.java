public class calculator {
    public static void main(String[] args) {
        int a=10;
		int b=20;
		char ch='-';
		int result=0;
		
		switch(ch){
			case '+':
				result=a+b;
				
				break;
				
			case '-':
				result=a-b;
				break;
				
			case '/':
				result=a/b;
				break;
			
			case '*':
				result=a*b;
				break;

            default:
                System.out.println("Invalid Operator");
		}
        System.out.println("Result="+result);
    }
}
