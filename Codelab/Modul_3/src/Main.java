public class Main {
    public static void main(String[] args) {
        KarakterGame KarakterUmum = new KarakterGame("Karakter Umum", 100);
        Pahlawan Brimstone = new Pahlawan("Brimstone", 150);
        Musuh Viper = new Musuh("Viper", 200);

        System.out.println("==== Status Awal ====");
        System.out.println(Brimstone.getNama() + " memiliki kesehatan: " + Brimstone.getKesehatan());
        System.out.println(Viper.getNama() + " memiliki kesehatan: " + Viper.getKesehatan());
        System.out.println("\n=== Pertarungan Dimulai ===");
        Brimstone.serang(Viper);
        Viper.serang(Brimstone);
        System.out.println("\n=== Pertarungan Selesai ===");
    }
}
