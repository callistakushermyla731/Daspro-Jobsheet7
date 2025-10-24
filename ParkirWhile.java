import java.util.Scanner;
public class ParkirWhile {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi;
        int total = 0;

        System.out.println("=== Program Hitung Total Parkir ===");

        System.out.print("Masukkan jenis kendaraan (1 Mobil, 2 Motor, 0 Keluar): ");
        jenis = sc.nextInt();

        while (jenis != 0) {
            System.out.print("Masukkan durasi parkir (jam): ");
            durasi = sc.nextInt();

            if (durasi > 5) {
                total += 12500;
            } else if (jenis == 1) {
                total += durasi * 3000;
            } else if (jenis == 2) {
                total += durasi * 2000;
            } else {
                System.out.println("Jenis kendaraan tidak valid.");
            } 

            System.out.print("\nMasukkan jenis kendaraan (1 Mobil, 2 Motor, 0 Keluar): ");
            jenis = sc.nextInt();
        }

        System.out.println("\nTotal pembayaran parkir: Rp " + total);
        System.out.println("Terima kasih telah menggunakan layanan parkir!");
    }
}

