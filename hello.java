import java.util.Scanner;

public class hello{
    public static void main(String [] arg){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter  some value");
       int n=sc.nextInt();
       System.out.println("Value"+n);
       sc.close();
    }
}