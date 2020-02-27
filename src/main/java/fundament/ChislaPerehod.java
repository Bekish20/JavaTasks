package fundament;

import java.util.Scanner;

class ChislaPerehod {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        int stroka1;
        System.out.println("Ввведите колличество чисел:");
        stroka1 = vvod.nextInt();
        for (int i = 0; i < stroka1; i++) {
            double a;
            a = Math.random();
            System.out.print(" Число:" + i + "=" + a);
        }
        for (int i = 0; i < stroka1; i++) {
            double a;
            a = Math.random();
            System.out.println(" Число:" + i + "=" + a);
        }
    }
}
