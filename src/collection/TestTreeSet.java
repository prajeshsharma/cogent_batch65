package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        TreeSet<String> product = new TreeSet<>();
        product.add("portal_gun");
        product.add("robot");
        product.add("teleporter");
        product.add("plumbus");
        product.add("battery");
        product.add("plumbus");
        product.add("xanthenite");
        product.add("purgenol");
        product.add("purgenol");
        product.add("eyeholes");
        product.add("grabby");
        product.add("Kramer");
        product.add("plumbus");


        Iterator<String> itr = product.iterator();
        while (itr.hasNext()) System.out.print(itr.next() + " ");
        System.out.println();

        System.out.println("first: " + product.first() + ", last: " + product.last());

        System.out.println("size before removing: " + product.size());
        product.remove("plumbus");
        System.out.println("size after removing: " + product.size());


     }
}
