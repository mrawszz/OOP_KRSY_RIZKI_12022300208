class KomputerPremium extends Komputer {
    // To do: Buatlah 1 variable sesuai ketentuan
    protected boolean ruangPrivat;
    
    // To do: Buatlah constructor pada class KomputerPremium
    public KomputerPremium(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean ruangPrivat){
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.ruangPrivat = ruangPrivat;
    }
    
    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan
    @Override
    public void Informasi(int jumlahKomputer, String namaWarnet, float hargaPerJam){
        if (ruangPrivat) {
            System.out.println("Status : Ruangan Premium " );
            System.out.println("Fasilitas Ruang Premium:");
            System.out.println("- Ruang ber-AC pribadi");
            System.out.println("- Sofa gaming exclusive");
            System.out.println("- Komputer spesifikasi tinggi");
            System.out.println("- Koneksi internet dedicated 100Mbps");
        }
        else {
            System.out.println("Status : Ruangan Standar");
            System.out.println("Fasilitas Ruang Standar");
            System.out.println("- Ruangan gerah");
            System.out.println("- Sofa majapahit");
            System.out.println("- Komputer spesifikasi rendah");
            System.out.println("- Koneksi internet dedicated 1Mbps");
        }
    }
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
    
    // To do: Buatlah method Pesan sesuai dengan ketentuan
    public void Pesan(int nomorKomputer){
        System.out.println(" Memesan komputer nomor : " + nomorKomputer);
    }

    // To do: Buatlah method TambahLayanan sesuai dengan ketentuan
    public void TambahLayanan(String makanan){
        System.out.println("Menambah layanan makanan : " + makanan);
    }

    // To do: Buatlah method TambahLayanan memakai Polymorphism Overloading sesuai dengan ketentuan
    public void TambahLayanan(String makanan, String minuman){
        System.out.println("Menambah layanan makanan : " + makanan + minuman);
    }
}
