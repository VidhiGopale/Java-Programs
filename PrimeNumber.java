import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a=sc.nextInt(); 
		boolean prime=true;
		if(a<=1){
			prime=false;
		}else{
			for (int i=2;i<=a/2;i++){
				if(a%i==0){
					prime=false;
					break;
				}
			}
		}
		if(prime==true){
			System.out.println("The given number is prime number.");
		}
		else{
			System.out.println("The given number is not prime number.");
		}
	}
}