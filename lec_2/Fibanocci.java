import java.util.Scanner;   
public class Fibanocci {
   public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the position of Fibonacci number to find:");
     int n = in.nextInt();
        int a = 0, b = 1;
        int count = 2;

        while(count <= n){
            int temp = b;
            b = a+b;
            a =temp;
            count++;

        }
        System.out.println(b);
        

   }    
}
