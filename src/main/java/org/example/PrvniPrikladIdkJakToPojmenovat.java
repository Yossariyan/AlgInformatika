package org.example;

import java.util.Scanner;

public class PrvniPrikladIdkJakToPojmenovat {
    public static void main(String[] args) {

        System.out.println("zadej cislo");
        Scanner scan = new Scanner(System.in);
        int cislo = scan.nextInt();

        int pocetCisel = 0;
        int soucetCisel = 0;

        while (cislo >= soucetCisel){
            pocetCisel++;
            soucetCisel += pocetCisel;
        }
        System.out.println(pocetCisel);


        }
    }
