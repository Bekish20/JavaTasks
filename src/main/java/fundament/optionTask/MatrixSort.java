package fundament.optionTask;

import java.util.Scanner;

public class MatrixSort {
    public static void main(String[] args) {
        System.out.println("Enter four numbers:");
        String[] arr = new String[4];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            int y = i + 1;
            System.out.print(y + "-");
            arr[i] = in.nextLine();
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j].length() > arr[j + 1].length()) {
                    String tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
