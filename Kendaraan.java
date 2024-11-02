public class Kendaraan {
    public abstract class Kendaraan {
        private String nomorPlat;
        private String merk;

        public Kendaraan(String nomorPlat, String merk) {
            this.nomorPlat = nomorPlat;
            this.merk = merk;
        }

        public String getNomorPlat() {
            return nomorPlat;
        }

        public String getMerk() {
            return merk;
        }

        public abstract void displayInfo();
    }

}
