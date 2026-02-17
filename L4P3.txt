import java.util.Scanner;
import java.lang.Exception;
import java.util.InputMismatchException;
class L4P3{
	public static void getValue(int x){
		if(x%2 !=0)
			throw new InputMismatchException("Odd number");
		else
			System.out.println(x);
	}
	
	public static void main(String...args) {
		Scanner s = new Scanner(System.in);
		try{
		int a = s.nextInt();
		getValue(a);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}