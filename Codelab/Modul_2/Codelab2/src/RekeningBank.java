public class RekeningBank {
    String nomorRekening;
    String namaPemilik;
    double saldo;
    RekeningBank(String nomorRekening, String namaPemilik, double saldo){
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }
    public void tampilkanInfo(){
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: " + saldo);
        System.out.println();
    }
    public void setorUang(double jumlah){
        saldo += jumlah;
        System.out.println(namaPemilik + " menyetor Rp" + jumlah + ". Saldo sekarang: " + saldo);
        System.out.println();
    }
    public void tarikUang(double jumlah){
        if (jumlah > saldo){
            System.out.println(namaPemilik + " menarik Rp" + jumlah + ". (Gagal, saldo tidak mencukupi) Saldo saat ini: Rp" + saldo);
            System.out.println();
        }else{
            saldo-=jumlah;
            System.out.println(namaPemilik + " menarik Rp" + jumlah + " (Berhasil) Saldo sekarang: Rp" + saldo);
            System.out.println();
        }
    }
}
