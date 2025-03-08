package src;
import java.util.Scanner;

public class Admin {
    String tigaNim = "020";
    String validTigaUser = "Admin" + tigaNim;
    String validTigaPass = "Password" + tigaNim;

    public void login(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan username: ");
        String user = scanner.nextLine();
        System.out.print("Masukan password: ");
        String pass = scanner.nextLine();
        if (user.equals(validTigaUser) && pass.equals(validTigaPass)) {
            System.out.println("Login admin berhasil!");
        } else {
            System.out.println("Login gagal! Username atau Password salah.");
        }
    }
}
