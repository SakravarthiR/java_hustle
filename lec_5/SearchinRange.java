public class SearchinRange {
     public static void main(String[] args) {
        int arr[] ={1,3,4,5,6,9,2,423,234,244};
        int target = 2;
        System.out.println(linearSearch(arr, target, 4,9 ));
      
       
     }
     static int linearSearch(int[] meow, int target , int start ,int end ){
        if(meow.length==0){
           return -1;
        }

        for(int index =start; index <= end; index++){
            int element = meow[index];
            if(element == target ){
                return index;
            }
        }
        return -1;
    }
}
