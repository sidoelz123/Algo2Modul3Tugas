package Modul3Tugas;

import java.util.Scanner;

public class Main {
    private static void Title() {
        String myHeader;
        myHeader = """
                ==============================
                Algoritma dan Struktur Data 2
                ==============================""";
        System.out.println(myHeader);
    }
    private static void PrintName(){
        String Name = "Ihza Maulana Zakiya";
        int NIM = 20090049;
        System.out.println("Nama : " + Name + "\nNIM : " +NIM+ "\n");

    }
    private static void PrintMetode(String Metode){
        System.out.println(Metode);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Main.Title();
        Main.PrintName();
        Main.PrintMetode("Soal Algoritma Pencarian\n" + "====================");
        Main.PrintMetode("""
                1. Metode Sequential Search
                2. Metode Binary Search
                3. Selesai""");
        System.out.print("\nPilih Jawaban Algoritma Pencarian = ");
        int Metode = scan.nextInt();

        switch (Metode) {
            case 1 -> {
                System.out.println("\nAnda Memilih Jawaban Nomor 1\n");
                Sequential.Library();
            }
            case 2 -> {
                System.out.println("\nAnda Memilih Jawaban Nomoor 2\n");
                Binary.Lib();
            }
            case 3 -> System.out.println("\nSee You Again ❤\n");
            default -> System.out.println("\n Pilihan Tidak Ada!!!");
        }

        System.out.println("\n ***** Terima Kasih *****\n");
        Main.PrintName();
    }

}
