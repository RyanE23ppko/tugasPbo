public class Motor {
    public class Motor extends Kendaraan {
        private int kapasitasMesin;

        public Motor(String nomorPlat, String merk, int kapasitasMesin) {
            super(nomorPlat, merk);
            this.kapasitasMesin = kapasitasMesin;
        }

        public int getKapasitasMesin() {
            return kapasitasMesin;
        }

        @Override
        public void displayInfo() {
            System.out.println("Motor - Plat: " + getNomorPlat() + ", Merk: " + getMerk() + ", Kapasitas Mesin: " + kapasitasMesin + "cc");
        }
    }

}
