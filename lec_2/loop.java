import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        // Using a for loop to print numbers from 1 to 5
        // for (int i = 1; i <= 5; i++) {
        //     System.out.println("Number: " + i);
        // }

        // Using a while loop to print numbers from 1 to 5
        Scanner number = new Scanner(System.in);
        int i = number.nextInt();
        while (i <= 5) {
            System.out.println("Number: " + i);
            i ++;
        }
    }
}
