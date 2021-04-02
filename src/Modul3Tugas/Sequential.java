package Modul3Tugas;

import java.util.Scanner;

public class Sequential {
    public static void Library() {
        String[] data = {"Galileo","Archimedes","Alkhawarizmi","Aljabar","Ihza","Tesla"};
        String keyword;
        Scanner sc = new Scanner(System.in);

        System.out.println("data yang ada");
        for (String datum : data) {
            System.out.print("["+datum + "] ");
        }

        System.out.print("\nMasukan Data yang akan dicari = ");
        keyword = sc.nextLine();
        System.out.println("\n");

        for (int i = 0; i <= data.length; i++) {
            if (keyword.equalsIgnoreCase(data[i])) {
                System.out.println("Data " + keyword + " berada di indeks ke-" + i);
                break;
            }
        }
    }
}
  