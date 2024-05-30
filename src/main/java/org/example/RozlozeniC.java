package org.example;

import javax.swing.JOptionPane;

public class RozlozeniC {

    public static void main(String[] args) {


        System.out.println("--------- ROZKLAD CISLA ---------");


        String cislo = JOptionPane.showInputDialog("Zadej cislo");

        rozkladCisla(cislo);


    }

    public static void rozkladCisla(String cislo) {
        int rad = 1;
        int x = 0;
        int z = 0;
        int c = Integer.parseInt(cislo);

        System.out.print("Cislo " + cislo + ": ");

        while (c > 0) {
            x = c / 10;
            z = c % 10;
            c = x;
            System.out.print(z + "x" + rad + ", ");
            rad = rad * 10;

        }
    }
}
