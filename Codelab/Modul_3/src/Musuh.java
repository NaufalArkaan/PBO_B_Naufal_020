import java.util.Random;

public class Musuh extends KarakterGame {
    private static final Random random = new Random();

    public Musuh(String name, int kesehatan){
        super(name, kesehatan);
    }

    @Override
    public void serang(KarakterGame target){
        String[] serangan = {"Snake Bite", "Pistol Air", "Pedang Mainan"};
        String jenisSerangan = serangan[random.nextInt(serangan.length)];
        System.out.println(getNama() + " menyerang " + target.getNama() + " Menggunakan " + jenisSerangan + "!");
        target.setKesehatan(target.getKesehatan() - 15);
        System.out.println(target.getNama() + " sekarang memiliki kesehatan " + target.getKesehatan());
    }
}
