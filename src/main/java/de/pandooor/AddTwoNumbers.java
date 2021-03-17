package de.pandooor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AddTwoNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList();
        ArrayList<Integer> l2 = new ArrayList();
        Random r = new Random();
        for (int i = 0; i < 1000; i++) {
            int digits1 = r.nextInt(100);
            int digits2 = r.nextInt(100);
            for (int j = 0; j < digits1; j++) {
                if (j == digits1 - 1) {
                    l1.add(r.nextInt(9) + 1);
                } else {
                    l1.add(r.nextInt(10));
                }
            }
            for (int j = 0; j < digits2; j++) {
                if (j == digits2 - 1) {
                    l2.add(r.nextInt(9) + 1);
                } else {
                    l2.add(r.nextInt(10));
                }
            }
            if (l1.size() == 0) {
                l1.add(0);
            }
            if (l2.size() == 0) {
                l2.add(0);
            }
            System.out.println(l1);
            System.out.println("     +      ");
            System.out.println(l2);
            System.out.println("     =      ");
            System.out.println(addTwo(l1, l2));
            l1.clear();
            l2.clear();
        }
    }

    public static List<Integer> addTwo(List<Integer> l1, List<Integer> l2) {
        int currentsum = 0;
        ArrayList<Integer> answer = new ArrayList();
        int longest = Math.max(l1.size(), l2.size());
        for (int i = 0; i < longest; i++) {
            //check whether there are numbers left in both lists else replace get(i) with 0
            currentsum = l1.get(i) + l2.get(i);
        }

        return answer;
    }


}
