import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A[] = new String[5];
        int B[]=new int [5];
        System.out.println("Enter the following details for the students: ");
        for(int i=0;i<5;i++){
            System.out.println("Enter the name of student: ");
            A[i]=sc.next();
            System.out.println("Enter the age of student: ");
            B[i]=sc.nextInt();
        }
        System.out.println("You entered the following details of student:");
        for (int i=0;i<5;i++){
            System.out.println("The name of student is "+A[i]+ " having age "+B[i]);
        }
    }
}
