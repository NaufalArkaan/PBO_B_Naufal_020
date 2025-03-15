import java.util.Random;

class Pahlawan extends KarakterGame{
    private static final Random random = new Random();

    public Pahlawan(String nama, int kesehatan){
        super(nama, kesehatan);
    }

    @Override
    public void serang(KarakterGame target){
        String[] serangan = {"Orbital Strike", "Pedang Api", "Keris Petir"};
        String jenisSerangan = serangan[random.nextInt(serangan.length)];
        System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan " + jenisSerangan + "!");
        target.setKesehatan(target.getKesehatan() - 20);
        System.out.println(target.getNama() + " sekarang memiliki kesehatan " + target.getKesehatan());
    }
}
