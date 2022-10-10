public class BaseKrediManager {
    public double hesapla(double tutar){ //public final double hesapla(double tutar){
        //final overriding engeller tarım ogretmen kreidmanagerlar için hesapla mehtodu çalışmaz.
        return tutar*1.18;
    }
}
