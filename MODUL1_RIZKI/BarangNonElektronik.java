public class BarangNonElektronik extends Barang {
    //Atribut
    private String material;

    // Constructor BarangNonElektronik
    public BarangNonElektronik(String nama, String jumlah, String harga, String material){
        super(nama, jumlah, harga);
        this.material = material;
    }

    // Getter dan Setter untuk material
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    // Override method tampilkanData
    @Override
    public void tampilkanData() {
        super.tampilkanData();
        //Tampilan
        System.out.println("Material : " + material);

    }
    
}
