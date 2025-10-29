package LatihanOCP;

public class DeluxeCinema extends Cinema1{
    public DeluxeCinema(double price) {
        this.price = price;
    }

    @Override
    Double calculateAdminFee() {
        return price * 12 / 100;
    }
}
