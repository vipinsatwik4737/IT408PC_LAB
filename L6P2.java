import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class ArrayDequeDemo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayDeque<String> ad = new ArrayDeque<>();
        ArrayList<String> li = new ArrayList<>();

        System.out.println("Enter 5 elements:");
        for(int i = 0; i < 5; i++) {
            ad.offer(s.nextLine());
        }
        li.addAll(ad);
        if(li.size() > 4) {
            li.remove(4);
        }
        ad.clear();
        ad.addAll(li);
        for(String str : ad) {
            System.out.print(str + " ");
        }
        System.out.println();

        Collections.sort(li);
        ad.clear();
        ad.addAll(li);
        for(String str : ad) {
            System.out.print(str + " ");
        }
    }
}