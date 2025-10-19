import java.util.Scanner;

public class Reminder{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the greater number: ");
        int a=sc.nextInt();
        System.out.println("Enter the smaller number: ");
        int b=sc.nextInt();
        System.out.println("The division of both number gives quotient :"+a/b+ " and reminder :"+ a%b);
    }
}

