package LatihanOCP;

public class CinemaMahasiswa extends Cinema1{
    public CinemaMahasiswa(double price) {
        this.price = price;
    }

    @Override
    Double calculateAdminFee() {
        return price * 5 / 100;
    }
}
