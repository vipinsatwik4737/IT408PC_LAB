import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> ad = new ArrayDeque<>();
        System.out.println(ad.isEmpty());
        ad.add("Red");
        ad.add("Blue");
        ad.add("Green");
        ad.add("Yellow");
        ad.add("Black");
        ArrayList<String> tempList = new ArrayList<>(ad);
        if (tempList.size() >= 4) {
            tempList.remove(3);
        }
        ad.clear();
        ad.addAll(tempList);
        for (String color : ad) {
            System.out.println(color);
        }
        ArrayList<String> sortList = new ArrayList<>(ad);
        Collections.sort(sortList, new Comparator<String>() {
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
        ad.clear();
        ad.addAll(sortList);
        Iterator<String> it = ad.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println(ad.peek());
        ad.clear();
        System.out.println(ad.isEmpty());
    }
}