import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LLTransaksi list = new LLTransaksi();
        AntrianKendaraan q = new AntrianKendaraan(10);
        int pilih;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("--- Menu SPBU ---");
            System.out.println("1. Tambah Antrian Kendaraan");
            System.out.println("2. Tampilkan Antrian");
            System.out.println("3. Cek Jumlah Antrian Kendaraan");
            System.out.println("4. Layani Kendaraan");
            System.out.println("5. Tampilkan Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Plat Nomor: ");
                    String plat = sc.nextLine();
                    System.out.print("Masukkan Jenis Kendaraan: ");
                    String jenis = sc.nextLine();
                    System.out.print("Masukkan Merk: ");
                    String merk = sc.nextLine();
                    q.tambahAntrian(new Kendaraan(plat, jenis, merk));
                    break;
                case 2:
                    q.print();
                    break;
                case 3:
                    System.out.println(">> Jumlah kendaraan dalam antrian: " + q.jumlahKendaraan());
                    break;
                case 4:
                    Kendaraan dequeued = q.layaniAntrian();
                    if (dequeued != null) {
                        System.out.println("Petugas Melayani " + dequeued.platNomor);
                        System.out.print("Masukkan Jenis BBM: ");
                        String bbm = sc.nextLine();
                        System.out.print("Masukkan Harga Per Liter: ");
                        double harga = sc.nextDouble();
                        System.out.print("Masukkan Jumlah Liter: ");
                        int jumlah = sc.nextInt();
                        sc.nextLine();
                        TransaksiPengisian trk = new TransaksiPengisian(null, null, jumlah);
                        list.addLast(null);
                    }
                    break;
                case 5:
                    System.out.println("-- Riwayat Transaksi --");
                    list.print();
                    break;
                default:
                    break;
            }
        } while (pilih != 0);
    }
}
