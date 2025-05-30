public class Kendaraan {
    String platNomor, tipe, merk;

    public Kendaraan(String platNomor, String tipe, String merk) {
        this.platNomor = platNomor;
        this.tipe = tipe;
        this.merk = merk;
    }

    void tampilkanData() {
        System.out.println("Plat Nomor: " + this.platNomor);
        System.out.println("Tipe: " + this.tipe);
        System.out.println("Merk: " + this.merk);
    }
}