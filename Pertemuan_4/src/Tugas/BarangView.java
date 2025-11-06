package Tugas;

public class BarangView {
    public void tampilkanInfoBarang(String nama, int harga, int stok) {
        System.out.println("Nama Barang : " + nama);
        System.out.println("Harga Barang : " + harga);
        System.out.println("Stok Barang : " + stok);
    }

    public void tampilkanPembelian(int qty, int totalBayar) {
        System.out.println("\nTransaksi Pembelian");
        System.out.println("Jumlah barang : " + qty);
        System.out.println("Jumlah Bayar : " + totalBayar);
    }
}
