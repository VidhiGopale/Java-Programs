import java.util.*;

class Array{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the size of array: ");
    int size=sc.nextInt();  

    int[] A=new int[size];
    System.out.println("Enter the elements of array: ");
    for(int i=0;i<size;i++){
        A[i]=sc.nextInt();
    }

    System.out.println("Thankyou for the input! Please find below the entered array: ");
    for(int i=0;i<size;i++){
        System.out.println(A[i]);
    }
}
}
