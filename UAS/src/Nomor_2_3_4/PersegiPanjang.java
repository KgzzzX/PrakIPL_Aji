/*
    Author  : Aji Kartiko Hartanto
    NIM     : 2350081062
    Tanggal : 08-01-2026
 */

package Nomor_2_3_4;

public class PersegiPanjang implements BidangDatar {
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double keliling() {
        return (2 * panjang) + (2 * lebar);
    }

    @Override
    public double luas() {
        return panjang * lebar;
    }
}
