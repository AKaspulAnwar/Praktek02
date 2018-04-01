package praktek02;
public class BeliBeras {
    double hargaberas;
    double bayar;

    public BeliBeras() {
        hargaberas = 40000;
        bayar      = 50000;
    }

    public BeliBeras(double hargaberas, double bayar) {
        this.hargaberas = hargaberas;
        this.bayar = bayar;
    }
    
    
    void cetakInfo(){
        System.out.println("================================");
        System.out.println("Harga Beras/5kg =Rp."+hargaberas);
        System.out.println("Bayar           =Rp."+bayar);
        System.out.println("================================");
    }
    
    double kembalian(){
        double kembalian;
        kembalian = bayar-hargaberas;
        return kembalian;
        
    }
    
    void cetakkembalian(){
        System.out.println("Kembaliannya adalah :Rp."+kembalian());
    }
}
