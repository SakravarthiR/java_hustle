import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the value of Gold");
        double number = input.nextDouble();
        System.out.println("The value of Gold is " + number);
        while(number <= 0){
           System.out.print("fuck you");
        }
    }
}
