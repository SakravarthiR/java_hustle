import java.util.Scanner;
import java.util.Arrays;
public class Twod{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[3][3];
        //System.out.println(array.length);
        
        // this loop is for input
        for(int row=0; row<array.length; row++){
        
            for(int col=0; col<array[row].length; col++){
                   array[row][col] = sc.nextInt();
        }
    }
        // this loop is for output
       for(int row=0; row<array.length; row++){
          System.out.println(Arrays.toString(array[row]));

        for(int col=0; col<array[row].length; col++){
               System.out.print((array[row][col]) + " ");
        }
        // new line after each row
        System.out.println();
       }
        
    }
}
 