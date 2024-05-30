package org.example;// Java Program to print all unique prime factors

import java.io.*;
import java.lang.Math;
import java.util.*;
public class Faktorizace {

    public static void primeFactors(int n,
                                    HashSet<Integer> h)
    {
        while (n % 2 == 0) {

            h.add(2);
            n /= 2;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {

            while (n % i == 0) {
                h.add(i);
                n /= i;
            }
        }

        if (n > 2)
            h.add(n);
    }
    static void printFactors(HashSet<Integer> H)
    {
        Iterator<Integer> It = H.iterator();

        while (It.hasNext()) {

            System.out.print(It.next() + " ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        int n = 15;
        HashSet<Integer> h = new HashSet<>();

        primeFactors(n, h);

        printFactors(h);
    }
}
