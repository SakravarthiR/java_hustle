import java.util.Scanner;

public class condition{
    public static void main (String[] args){
        Scanner battery = new Scanner (System.in);
        System.out.print("Enter your battery percentage:");
        int percentage = battery.nextInt();
          if(percentage <= 100){
            System.out.println("Your phone battery is full.");
        }
        else if(percentage >100){
            System.out.println("Invalid percentage.");
        }
          else if(percentage >= 75){
            System.out.println("You have enough battery.");
        }
          else if(percentage >= 50){
            System.out.println("Your battery is at half.");
          }
            else if(percentage >= 25){
                System.out.println("Your battery is low.");
            }
            else if(percentage < 20){
                System.out.println("Your battery is critical. Please charge your phone.");
            }


    }
}