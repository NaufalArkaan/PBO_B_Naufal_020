package src.codelab2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean repeat = true;
        while (repeat) {
            System.out.println("\n==== Selamat Datang di Mesin ATM BCA Prioritas ====");
            System.out.println("Masukan informasi rekening pertama (1):");
            System.out.print("Nomor Rekening: ");
            String nomorRekening1 = scan.nextLine();
            System.out.print("Masukan Nama Anda: ");
            String nama1 = scan.nextLine();
            System.out.print("Saldo Awal: Rp");
            double saldo1 = scan.nextDouble();
            scan.nextLine();

            System.out.println("Masukan informasi rekening kedua (2):");
            System.out.print("Nomor Rekening: ");
            String nomorRekening2 = scan.nextLine();
            System.out.print("Masukan Nama Anda: ");
            String nama2 = scan.nextLine();
            System.out.print("Saldo Awal: Rp");
            double saldo2 = scan.nextDouble();
            System.out.println();

            RekeningBank rekening1 = new RekeningBank(nomorRekening1, nama1, saldo1);
            RekeningBank rekening2 = new RekeningBank(nomorRekening2, nama2, saldo2);

            rekening1.tampilkanInfo();
            System.out.println();
            rekening2.tampilkanInfo();
            System.out.println();

            System.out.print(nama1 + ", masukkan jumlah uang yang ingin disetor: Rp");
            double setor1 = scan.nextDouble();
            rekening1.setorUang(setor1);
            System.out.print(nama2 + ", masukkan jumlah uang yang ingin disetor: Rp");
            double setor2 = scan.nextDouble();
            rekening2.setorUang(setor2);

            System.out.print(nama1 + ", masukkan jumlah uang yang ingin ditarik: Rp");
            double tarik1 = scan.nextDouble();
            rekening1.tarikUang(tarik1);
            System.out.print(nama1 + ", masukkan jumlah uang yang ingin ditarik: Rp");
            double tarik2 = scan.nextDouble();
            rekening2.tarikUang(tarik2);

            System.out.println("==== Informasi Saldo Akhir ====\n");
            rekening1.tampilkanInfo();
            rekening2.tampilkanInfo();
            System.out.println("==== Terima Kasih ====\n");


            System.out.print("Ketik 1 untuk berhenti atau ketik 2 untuk lanjut: ");
            int pilih = scan.nextInt();

            switch(pilih){
                case 1:
                    System.out.println("Keluar dari program...");
                    System.exit(1);
                    break;
                case 2:
                    System.out.println("Okee lanjutt...");
            }
            scan.nextLine();
        }
    }
}
