package cwiczenia;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Piotr.Mrozinski on 2017-01-21.
 */
public class Zadanie7 {
    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<>();
        Random rn = new Random();

        for (int i = 0; i < 5000000; i++) {
            ls.add(rn.nextInt());
        }
        System.out.println(ls.size());
        long time = System.currentTimeMillis();
        System.out.println("Start: "+ (System.currentTimeMillis() - time));

        time = System.currentTimeMillis();
        // kopiowanie tablic za pomoca fot
        List<Integer> tab2 = new ArrayList<>();
        for (int i:ls){
            tab2.add(i);
        }

        //System.arraycopy(tab2, 0, ls, 0, tab2.size());
        System.out.println("Rozmiar tablicy 2: " + tab2.size());
        System.out.println("Koniec: "+ (System.currentTimeMillis() - time));


        // kopiowanie tablic za pomoca arraycopy
        time = System.currentTimeMillis();
        System.out.println("Start: "+ (System.currentTimeMillis() - time));
        System.arraycopy(ls.toArray(), 0, tab2.toArray(), 0, ls.size());

        System.out.println("Rozmiar tablicy 2 - arr: " + tab2.size());
        System.out.println("Koniec: "+ (System.currentTimeMillis() - time));
    }
}
