import java.util.Scanner;

public class BioskopWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000;
        int jumlahTiket;
        double totalPenjualan = 0;
        int totalTiketTerjual = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli (ketik 0 untuk selesai): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket == 0) {
                break;
            }
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Silakan masukkan kembali!");
                continue;
            }

            double totalHarga = jumlahTiket * hargaTiket;

            if (jumlahTiket > 10) {
                totalHarga -= totalHarga * 0.15; 
            } else if (jumlahTiket > 4) {
                totalHarga -= totalHarga * 0.10;
            }

            totalPenjualan += totalHarga;
            totalTiketTerjual += jumlahTiket;

            System.out.println("Total harga setelah diskon: Rp " + totalHarga);
            System.out.println();
        }

        System.out.println("=== Laporan Penjualan Hari Ini ===");
        System.out.println("Total tiket terjual : " + totalTiketTerjual);
        System.out.println("Total penjualan     : Rp " + totalPenjualan);
        System.out.println("Pembelian selesai. Terima kasih!");
    }
}
