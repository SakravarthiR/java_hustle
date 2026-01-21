import java.util.Scanner;

public class Case{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String fruit = in.nextLine();
     

        switch (fruit) {
            case "Apple" -> System.out.println("Apple is red.");
            case "Banana" -> System.out.println("Banana is yellow.");
            case "Grapes" -> System.out.println("Grapes are purple.");
            default -> System.out.println("Unknown fruit.");
        }
    }
}