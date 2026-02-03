
    import java.util.Scanner;

public class New {
    public static void main(String[] args){
        Scanner in  = new Scanner(System.in);
        System.out.print("Enter Number:");
        long num = in.nextInt();
        long ans = 0;
        
        while (num > 0) {
            long rem = num % 10;
            num = num / 10;

            ans = ans * 10 + rem;
            
        }
        System.out.println ("Your number has been reversed." + ans);
    }
}

