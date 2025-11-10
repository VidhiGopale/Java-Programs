import java.util.Scanner;

public class ArmstrongNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a=sc.nextInt();
        int num=a;
        int sum=0;
        int length=String.valueOf(a).length();
        while(a>0){
            int digit=a%10;
            sum+=Math.pow(digit, length);
            a=a/10;
        }
        if(sum==num){
            System.out.println("Yes, this is the armstrong number!");
        }
        else{
            System.out.println("No, this is not the armstrong number!");
        }
    }
}
