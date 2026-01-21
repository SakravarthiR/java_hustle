import java.util.Scanner;

public class Greeting {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your name: ");
    String name = scanner.nextLine();
    String greeting = mygreet(name);
    System.out.println(greeting);
}
    static  String mygreet(String name) {
        return "Hello, " + name + "!";
    }
}
