public class binaryToDecimal{

	public static void bTOD(int bnum){
		int pow=0;
		int dnum=0;
		while(bnum>0){
			int lastDigit=bnum%10;
			dnum=dnum+(lastDigit*(int)Math.pow(2,pow));
			pow++;
			
			bnum=bnum/10;
		}
		System.out.println(dnum);
	}
	public static void main(String args[]){
		bTOD(111);
	}

}