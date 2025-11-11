public class TryCatchExample {
    public static void main(String[] args){
    try{
        int p=25/0;
    }
    catch(ArithmeticException e){
        System.out.println("This is exception "+e);
    }
    System.out.println("The above try catch code is working perfectly fine!");
}
}
