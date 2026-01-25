import java.util.Arrays;

public class Searchin2d {
    public static void main(String[] args) {
        int[][] arr ={
            {23,4,9},
            {18,12,3,9},
            {5,8,7},
            {18,32}
        };
        int target = 32;
        int[] ans = Search(arr,target);
        System.out.println(Arrays.toString(ans));
    }    
    static int[] Search(int[][] arr,int target){
        for(int row=0; row<arr.length;row++){
            for(int col =0;col<arr[row].length; col++){
                if (arr[row][col] == target) {
                    return new int[] {row,col};
                    
                }

            }
        }
        return new int[] {-1, -1};
    }
}
