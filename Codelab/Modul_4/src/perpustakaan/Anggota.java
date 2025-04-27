package perpustakaan;

public class Anggota implements Peminjaman{
    private final String nama;
    private final String idAnggota;

    public Anggota(String nama, String idAnggota){
        this.nama = nama;
        this.idAnggota = idAnggota;
    }
    public void tampilkanInfo() {
        System.out.println("Anggota: " + nama + " (ID: " + idAnggota + ")");
    }
    @Override
    public void pinjamBuku(String judul) {
        System.out.println(nama + " meminjam buku berjudul: " + judul);
        AktivitasLog.addLog(nama + " meminjam buku: " + judul);
    }
    @Override
    public void pinjamBuku(String judul, int durasi) {
        System.out.println(nama + " meminjam buku \"" + judul + "\" selama " + durasi + " hari.");
        AktivitasLog.addLog(nama + " meminjam buku: " + judul);
    }
    @Override
    public void kembalikanBuku(String judul) {
        System.out.println(nama + " mengembalikan buku berjudul: " + judul);
        AktivitasLog.addLog(nama + " mengembalikan buku: " + judul);
    }
}
