public class Hewan {
    String Nama;
    String Jenis;
    String Suara;
    Hewan(String Nama, String Jenis, String Suara){ //konstruktor
        this.Nama = Nama;
        this.Jenis = Jenis;
        this.Suara = Suara;
    }
    public void tampilkanInfo(){
        System.out.println("==== Informasi Hewan ====");
        System.out.println("Nama: " + Nama);
        System.out.println("Jenis: " + Jenis);
        System.out.println("Suara: " + Suara);
        System.out.println("=========================");
        System.out.print("\n");
    }
}