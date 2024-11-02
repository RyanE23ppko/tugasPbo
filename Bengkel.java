import java.util.ArrayList;
import java.util.List;

public class Bengkel {
    private String nama;
    private List<Kendaraan> kendaraanTerdaftar = new ArrayList<>();
    private List<Pelanggan> pelangganTerdaftar = new ArrayList<>();
    private List<RiwayatServis> riwayatServis = new ArrayList<>();

    public Bengkel(String nama) {
        this.nama = nama;
    }

    public void tambahKendaraan(Kendaraan kendaraan) {
        kendaraanTerdaftar.add(kendaraan);
    }

    public void tambahPelanggan(Pelanggan pelanggan) {
        pelangganTerdaftar.add(pelanggan);
    }

    public void tambahRiwayatServis(RiwayatServis servis) {
        riwayatServis.add(servis);
    }

    public void tampilkanRiwayatServis() {
        for (RiwayatServis servis : riwayatServis) {
            System.out.println(servis);
        }
    }

    // Getter untuk nama, kendaraanTerdaftar, pelangganTerdaftar, dan riwayatServis (opsional)
    public String getNama() {
        return nama;
    }

    public List<Kendaraan> getKendaraanTerdaftar() {
        return kendaraanTerdaftar;
    }

    public List<Pelanggan> getPelangganTerdaftar() {
        return pelangganTerdaftar;
    }

    public List<RiwayatServis> getRiwayatServis() {
        return riwayatServis;
    }
}
