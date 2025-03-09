import java.util.Scanner;

public class Mahasiswa {
    String nama = "Naufal Arkaan";
    String nim = "202410370110020";

    public void login(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Nama: ");
        String namaInput = scanner.nextLine();
        System.out.print("Masukan NIM: ");
        String nimInput = scanner.nextLine();
        if (namaInput.equals(nama) && nimInput.equals(nim)) {
            info();
        } else {
            System.out.println("Login gagal! Nama atau NIM salah.");
        }
    }

    public void info(){
        System.out.println("Login Mahasiswa berhasil! ");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }
}