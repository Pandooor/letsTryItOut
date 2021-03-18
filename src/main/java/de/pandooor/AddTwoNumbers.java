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
        int n1 = 0;
        int n2 = 0;
        for (int i = 0; i < longest; i++) {
            if (i < l1.size()) {
                n1 = l1.get(i);
            } else {
                n1 = 0;
            }
            if (i < l2.size()) {
                n2 = l2.get(i);
            } else {
                n2 = 0;
            }
            //check whether there are numbers left in both lists else replace get(i) with 0
            currentsum += n1 + n2;
            answer.add(currentsum % 10);
            if (currentsum > 9) {
                currentsum = 1;
            } else {
                currentsum = 0;
            }
        }
        return answer;
    }


}
