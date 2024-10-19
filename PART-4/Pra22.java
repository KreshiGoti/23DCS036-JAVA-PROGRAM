import java.util.Scanner;
interface AdvancedArithmetic{
    
    int divisor_sum(int n);
}

class MyCalculator implements  AdvancedArithmetic{
	@Override
    public int divisor_sum(int n){
    int sum = 0;
	for(int i=1; i<=n; i++){
	    if(n % i == 0){
		   sum = sum + i;
		}
	}
	return sum;
   }
   
}
class Pra22{
    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		
	    MyCalculator c1 = new MyCalculator();
        int result = c1.divisor_sum(number);
        System.out.println("The sum of divisors of " + number + " is: " + result);
	    System.out.println("23DCS036_kreshi_goti");
	}
}
