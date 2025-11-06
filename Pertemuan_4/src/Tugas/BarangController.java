package Tugas;

public class BarangController {
    private Barang model;
    private BarangView view;

    public BarangController(Barang model, BarangView view) {
        this.model = model;
        this.view = view;
    }

    public void tampilkanInfoBarang() {
        view.tampilkanInfoBarang(model.getNama(), model.getHarga(), model.getStok());
    }

    public void beliBarang(int qty) {
        if (qty > model.getStok()) {
            System.out.println("\nStok tidak mencukupi!");
        } else {
            int totalBayar = qty * model.getHarga();
            model.setStok(model.getStok() - qty);
            view.tampilkanPembelian(qty, totalBayar);
        }
    }

    public void updateView() {
        view.tampilkanInfoBarang(model.getNama(), model.getHarga(), model.getStok());
    }
}
