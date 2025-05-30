public class TransaksiPengisian {
    Kendaraan kendaraan;
    BBM bbm;
    double liter, totalBayar;

    public TransaksiPengisian(Kendaraan kendaraan, BBM bbm, double liter) {
        this.kendaraan = kendaraan;
        this.bbm = bbm;
        this.liter = liter;
    }

    void tampilInformasi() {
        System.out.println(kendaraan.platNomor + ": Rp " + totalBayar);
    }
      public double totalBayar() {
        return liter * bbm.getHargaPerLiter();
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }
}