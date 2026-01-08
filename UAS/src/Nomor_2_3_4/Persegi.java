/*
    Author  : Aji Kartiko Hartanto
    NIM     : 2350081062
    Tanggal : 08-01-2026
 */

package Nomor_2_3_4;

public class Persegi implements BidangDatar {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double keliling() {
        return 4 * sisi;
    }

    @Override
    public double luas() {
        return sisi * sisi;
    }
}
