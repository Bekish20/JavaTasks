package fundament;

class StrokaSum {
    public static void main(String[] args) {
        int a = 0, b = 1;
        for (int i = 0; i < args.length; i++) {
            int number = Integer.parseInt(args[i]);
            a = a + number;
            b = b * number;
        }
        System.out.println("Total amount = " + a);
        System.out.println("General work = " + b);
    }
}



