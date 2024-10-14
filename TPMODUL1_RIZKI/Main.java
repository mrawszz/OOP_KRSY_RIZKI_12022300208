import java.util.ArrayList;
import java.util.Scanner;

class Penerbangan {
    private String nomorPenerbangan;
    private String bandaraKeberangkatan;
    private String bandaraTujuan;
    private String waktuKeberangkatan;
    private String waktuKedatangan;
    private float hargaTiket;

    // Constructor
    public Penerbangan(String nomorPenerbangan, String bandaraKeberangkatan, String bandaraTujuan, String waktuKeberangkatan, String waktuKedatangan, float hargaTiket) {
        this.nomorPenerbangan = nomorPenerbangan;
        this.bandaraKeberangkatan = bandaraKeberangkatan;
        this.bandaraTujuan = bandaraTujuan;
        this.waktuKeberangkatan = waktuKeberangkatan;
        this.waktuKedatangan = waktuKedatangan;
        this.hargaTiket = hargaTiket;
    }

    // Getter 
    public String getNomorPenerbangan() {
        return nomorPenerbangan;
    }

    public String getBandaraKeberangkatan() {
        return bandaraKeberangkatan;
    }

    public String getBandaraTujuan() {
        return bandaraTujuan;
    }

    public String getWaktuKeberangkatan() {
        return waktuKeberangkatan;
    }

    public String getWaktuKedatangan() {
        return waktuKedatangan;
    }

    public float getHargaTiket() {
        return hargaTiket;
    }

    public void tampilDaftarPenerbangan() {
        System.out.println("Nomor Penerbangan       : " + nomorPenerbangan);
        System.out.println("Bandara Keberangkatan   : " + bandaraKeberangkatan);
        System.out.println("Bandara Tujuan          : " + bandaraTujuan);
        System.out.println("Waktu Keberangkatan     : " + waktuKeberangkatan);
        System.out.println("Waktu Kedatangan        : " + waktuKedatangan);
        System.out.println("Harga Tiket             : " + hargaTiket);
        System.out.println();
    }
}

class Penumpang {
    private String NIK;
    private String namaDepan;
    private String namaBelakang;

    // Constructor
    public Penumpang(String NIK, String namaDepan, String namaBelakang) {
        this.NIK = NIK;
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
    }

    public void tampilDaftarPenumpang() {
        System.out.println("NIK             : " + NIK);
        System.out.println("Nama Depan      : " + namaDepan);
        System.out.println("Nama Belakang   : " + namaBelakang);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {

        ArrayList<Penerbangan> daftarPenerbangan = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Menambahkan beberapa penerbangan ke dalam daftar
        daftarPenerbangan.add(new Penerbangan("GA001", "CGK, Jakarta", "DPS, Denpasar", "10:00", "11:50", 1500000));
        daftarPenerbangan.add(new Penerbangan("GA002", "BTJ, Banda Aceh", "CGK, Jakarta", "14:00", "16:55", 2000000));
        daftarPenerbangan.add(new Penerbangan("GA003", "KNO, Kualanamu", "HLP, Jakarta", "08:00", "10:20", 1700000));

        Penumpang penumpang = null;
        Penerbangan penerbanganDipilih = null;
        boolean exit = false;

        // Menu Utama
        while (!exit) {
            System.out.println("==== EAD TICKET BOOKING SYSTEM ====");
            System.out.println("1. Tampilkan Daftar Penerbangan");
            System.out.println("2. Beli Tiket");
            System.out.println("3. Tampilkan Pesanan Tiket");
            System.out.println("4. Exit");
            System.out.print("Silahkan pilih menu yang sesuai : ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();  // Membersihkan input buffer

            switch (pilihan) {
                case 1:
                    System.out.println("\nDaftar Penerbangan Tersedia:");
                    for (int i = 0; i < daftarPenerbangan.size(); i++) {
                        Penerbangan penerbangan = daftarPenerbangan.get(i);
                        System.out.println((i + 1) + ". " + penerbangan.getNomorPenerbangan() + " - " + penerbangan.getBandaraKeberangkatan() + " ke " + penerbangan.getBandaraTujuan() + ", Waktu: " + penerbangan.getWaktuKeberangkatan() + " - " + penerbangan.getWaktuKedatangan() + ", Harga: " + penerbangan.getHargaTiket());
                    }
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Masukkan NIK: ");
                    String NIK = scanner.nextLine();
                    System.out.println("Masukkan Nama Depan: ");
                    String namaDepan = scanner.nextLine();
                    System.out.println("Masukkan Nama Belakang: ");
                    String namaBelakang = scanner.nextLine();

                    penumpang = new Penumpang(NIK, namaDepan, namaBelakang);

                    System.out.println("Terimakasih telah mengisi data pelanggan, silahkan pilih tiket penerbangan yang tersedia");
                    for (int i = 0; i < daftarPenerbangan.size(); i++) {
                        Penerbangan penerbangan = daftarPenerbangan.get(i);
                        System.out.println((i + 1) + ". " + penerbangan.getNomorPenerbangan() + " - " + penerbangan.getBandaraKeberangkatan() + " ke " + penerbangan.getBandaraTujuan() + ", Waktu: " + penerbangan.getWaktuKeberangkatan() + " - " + penerbangan.getWaktuKedatangan() + ", Harga: " + penerbangan.getHargaTiket());
                    }

                    System.out.print("Pilih nomor penerbangan: ");
                    int pilihanPenerbangan = scanner.nextInt();
                    scanner.nextLine();  // Membersihkan input buffer

                    if (pilihanPenerbangan > 0 && pilihanPenerbangan <= daftarPenerbangan.size()) {
                        penerbanganDipilih = daftarPenerbangan.get(pilihanPenerbangan - 1);
                        System.out.println("Pemesanan tiket berhasil dilakukan, cek pesanan tiket pada menu 3");
                    } else {
                        System.out.println("Pembelian tiket tidak ada.");
                    }
                    System.out.println();
                    break;

                case 3:
                    if (penumpang != null && penerbanganDipilih != null) {
                        System.out.println("\n========== Detail Tiker Penerbangan ==========");
                        penumpang.tampilDaftarPenumpang();
                        penerbanganDipilih.tampilDaftarPenerbangan();
                    } else {
                        System.out.println("Belum ada tiket yang dipesan.");
                    }
                    System.out.println();
                    break;

                case 4:
                    exit = true;
                    System.out.println("Terima kasih telah menggunakan EAD Ticket Booking System!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi.\n");
                    break;
            }
        }

        scanner.close();
    }
}
