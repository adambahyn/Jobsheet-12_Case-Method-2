import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Menu SPBU ---");
        System.out.println("1. Tambah Antrian Kendaraan");
        System.out.println("2. Tampilkan Antrian");
        System.out.println("3. Cek Jumlah Antrian Kendaraan");
        System.out.println("4. Layani Kendaraan");
        System.out.println("5. Tampilkan Riwayat Transaksi");
        System.out.println("0. Keluar");
        System.out.print("Pilih: ");
        int pilih = sc.nextInt();

        switch (pilih) {
            case 1:
                
                break;
            case 2:
                System.out.println("-- Antrian Kendaraan --");
                break;
            case 3:
                
                break;
            case 4:
                
                break;
            case 5:
                System.out.println("-- Riwayat Transaksi --");
                break;
        
            default:
                break;
        }
    }
}
