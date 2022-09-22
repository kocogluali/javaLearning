package forDongusu.src;

public class asalSayi {
    public static void main(String[] args) {
        int asalSayi=11;
        int sonuc;
        for (int sayi=2 ; sayi<asalSayi; sayi++) {
           sonuc=asalSayi%sayi;
           if (sonuc==0) {
            System.err.println("Sonuç asal sayı değildir.");
            break;
           }
           if(sayi+1==asalSayi){
            System.err.println("Sonuç asal sayıdır.");
           }
         
        }
        }
    }

