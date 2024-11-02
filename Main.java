import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Membuat instance bengkel
        Bengkel bengkel = new Bengkel("Bengkel Kita");

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("=== Sistem Manajemen Kendaraan Bengkel ===");
            System.out.println("1. Tambah Kendaraan");
            System.out.println("2. Tambah Pelanggan");
            System.out.println("3. Tambah Layanan dan Riwayat Servis");
            System.out.println("4. Tampilkan Riwayat Servis");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (pilihan) {
                case 1:
                    // Tambah Kendaraan
                    System.out.print("Masukkan tipe kendaraan (1: Mobil, 2: Motor): ");
                    int tipeKendaraan = scanner.nextInt();
                    scanner.nextLine();  // Consume newline

                    System.out.print("Masukkan nomor plat: ");
                    String nomorPlat = scanner.nextLine();
                    System.out.print("Masukkan merk: ");
                    String merk = scanner.nextLine();

                    if (tipeKendaraan == 1) {
                        System.out.print("Masukkan jumlah pintu: ");
                        int jumlahPintu = scanner.nextInt();
                        Mobil mobil = new Mobil(nomorPlat, merk, jumlahPintu);
                        bengkel.tambahKendaraan(mobil);
                    } else if (tipeKendaraan == 2) {
                        System.out.print("Masukkan kapasitas mesin (cc): ");
                        int kapasitasMesin = scanner.nextInt();
                        Motor motor = new Motor(nomorPlat, merk, kapasitasMesin);
                        bengkel.tambahKendaraan(motor);
                    } else {
                        System.out.println("Tipe kendaraan tidak valid.");
                    }
                    break;

                case 2:
                    // Tambah Pelanggan
                    System.out.print("Masukkan nama pelanggan: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan nomor telepon: ");
                    String nomorTelepon = scanner.nextLine();
                    Pelanggan pelanggan = new Pelanggan(nama, nomorTelepon);
                    bengkel.tambahPelanggan(pelanggan);
                    break;

                case 3:
                    // Tambah Layanan dan Riwayat Servis
                    System.out.print("Masukkan nomor plat kendaraan yang diservis: ");
                    nomorPlat = scanner.nextLine();

                    Kendaraan kendaraan = null;
                    for (Kendaraan k : bengkel.getKendaraanTerdaftar()) {
                        if (k.getNomorPlat().equals(nomorPlat)) {
                            kendaraan = k;
                            break;
                        }
                    }

                    if (kendaraan != null) {
                        System.out.print("Masukkan deskripsi layanan: ");
                        String deskripsiLayanan = scanner.nextLine();
                        System.out.print("Masukkan biaya layanan: ");
                        double biaya = scanner.nextDouble();
                        scanner.nextLine();  // Consume newline

                        Layanan layanan = new Layanan(deskripsiLayanan, biaya);
                        System.out.print("Masukkan tanggal servis (DD-MM-YYYY): ");
                        String tanggalServis = scanner.nextLine();

                        RiwayatServis riwayatServis = new RiwayatServis(kendaraan, tanggalServis, layanan);
                        bengkel.tambahRiwayatServis(riwayatServis);
                    } else {
                        System.out.println("Kendaraan tidak ditemukan.");
                    }
                    break;

                case 4:
                    // Tampilkan Riwayat Servis
                    System.out.println("=== Riwayat Servis ===");
                    bengkel.tampilkanRiwayatServis();
                    break;

                case 5:
                    // Keluar
                    running = false;
                    System.out.println("Terima kasih telah menggunakan Sistem Manajemen Kendaraan Bengkel.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
            System.out.println();
        }

        scanner.close();
    }
}
