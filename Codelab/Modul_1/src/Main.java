import java.time.Year; //Digunakan untuk mengimport tahun saat ini.
import java.util.Scanner; //Digunakan untuk membaca input dari pengguna.

public class Main { //Menentukan nama class yang digunakan (sesuai dengan nama filenya)
    public static void main(String[] args) { // Struktur utama yang dijalankan pertama kali saat program berjalan.
        //Deklarasi tipe data dan nama variabelnya
        String name; //Tipe data String dengan nama variabel "name"
        char gender; //Tipe data character dengan nama variabel "gender"
        int birth; //Tipe data integer dengan nama variabel "birth"

        //Program utamanya
        Scanner input = new Scanner(System.in); //Deklarasi nama variabel "input" untuk menerima inputan dari user
        System.out.printf("Enter name: "); //Printf tampilan pada program
        name = input.nextLine(); //Membaca nama lengkap yang dimasukkan pengguna
        System.out.printf("Enter gender (M/F): "); //Printf tampilan pada program
        gender = input.next().charAt(0); // Membaca satu karakter pertama yang dimasukkan pengguna untuk gender.
        System.out.printf("Enter year of birth (yyyy): "); //Printf tampilan paPda program
        birth = input.nextInt(); //Menyimpan tahun lahir yang dimasukkan pengguna ke dalam variabel birth.
        System.out.printf("\n");

        //Mencetak hasil program yang telah di inputkan
        System.out.println("Personal data: "); //Printf tampilan pada program
        System.out.printf("Name \t: %s\n", name); //Mencetak hasil nama yang sudah diinputkan sebelumnya
        if (gender == 'M' || gender == 'm') { //perkondisian, jika inputan huruf M atau m, maka program akan mencetak Male di tampilan terminal
            System.out.println("Gender \t: Male");
        } else if (gender == 'F' || gender == 'f') {  //perkondisian, jika inputan huruf F atau f, maka program akan mencetak Female di tampilan terminal
            System.out.println("Gender \t: Female");
        } else { //Perkondisian jika if dan else if tidak terpenuhi, maka akan menampilan "invalid" ke layar terminal
            System.out.println("Invalid");
            System.exit(0);
        }
        int currentYear = Year.now().getValue(); //Menyimpan hasil tahun saat ini ke dalam variabel currentYear
        int age = currentYear - birth; //Mengurangkan tahun saat ini dengan tahun lahir sesuai dengan yang kita inputkan
        System.out.printf("Age \t: %d years old", age); //Mencetak hasil umur
        System.out.printf("\n");

        //Tambahan Kreativitas untuk mengecek usianya temasuk dalam kategori anak-anak, dewasa, remaja, atau tua.
        if (age >= 0 && age <= 10) {
            System.out.println("You are still a child");
        } else if (age >= 11 && age <= 15) {
            System.out.println("You are in the growing phase of adulthood");
        } else if (age >= 16 && age <= 20) {
            System.out.println("You are an adult");
        } else if (age >= 21 && age <= 30) {
            System.out.println("You are a teenager");
        } else if (age > 30) {
            System.out.println("You are old");
        }
        input.close();
    }
}
