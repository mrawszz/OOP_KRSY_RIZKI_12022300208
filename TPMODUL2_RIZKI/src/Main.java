public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Oyen", 2, "Anggora");
        System.out.println("Detail Hewan:\n");
        System.out.println("Ini adalah "+ kucing.nama + "!");
        kucing.suara();
        kucing.makan();
        kucing.makan("ikan.");

        System.out.println();

        Burung burung = new Burung("Rio", 1, "Kuning");
        System.out.println("Ini adalah " + burung.nama + "!");
        burung.suara();
        burung.makan();
        burung.makan("biji-bijian.\n");
        kucing.infoHewan();
        System.out.println();
        burung.infoHewan();
    }
}