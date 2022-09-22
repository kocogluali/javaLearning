package whileDongusu.src;

public class faktoriyel {
    public static void main(String[] args) {
        System.out.println("Faktoriyel Hesaplama Yapıyoruz..");
        int faktoriyel=4;
        int sonuc=1;
        while (faktoriyel>0){
            sonuc=sonuc*(faktoriyel);
            faktoriyel=faktoriyel-1;
        }
        System.out.println(sonuc);

    }
}
