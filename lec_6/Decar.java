public class Decar{

    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9};
        int ans = binarySearch(arr, 7);
        System.out.println(ans);
        
    }
    static int binarySearch(int[] arr , int tar){
        int start =0;
        int end = arr.length-1;

        boolean isAsc = arr[start] < arr[end];
         while(start<=end){
            int mid = start + (end - start) /2;
            if(arr[mid]==tar){
                return mid;
            }
        if(isAsc){
            if(tar < arr[mid]){
                end =  mid - 1;
            }else {
                start =  mid +1;
            }
         }else{
            if(tar >arr[mid]){
                end = mid -1;
            }else{
                start = mid +1;
            }
         }
    }
        return -1;
      

        
    }
        }
    
    
