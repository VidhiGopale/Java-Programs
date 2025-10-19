//Print Fibonnacci series upto 10 numbers
// 1,1,2,3,5,8,12
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total numbers you wanna print of Fibonacci Series: ");
        int a=sc.nextInt();
        int first=0;
        int second=1;
        System.out.println("Your Fibonacci Series is here: ");
        for(int i=2;i<=10;i++){
            System.out.println(first);
            int next=first+second;
            first=second;
            second=next;
        }
    }
}
