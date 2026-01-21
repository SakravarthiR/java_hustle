public class Overloading {
    public static void main(String[] args){

        
        fun(5);
        fun("Hello");
    }
    static void fun( String meow){
        System.out.println(meow);

    }
    static void fun(int a){
        System.out.println(a);

    }
} 
