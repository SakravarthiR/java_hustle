public class Even {
  public static void main(String[] args) {
    int[] nums ={2,3,442,2445,12312,1313};
    System.out.println(Findnumbers(nums));
    
  } 
  static int Findnumbers(int[] num){
    int count =0;
    for(int nums : num){
        if(even(nums)){
            count++;

        }
    }
    return count;


  }   
  //It checks wheather the number is even or not 
  
  static boolean even(int num){
  //It actually initialize the Numberofdigit the num 
  //is wrapped with the function of digit 
    int Numberofdigit = digits(num);
    if(Numberofdigit %2 ==0){
      return true;
    }
    return false;

    
  }
  //This is for to count the number of digit in the given array
  static int digits(int num){
    //We initialize the count of the number is 0 
    //While dividing the number , the count will increase the value that
    // initialize outside if the the loop
    int count =0;
    while(num>0){
      count++;
      num /=10;
    }
    return count;
  }
}
