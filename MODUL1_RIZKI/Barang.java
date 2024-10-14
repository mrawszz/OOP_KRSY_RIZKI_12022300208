public class Barang {
    //Atribut
    private String nama;
    private Integer jumlah;
    private Double harga;

    // Constructor Barang
    public Barang(String nama, Integer jumlah, Double harga){
        this.nama = nama;
        this.jumlah =jumlah;
        this.harga=harga;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Integer getJumlah() {
        return jumlah;
    }

    public void setJumlah(Integer jumlah) {
        this.jumlah = jumlah;
    }

    public Double getHarga() {
        return harga;
    }

    public void setHarga(Double harga) {
        this.harga = harga;
    }

    // Method tampilkanData
    public void tampilkanData() {
        System.out.println(nama);
        System.out.println(jumlah);
        System.out.println(harga);
    }
}
