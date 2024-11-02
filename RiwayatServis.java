public class RiwayatServis {\public class RiwayatServis {
    private Kendaraan kendaraan;
    private String tanggalServis;
    private Layanan layanan;

    public RiwayatServis(Kendaraan kendaraan, String tanggalServis, Layanan layanan) {
        this.kendaraan = kendaraan;
        this.tanggalServis = tanggalServis;
        this.layanan = layanan;
    }

    @Override
    public String toString() {
        return "Tanggal Servis: " + tanggalServis + ", Kendaraan: " + kendaraan.getNomorPlat() + ", Layanan: " + layanan.getDeskripsi();
    }
}

}
