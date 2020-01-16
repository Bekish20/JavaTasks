package collectionsOptionalTask;
import java.util.ArrayList;
import java.util.List;

public class NumbersSorting {
    public static void main(String[] args) {
        List<Integer> Numbers= new ArrayList<Integer>();
        Numbers.add(5);
        Numbers.add(-5);
        Numbers.add(4);
        Numbers.add(-1);
        Numbers.add(0);
        Numbers.add(10);
        Numbers.add(2);
        Numbers.add(5);
        Numbers.add(-4);
        Numbers.add(3);
        Numbers.add(-10);
        int a,b;
        for(int i = 0; i < Numbers.size(); i++) {
            for (int j = Numbers.size()-1; j > i; j--) {
                a = Numbers.get(i);
                b = Numbers.get(j);
                if (a > b) {
                    Numbers.set(j, a);
                    Numbers.set(i, b);
                }
            }
        }
        for(int i=0;i<Numbers.size();i++)
        {
            System.out.print(Numbers.get(i)+" ");
        }
    }



}
