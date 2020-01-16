package fundament.optionTask;
import java.util.Arrays;
import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        System.out.println("Enter four numbers:");
        String[] arr = new String[4];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            int y=i+1;
            System.out.print(y+"-");
            arr[i] = in.nextLine();}
        int min = 10, max = 0;
            String minStr = null, maxStr = null;
            for (String masiv : arr) {
                if (masiv.length() < min) {
                    min = masiv.length();
                    minStr = masiv;
                }
                if (masiv.length() > max) {
                    max = masiv.length();
                    maxStr = masiv;
                }
            }
            System.out.println("Minimum number " + minStr + " consists of " + min
                    + " numbers");
            System.out.println("Maximum number " + maxStr + " consists of " + max
                    + " numbers");


    }
}
