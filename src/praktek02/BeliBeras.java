package praktek02;
public class BeliBeras {
    double hargaberas;
    double bayar;
    
    void cetakInfo(){
        System.out.println("===========");
        System.out.println("Harga Beras/5kg = "+hargaberas);
        System.out.println("Bayar           = "+bayar);
        System.out.println("===========");
    }
    
    double kembalian(){
        double kembalian;
        kembalian = bayar-hargaberas;
        return kembalian;
        
    }
    
    void cetakkembalian(){
        System.out.println("Kembaliannya adalah : "+kembalian());
    }
}
