package TugasDefensiveProgramming;

public class Tugas1 {
    public static void main(String[] args) {
        try {
            System.out.println(3 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Error: tidak dapat membagi dengan nol!");
        }
    }
}
