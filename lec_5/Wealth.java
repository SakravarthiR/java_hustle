public class Wealth { 
    public static void main(String[] args) {
        int[][] meow = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        System.out.println(Bank(meow));
        
    }
    static int Bank(int[][] accounts){
        int ans = Integer.MIN_VALUE;
        for(int account =0 ; account<accounts.length;account++){
            int sum =0;
            for(int person=0; person<accounts[account].length;person++){
                sum +=accounts[account][person];

            }
            if(sum>ans){
                ans = sum;
            }
            
        }
        return ans;
    }
    
    
}
