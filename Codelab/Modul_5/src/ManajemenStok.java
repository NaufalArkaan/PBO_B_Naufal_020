import java.util.Iterator;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class ManajemenStok {
    public static void main(String[] args) {
        ArrayList<Barang> daftarBarang = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println();
            System.out.println("===== Menu Manajemen Stok =====");
            System.out.println("1. Tambah Barang Baru");
            System.out.println("2. Tampilkan Semua Barang");
            System.out.println("3. Kurangi Stok Barang");
            System.out.println("4. Hapus barang");
            System.out.println("0. Keluar");
            System.out.print("Pilih opsi: ");
            int opsi;

            try{
                opsi = scan.nextInt();
                scan.nextLine();
            }catch(InputMismatchException e){
                System.out.println("Sistem eror, inputan anda salah!!");
                scan.nextLine();
                continue;
            }

            switch (opsi){
                case 1:
                    try{
                        System.out.print("Masukan nama barang: ");
                        String nama = scan.nextLine();
                        System.out.print("Masukan stok awal: ");
                        int stokAwal = scan.nextInt();
                        daftarBarang.add(new Barang(nama, stokAwal));
                        System.out.println("Barang " + nama + " berhasil ditambahkan.");
                    }catch (InputMismatchException e){
                        System.out.println("Input stok harus berupa angka!");
                        scan.nextLine();
                    }
                    break;
                case 2:
                    System.out.println("--- Daftar Barang ---");
                    if(daftarBarang.isEmpty()){
                        System.out.println("Stok barang kosong.");
                    }else{
                        Iterator<Barang> iterator = daftarBarang.iterator();
                        int index = 0;
                        while (iterator.hasNext()) {
                            Barang b = iterator.next();
                            System.out.println(index + ". Nama: " + b.getNama() + ", Stok: " + b.getStok());
                            index++;
                            System.out.println("---------------------");
                        }
                    }
                    break;
                case 3:
                    System.out.println("--- Daftar Barang (Pilih untuk Kurangi Stok) ---");
                    for(int i = 0; i < daftarBarang.size(); i++){
                        Barang b = daftarBarang.get(i);
                        System.out.println(i + "." +  b.getNama() + " (Stok: " + b.getStok() + ")");
                    }
                    try{
                        System.out.print("Masukkan nomor indeks barang: ");
                        int indeks = scan.nextInt();

                        System.out.print("Masukkan jumlah stok yang akan diambil: ");
                        int jumlahDiambil = scan.nextInt();
                        scan.nextLine();

                        Barang barang = daftarBarang.get(indeks);

                        if (jumlahDiambil > barang.getStok()) {
                            throw new StokTidakCukupException(
                                    "Stok untuk '" + barang.getNama() + "' hanya tersisa " + barang.getStok());
                        }

                        barang.setStok(barang.getStok() - jumlahDiambil);
                        System.out.println("Stok barang '" + barang.getNama() + "' berhasil dikurangi. Sisa stok: " + barang.getStok());
                    } catch (InputMismatchException e) {
                        System.out.println("Input harus berupa angka!");
                        scan.nextLine();
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Indeks tidak valid!");
                    } catch (StokTidakCukupException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("--- Daftar Barang (Pilih untuk Dihapus) ---");
                    if (daftarBarang.isEmpty()) {
                        System.out.println("Stok barang kosong, tidak ada yang bisa dihapus.");
                    } else {
                        for (int i = 0; i < daftarBarang.size(); i++) {
                            Barang b = daftarBarang.get(i);
                            System.out.println(i + ". " + b.getNama() + " (Stok: " + b.getStok() + ")");
                        }
                        try {
                            System.out.print("Masukkan indeks barang yang ingin dihapus: ");
                            int indeksHapus = scan.nextInt();
                            scan.nextLine(); // bersihkan buffer

                            Barang barangDihapus = daftarBarang.remove(indeksHapus);
                            System.out.println("Barang '" + barangDihapus.getNama() + "' berhasil dihapus.");
                        } catch (InputMismatchException e) {
                            System.out.println("Input harus berupa angka!");
                            scan.nextLine();
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("Indeks tidak valid!");
                        }
                    }
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    scan.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        }
    }
}