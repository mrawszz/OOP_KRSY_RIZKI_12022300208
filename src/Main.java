public class Main {
    public static void main(String[] args) {

        // To do: Buatlah sebuah Objek baru dari class Komputer
        Komputer komputer = new Komputer(0, null, 0);

        // To do: Panggillah Method Informasi dari class Komputer
        komputer.Informasi(2, "Rizki Net", 9000.0);

        System.out.println();


        // To do: Buatlah sebuah Objek baru dari class KomputerVIP 
        KomputerVIP komputerVIP = new KomputerVIP();

        // To do: Panggillah Method Informasi dari class KomputerVIP
        komputerVIP.Informasi(3, "Keren Wa");
        // To do: Panggillah Method Login
        komputerVIP.Login("Rizki");

        // To do: Panggillah Method Bermain 2x agar dapat melakukan polymorphism overloading
        

        System.out.println();


        // To do: Buatlah sebuah Objek baru dari class KomputerPremium

        // To do: Panggillah Method Informasi dari class KomputerPremium

        // To do: Panggillah Method Pesan

        // To do: Panggillah Method TambahLayanan 2x agar dapat melakukan polymorphism overloading
       
    }
}