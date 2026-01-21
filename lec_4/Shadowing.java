public class Shadowing {

    static int x =1;// this will be shadowed in main method
        public static void main(String[] args){

         System.out.println(x);
         int x =10;
         System.out.println(x);
            fun();

    }
    static void fun(){
        System.out.println(x);
    }
}
