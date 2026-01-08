/*
    Author  : Aji Kartiko Hartanto
    NIM     : 2350081062
    Tanggal : 08-01-2026
 */

package Nomor_2_3_4;

import java.util.Scanner;

public class BidangDatarApps {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Lingkaran
        System.out.println("Bidang Datar Lingkaran");
        System.out.print("Masukan besar Jari-jari: ");
        double r = input.nextDouble();
        BidangDatar lingkaran = new Lingkaran(r);

        System.out.println("Keliling Lingkaran adalah " + lingkaran.keliling());
        System.out.println("Luas Lingkaran adalah " + lingkaran.luas());

        // Persegi
        System.out.println("\nBidang Datar Persegi");
        System.out.print("Masukan besar Sisi: ");
        double s = input.nextDouble();
        BidangDatar persegi = new Persegi(s);

        System.out.println("Keliling Persegi adalah " + persegi.keliling());
        System.out.println("Luas Persegi adalah " + persegi.luas());

        // Persegi Panjang
        System.out.println("\nBidang Datar Persegi Panjang");
        System.out.print("Masukan besar Panjang: ");
        double p = input.nextDouble();
        System.out.print("Masukan besar Lebar: ");
        double l = input.nextDouble();
        BidangDatar pp = new PersegiPanjang(p, l);

        System.out.println("Keliling Persegi Panjang adalah " + pp.keliling());
        System.out.println("Luas Persegi Panjang adalah " + pp.luas());

        // Segitiga Siku
        System.out.println("\nBidang Datar Segitiga Siku");
        System.out.print("Masukan alas: ");
        double a = input.nextDouble();
        System.out.print("Masukan tinggi: ");
        double b = input.nextDouble();
        System.out.print("Masukan sisi miring: ");
        double c = input.nextDouble();

        BidangDatar segitiga = new SegitigaSiku(a, b, c);
        System.out.println("Keliling Segitiga adalah " + segitiga.keliling());
        System.out.println("Luas Segitiga adalah " + segitiga.luas());
    }
}
