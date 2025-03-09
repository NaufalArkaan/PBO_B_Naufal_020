import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        boolean repeat = true;
        while (repeat) {
            Admin admin = new Admin();
            Mahasiswa mahasiswa = new Mahasiswa();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Pilih login: ");
            System.out.println("1. Admin");
            System.out.println("2. Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Masukan pilihan: ");
            int pilih = scanner.nextInt();
            scanner.nextLine();

            if (pilih == 1) {
                admin.login();
            } else if (pilih == 2) {
                mahasiswa.login();
            } else if (pilih == 3) {
                System.out.println("Anda telah keluar dari program...");
                System.exit(0);
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }
    }
}