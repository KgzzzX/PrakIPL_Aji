/*
    Author  : Aji Kartiko Hartanto
    NIM     : 2350081062
    Tanggal : 08-01-2026
 */

package Nomor_2_3_4;

public class Lingkaran implements BidangDatar {
    private double jariJari;
    private final double PHI = 3.14;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double keliling() {
        return 2 * PHI * jariJari;
    }

    @Override
    public double luas() {
        return PHI * jariJari * jariJari;
    }
}
