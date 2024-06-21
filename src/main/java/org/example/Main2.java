package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Clovek> lidi = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Clovek c = new Clovek(sc.next(), sc.next(), sc.nextInt());
            if (!lidi.contains(c)) {
                lidi.add(c);
            }
        }

        System.out.println(lidi);
    }
}