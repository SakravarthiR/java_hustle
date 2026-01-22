import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLis {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(10);
        Scanner sc = new Scanner(System.in);
        // list.add(67);
        // list.add(34);
        // list.add(89);
        // list.add(12);
        // System.out.println(list);
        // list.remove(0);
        // System.out.println(list);
        for(int i=0; i<5; i++){
            list.add(sc.nextInt());
        }
         for(int i=0; i<5; i++){
            System.out.println(list.get(i));
        }
    }
     
}
