package src.codelab1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean repeat = true;
        while (repeat) {
            Scanner scan = new Scanner(System.in);
            System.out.println("==== Pilih Hewan untuk Melihat Informasinya ====");
            System.out.println("1. Kucing");
            System.out.println("2. Anjing");
            System.out.println("3. Keluar");
            System.out.print("Masukan nomor hewan: ");
            int pilih = scan.nextInt();
            System.out.println();

            if (pilih == 1) {
                System.out.println("\uD83D\uDD0D Mengambil data hewan...");
                System.out.println("[====                ] ");
                System.out.println("[========            ] ");
                System.out.println("[============        ] ");
                System.out.println("[================    ] ");
                System.out.println("[====================]");
                System.out.println();
                Hewan hewan1 = new Hewan("Kucing", "Mamalia", "Nyann~~");
                hewan1.tampilkanInfo();
            } else if (pilih == 2) {
                System.out.println("\uD83D\uDD0D Mengambil data hewan...");
                System.out.println("[====                ] ");
                System.out.println("[========            ] ");
                System.out.println("[============        ] ");
                System.out.println("[================    ] ");
                System.out.println("[====================]");
                System.out.println();
                Hewan hewan2 = new Hewan("Anjing", "Mamalia", "Woof-Woof!!");
                hewan2.tampilkanInfo();
            } else if (pilih == 3) {
                System.out.println("Anda keluar dari program...");
                System.exit(1);
            } else {
                System.out.println("Input Invalid...");
            }
        }
    }
}