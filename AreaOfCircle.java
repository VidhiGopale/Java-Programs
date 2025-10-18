//Print area of circle by taking radius as input from user

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double p=3.14;
        System.out.println("Please enter the radius of circle: ");
        int r=sc.nextInt();
        System.out.println("The area of circle is : "+ p*r*r);
    }
}
