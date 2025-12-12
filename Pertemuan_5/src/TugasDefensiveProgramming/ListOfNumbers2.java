package TugasDefensiveProgramming;

import java.io.*;
import java.util.Vector;

public class ListOfNumbers2 {
    private Vector<Integer> victor;
    private static final int size = 10;

    public ListOfNumbers2() {
        victor = new Vector<>(size);

        for (int i = 0; i < size; i++) {
            victor.addElement(i);
        }

        readList("infile.txt");
        writeList();
    }

    // ================================
    //      readList()
    // ================================
    public void readList(String fileName) {
        String line;

        RandomAccessFile raf = null;
        try {
            raf = new RandomAccessFile(fileName, "r");

            while ((line = raf.readLine()) != null) {
                Integer value = Integer.parseInt(line);
                System.out.println(value);
                victor.addElement(value);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: file " + fileName + " tidak ditemukan.");
        } catch (IOException e) {
            System.out.println("Error saat membaca file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: data dalam file bukan angka valid.");
        } finally {
            try {
                if (raf != null) {
                    raf.close();
                }
            } catch (IOException e) {
                System.out.println("Error saat menutup file: " + e.getMessage());
            }
        }
    }

    // ================================
    //      writeList()
    // ================================
    public void writeList() {
        PrintWriter out = null;

        try {
            out = new PrintWriter(new FileWriter("outfile.txt"));

            for (int i = 0; i < victor.size(); i++) {
                out.println("Value at: " + i + " = " + victor.elementAt(i));
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: index array melewati batas.");
        } catch (IOException e) {
            System.out.println("Error saat menulis output: " + e.getMessage());
        } finally {
            if (out != null) {
                System.out.println("Closing PrintWriter...");
                out.close();
            } else {
                System.out.println("PrintWriter tidak dapat dibuka!");
            }
        }
    }

    public static void main(String[] args) {
        new ListOfNumbers2();
    }
}
