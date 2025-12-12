package LatihanDefensiveProgramming.MultipleCatchBlock;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcepTest {
    public static void main(String[] args) {

        try {
            FileInputStream file = new FileInputStream("input.txt");
            int x = file.read();
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan.");
        } catch (IOException e) {
            System.out.println("Gagal membaca file.");
        }
    }
}
