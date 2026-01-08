/*
    Author  : Aji Kartiko Hartanto
    NIM     : 2350081062
    Tanggal : 08-01-2026
 */

package Nomor_2_3_4;

public class SegitigaSiku implements BidangDatar {

    private double a; // alas
    private double b; // tinggi
    private double c; // sisi miring

    public SegitigaSiku(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double keliling() {
        return a + b + c;
    }

    @Override
    public double luas() {
        return 0.5 * a * b;
    }
}
