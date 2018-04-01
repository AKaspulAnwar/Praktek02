package praktek02;
public class BeliBerasAksi {
    public static void main(String[] args) {
        BeliBeras siam = new BeliBeras();
        siam.hargaberas = 50000;
        siam.bayar      = 100000;
        
        System.out.println("Beras Siam");
        siam.cetakInfo();
        System.out.println("Uang Kembali    =Rp."+siam.kembalian());
        siam.cetakkembalian();
        
        BeliBeras jawa = new BeliBeras ();
        System.out.println("Beras Jawa");
        jawa.cetakInfo();
        System.out.println("Uang Kembali    =Rp."+jawa.kembalian());
        jawa.cetakkembalian();
        
        BeliBeras ketan = new BeliBeras (65000,70000);
        System.out.println("Beras Ketan");
        ketan.cetakInfo();
        System.out.println("Uang Kembali    =Rp."+ketan.kembalian());
        ketan.cetakkembalian();
     }
}