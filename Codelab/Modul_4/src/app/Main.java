package app;

import perpustakaan.*;

public class Main {
    public static void main(String[] args) {
        NonFiksi nonfiksi1 = new NonFiksi("Madilog", "Tan Malaka", "Sejarah & Ilmu Pengetahuan");
        Fiksi fiksi2 = new Fiksi("Hainuwele: Sang Putri Kelapa", "Lilis Hu", "Dongeng");

        nonfiksi1.displayInfo();
        fiksi2.displayInfo();
        System.out.println();

        Anggota anggota1 = new Anggota("Naufal Arkaan", "020");
        Anggota anggota2 = new Anggota("Muhammad Robi Ardita", "002");

        anggota1.tampilkanInfo();
        anggota2.tampilkanInfo();
        System.out.println();

        anggota1.pinjamBuku("Madilog");
        anggota2.pinjamBuku("Hainuwele: Sang Putri Kelapa", 7);
        System.out.println();

        anggota1.kembalikanBuku("Madilog");
        anggota2.kembalikanBuku("Hainuwele: Sang Putri Kelapa");

        AktivitasLog.printLogs();
    }
}