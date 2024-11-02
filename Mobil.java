public class Mobil {
    public class Mobil extends Kendaraan {
        private int jumlahPintu;

        public Mobil(String nomorPlat, String merk, int jumlahPintu) {
            super(nomorPlat, merk);
            this.jumlahPintu = jumlahPintu;
        }

        public int getJumlahPintu() {
            return jumlahPintu;
        }

        @Override
        public void displayInfo() {
            System.out.println("Mobil - Plat: " + getNomorPlat() + ", Merk: " + getMerk() + ", Jumlah Pintu: " + jumlahPintu);
        }
    }

}
