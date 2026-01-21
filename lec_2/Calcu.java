import java.util.Scanner;
public class Calcu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

         int ans= 0;
        while(true){
            System.out.print("Enter the operator : " ); 
            char op = in.next().trim().charAt(0);
            System.out.println();
            if (op == '+'|| op == '-'|| op == '*'|| op == '/'|| op == '%') {
               
              System.out.print("Enter the numbers for num1: ");
              int num1 = in.nextInt();
              System.out.println();
              System.out.print("Enter the numbers for num2: ");
              int num2 = in.nextInt();
              System.out.println();
             
              
             

                if (op == '+') {
                    ans = num1 +num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }   
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if (op == '%') {
                    if (num2 != 0) {
                        ans = num1 % num2;
                    }
                }
                System.out.println("Result: " + ans);
            } else if (op == 'x' || op == 'X') {
                    break;
            } else {
                    System.out.println("Invalid operation");
                }
         }
         
    }
}
