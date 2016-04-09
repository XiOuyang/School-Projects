import java.util.*;

public class GCD{
	public static void main(String[]args){
		boolean One = true;
		boolean Two = false;
		int x = 0, y = 0;
		System.out.print("Enter a positive integer: ");
		while(One){
			Scanner scan = new Scanner(System.in);
			try{
				x = scan.nextInt();
			} catch(InputMismatchException e) {
				System.out.print("Please enter a positive integer: ");
				continue;
			}
			if(x == 0 || x < 0){
				System.out.print("Please enter a positive integer: ");
				continue;
			}
			if(x > 0){
				break;
			}
		}
		Two = true;
		System.out.print("Enter another positive integer: ");
		while(Two){
			Scanner scan = new Scanner(System.in);
			try{
				y = scan.nextInt();
			} catch(InputMismatchException e) {
				System.out.print("Please enter a positive integer: ");
				continue;
			}
			if( y == 0 || y < 0){
				System.out.print("Please enter a positive integer: ");
				continue;
			}
			if( y > 0) break;
		}
		int remainder = 0, temp = 0, temp2 = 0, count = 0;
		if(x > y) remainder = x % y;
		if(y > x) remainder = y % x;
		for(;;){
			if(x > y) temp2 = y;
			if(y > x) temp2 = x;
			if(count >= 1) temp2 = temp;
			temp = remainder;
			try{
				remainder = temp2 % temp;
			} catch (ArithmeticException m) {
				if(x > y) temp = y;
				if(y > x) temp = x;
				break;
			}
			++count;
			if(remainder == 0) break;
		
		}
		System.out.println("The GCD of " + x + " and " + y + " is " + temp);		
	}
}
