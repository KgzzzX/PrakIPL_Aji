package LatihanOCP;

public class PremiumCinema extends Cinema1{
    public PremiumCinema(double price) {
        this.price = price;
    }

    @Override
    Double calculateAdminFee() {
        return price * 20 / 100;
    }
}
