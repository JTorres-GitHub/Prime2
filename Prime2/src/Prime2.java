import java.util.Scanner;
// same as Prime1 project, but using a function instead

public class Prime2 {
	static boolean primeCheck(int num){
		boolean flag = false;
		// boolean prime;
		int i;
		for (i = 2; i <= num/2; ++i){
			if (num % i == 0){
				flag = true;
				break;
			}
		}
		
		if (!flag)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);
		int num;
		boolean isPrime;
		
		System.out.println("Enter an integer: ");
		num = userInput.nextInt();
		
		isPrime = primeCheck(num);
		
		if(!isPrime)
			System.out.println(num + " is not a prime number.");
		else
			System.out.println(num + " is a prime number.");
		
		userInput.close();
	}
}
