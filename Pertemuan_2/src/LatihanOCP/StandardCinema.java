package LatihanOCP;

public class StandardCinema extends Cinema1{
    public StandardCinema(double price) {
        this.price = price;
    }

    @Override
    Double calculateAdminFee() {
        return price * 10 / 100;
    }
}
