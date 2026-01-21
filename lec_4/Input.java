import java.util.Scanner;
import java.util.Arrays;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[3];
        int[] me = new int[7];
        String[] str = new String[4];
        // for(int i= 0; i<arr.length; i++){
        //     arr[i] = in.nextInt();
        // }
        // for(int i= 0; i<me.length; i++){
        //     me[i] = in.nextInt();
        // }
        // System.out.println(Arrays.toString(arr));
        // System.out.println(Arrays.toString(me));
        //While printing the array elements to dedclare as a different loop 
           //for (int element : arr) { for each loop 
            //System.out.print(element);
        for(int i =0 ; i<str.length; i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
        }
    }

