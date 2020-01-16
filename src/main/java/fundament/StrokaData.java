package fundament;
import java.util.Scanner;

public class StrokaData {

 public static void main(String[] args){
     System.out.print("Enter the month number:");
    String[] months = {"January","February","March","April","May",
            "June","July","August ","September","October","November","December"};
     Scanner number = new Scanner(System.in);
     int x;
     x=number.nextInt();
     if (x>=1 && x<=12){
     int y=x-1;

     System.out.println(x+"-"+months[y]);}
     else {
         System.out.println("Invalid month number entered");
     }

     }

 }

