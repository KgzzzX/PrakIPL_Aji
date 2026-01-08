/*
    Author  : Aji Kartiko Hartanto
    NIM     : 2350081062
    Tanggal : 08-01-2026
 */

package Nomor_1;

public class BidangDatar {
    private double panjang;
    private double lebar;
    private double sisi;
    private double jariJari;
    private double attribute; // sesuai diagram

    private final double PHI = 3.14;

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getAttribute() {
        return attribute;
    }

    public void setAttribute(double attribute) {
        this.attribute = attribute;
    }

    public double kelilingPersegi() {
        return 4 * sisi;
    }

    public double luasPersegi() {
        return sisi * sisi;
    }

    public double kelilingPersegiPanjang() {
        return (2 * panjang) + (2 * lebar);
    }

    public double luasPersegiPanjang() {
        return panjang * lebar;
    }

    public double kelilingLingkaran() {
        return 2 * PHI * jariJari;
    }

    public double luasLingkaran() {
        return PHI * jariJari * jariJari;
    }
}
