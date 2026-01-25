public class Findmin {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,11,};
        System.out.println(min(arr));
        
    }
    //assume arr.length !=0
    //return the minimum value in the array
    static int min(int[] arr){
        int ans =arr[0];
        for(int index=0; index<arr.length; index++){
            //it will every element to last and store and give the smallest element 
            if(arr[index] < ans){
                ans = arr[index];
            }

        }
         return ans;
    }
   
}
