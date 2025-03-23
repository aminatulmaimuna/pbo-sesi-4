// Superclass
class Kendaraan {
    protected String merk;
    protected int tahun;
    
    // Constructor
    public Kendaraan(String merk, int tahun) {
        this.merk = merk;
        this.tahun = tahun;
    }
    
    // Method
    public void info() {
        System.out.println("Kendaraan: " + merk + ", Tahun: " + tahun);
    }
    
    // Overloaded method
    public void info(String tambahan) {
        System.out.println("Kendaraan: " + merk + ", Tahun: " + tahun + ", " + tambahan);
    }
}

// Subclass 1
class Mobil extends Kendaraan {
    private int jumlahPintu;
    
    // Constructor
    public Mobil(String merk, int tahun, int jumlahPintu) {
        super(merk, tahun);
        this.jumlahPintu = jumlahPintu;
    }
    
    // Overriding method
    @Override
    public void info() {
        System.out.println("Mobil: " + merk + ", Tahun: " + tahun + ", Pintu: " + jumlahPintu);
    }
}

// Subclass 2
class Motor extends Kendaraan {
    private boolean memilikiBox;
    
    // Constructor
    public Motor(String merk, int tahun, boolean memilikiBox) {
        super(merk, tahun);
        this.memilikiBox = memilikiBox;
    }
    
    // Overriding method
    @Override
    public void info() {
        System.out.println("Motor: " + merk + ", Tahun: " + tahun + ", Memiliki Box: " + (memilikiBox ? "Ya" : "Tidak"));
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Kendaraan kendaraan = new Kendaraan("Yamaha", 2020);
        kendaraan.info();
        kendaraan.info("Motor Sport"); // Overloading
        
        Mobil mobil = new Mobil("Toyota", 2022, 4);
        mobil.info(); // Overriding
        
        Motor motor = new Motor("Honda", 2021, true);
        motor.info(); // Overriding
    }
}
