import java.util.Arrays;

public class Varargs {
    public static void main(String[]  args){
        fun(1,2,3);
        fun(4,5);
        fun();
    }
    static void fun(int ...v){
      System.out.println(Arrays.toString(v));
    }
}
