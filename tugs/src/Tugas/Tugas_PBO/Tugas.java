package Tugas.Tugas_PBO;

import java.util.Scanner;
public class Tugas {
    public static void main(String[] args) {
        boolean repeat = true;
        while (repeat) {
            String tigaNim = "020";
            String validTigaUser = "Admin" + tigaNim;
            String validTigaPass = "Password" + tigaNim;

            Scanner scanner = new Scanner(System.in);
            System.out.println("Pilih login: ");
            System.out.println("1. Admin");
            System.out.println("2. Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Masukan pilihan: ");
            int pilih = scanner.nextInt();
            scanner.nextLine();

            if (pilih == 1) {
                System.out.print("Masukan username: ");
                String user = scanner.nextLine();
                System.out.print("Masukan password: ");
                String pass = scanner.nextLine();
                if (user.equals(validTigaUser) && pass.equals(validTigaPass)) {
                    System.out.println("Login admin berhasil!");
                } else {
                    System.out.println("Login gagal! Username atau Password salah.");
                }
            } else if (pilih == 2) {
                System.out.print("Masukan Nama: ");
                String nama = scanner.nextLine();
                System.out.print("Masukan NIM: ");
                long nim = scanner.nextLong();
                if (validasiNim(nim)) {
                    System.out.println("Login Mahasiswa berhasil! ");
                    System.out.println("Nama: " + nama);
                    System.out.println("NIM: " + nim);
                } else {
                    System.out.println("Login gagal! Nama atau NIM salah.");
                }
            } else if (pilih == 3) {
                System.out.println("Anda telah keluar dari program...");
                System.exit(0);
            } else {
                System.out.println("Pilihan tidak valid.");
            }
//            scanner.close();
        }
    }

    public static boolean validasiNim(long input) {
        String angkaString = Long.toString(input); //konversi lpng ke string
        return angkaString.length() == 15; //Mengembalikan nilai jika hasilnya true
    }
}

