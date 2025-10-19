import java.util.Scanner;

public class AreaOfRectangle{
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of Rectangle: ");
        float l=sc.nextFloat();
        System.out.println("Enter the breadth of Rectangle: ");
        float b=sc.nextFloat();
        System.out.println("Area of rectangle is :" + l*b);
    }
}