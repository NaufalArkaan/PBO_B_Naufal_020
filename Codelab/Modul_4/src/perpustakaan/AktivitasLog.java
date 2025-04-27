package perpustakaan;

import java.util.ArrayList;
import java.util.List;

public class AktivitasLog {
    private final static List<String> logs = new ArrayList<>(); //list logs untuk menyimpan catatan aktivitas

    public static void addLog(String log) {
        logs.add(log);
    }
    public static void printLogs() {
        System.out.println("\n===== Riwayat Aktivitas Peminjaman dan Pengembalian =====");
        for (String log : logs) {
            System.out.println(log);
        }
    }
}