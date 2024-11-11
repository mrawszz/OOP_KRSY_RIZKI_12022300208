class KomputerVIP extends Komputer {
    // To do: Buatlah 1 variable sesuai ketentuan
    protected boolean vipCard;
    
    // To do: Buatlah constructor pada class KomputerVIP
    public KomputerVIP(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean vipCard){
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.vipCard = vipCard;
    }
    
    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan
    @Override
    public void Informasi(int jumlahKomputer, String namaWarnet, float hargaPerJam){
        super.Informasi(jumlahKomputer, namaWarnet, hargaPerJam);
        if (vipCard) {
            System.out.println("Status : Member VIP" );
            System.out.println("Benefit Member VIP:");
            System.out.println("- Diskon 10% untuk bermain di atas 3 jam");
            System.out.println("- Gratis minuman setiap 4 jam bermain");
            System.out.println("- Prioritas booking komputer gaming");
        }
        else {
            System.out.println("Status : Non VIP");
            System.out.println(" Benefit Member Non VIP : ");
            System.out.println("Yahh kasian ngarep benefit :)");
        }
        

    }
    
    public void Login(String username){
        System.out.println("Login dengan username : " + username);
    }

    public void Bermain (int jam){
        System.out.println("Bermain selama " + jam);
    }

    public void Bermain(int jam, int menitTambahan){
        System.out.println("Nambah billing selama " + jam + menitTambahan);
    }
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
    
    // To do: Buatlah method Login sesuai dengan ketentuan
    
    // To do: Buatlah method Bermain sesuai dengan ketentuan
    
    // To do: Buatlah method Bermain memakai Polymorphism Overloading sesuai dengan ketentuan

}