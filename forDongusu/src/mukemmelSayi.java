package forDongusu.src;

public class mukemmelSayi {
    public static void main(String[] args) {
        int mukemmelSayi=18;
        int toplam=0;
        for (int sayi=1; sayi<=mukemmelSayi;sayi++) {
            if (mukemmelSayi%sayi==0) {
                toplam=toplam+sayi;
                            }
        }
        
        if (toplam==mukemmelSayi*2) {
            System.err.println(mukemmelSayi+" mükemmel sayıdır.");
        }else{
            System.err.println(mukemmelSayi+" mükemmel sayı değildir.");
        }
        
    }
}
