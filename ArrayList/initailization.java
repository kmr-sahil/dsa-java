package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;
public class initailization {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList <> ();

        //add
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

        // add at index
        list.add(2, 60);
        System.out.println(list);

        // get
        System.out.println(list.get(3));

        // set
        list.set(2, 100);
        System.out.println(list);

        // remove
        list.remove(0);
        System.out.println(list);

        // size
        System.out.println(list.size());
    }
}
