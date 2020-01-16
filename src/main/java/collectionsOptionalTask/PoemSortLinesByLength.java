package collectionsOptionalTask;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PoemSortLinesByLength  {

      public static void main(String[] args) {
        List<String> Sonne= new ArrayList<String>();
        Sonne.add("Deutschland – mein Herz in Flammen");
        Sonne.add(" Will dich lieben und verdammen");
        Sonne.add(" Deutschland – dein Atem kalt");
        Sonne.add(" So jung, und doch so alt");
        Sonne.add("Deutschland – deine Liebe");
        Sonne.add(" Kann ich dir nicht geben");
        Sonne.add("Deutschland!");
        Sonne.add("Deutschland!");

        Collections.sort(Sonne, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        System.out.println(Sonne);
    }

}
