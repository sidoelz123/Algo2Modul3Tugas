package Modul3Tugas;

import java.util.Scanner;

public class Binary {
    public static void Lib() {

        int [] data = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int IndeksAwal = 0;
        int IndeksAkhir = data.length-1;
        int ketemu = 0;
        int point;
        int cari;
        Scanner sc = new Scanner(System.in);

        System.out.println("data yang ada");
        for (int datum : data) {
            System.out.print(datum + " ");
        }
        System.out.print("\nMasukan Data yang akan dicari = ");
        cari = sc.nextInt();
        System.out.println("\n");

        while ((IndeksAwal <= IndeksAkhir) && (ketemu == 0)){
            point = (IndeksAwal + IndeksAkhir) /2;
            System.out.println("Indeks Pointer : " + point);
                if (cari == data[point]){
                    ketemu = 1;
                    System.out.println("Data ke- " + cari + " telah ditemukan pada index ke " + point);
                }
                else if (cari < data[point]){
                    System.out.println("cari di kiri ");
                    IndeksAkhir = point-1;
                }
                else {
                    IndeksAwal = point+1;
                    System.out.println("Cari di Kanan");
                }
        }
        if (ketemu == 1)
            System.out.println("\nKesimpulan : Data ditemukan");
        else
            System.out.println("\nKesimpulan : Data tidak ditemukan");
    }
}
