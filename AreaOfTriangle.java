import java.util.Scanner;

public class AreaOfTriangle {
     public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base of Traiangle: ");
        float b=sc.nextFloat();
        System.out.println("Enter the height of Traiangle: ");
        float h=sc.nextFloat();
        System.out.println("Area of Triangle is :" + 0.5*b*h);
    }
}
