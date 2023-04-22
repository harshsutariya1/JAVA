public class j9{
	
	public static int sumnum(int a){
		int sum = a+5;
		return sum;
	}
	public static int sumnum(int a, int b, int c){
		return a+b+c;
	}
	
	public static void main(String[] args){
		
		int sum = sumnum(5);
		System.out.println(sumnum(4,2,5));
		System.out.println("first sum is "+sum);
	}
    
}