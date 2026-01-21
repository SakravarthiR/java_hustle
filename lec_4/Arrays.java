public class Arrays {
    public static void main(String[] args) {

        int rolln1 = 10;
        int rolln2 = 20;
        int rolln3 = 30;
        int rolln4 =40;
        // instead of this intialising every time we use array for the position arrangement


     int[] rollno1 = {12,34,31,31,13,13};


     int[] arr = new int[9];// int[] arr is used as in compile time and
        // new int[9] is used in a run time (Create a object in the heap memory)

        //array objects are in heap
        // heap object are not continous
        //Dynamic memory allocation

        // internaly the java array are not continous, it depends on jvm
      int[] meow;
      meow = new int[]{12,13,14,15};
      System.out.println(meow[3]);
      //object, class  every thing stored in the heap memory
      //primitive data types are stored in the stack memory 

    }

}
