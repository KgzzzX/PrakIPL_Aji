package Tugas;

import java.util.Scanner;

public class KasirMVC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Inisialisasi data barang
        Barang model = new Barang("GeForce GTX 1060Ti", 3000, 10);
        BarangView view = new BarangView();
        BarangController controller = new BarangController(model, view);

        // Tampilkan data awal
        System.out.println("=== Informasi Barang ===");
        controller.tampilkanInfoBarang();

        // Transaksi
        System.out.print("\nMasukkan jumlah barang yang ingin dibeli: ");
        int qty = input.nextInt();

        // Lakukan pembelian
        controller.beliBarang(qty);

        // Tampilkan stok setelah pembelian
        System.out.println("\n=== Informasi Setelah Pembelian ===");
        controller.updateView();

        input.close();
    }
}
