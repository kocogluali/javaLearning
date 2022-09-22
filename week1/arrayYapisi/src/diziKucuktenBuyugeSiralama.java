package arrayYapisi.src;
import java.util.Arrays;
public class diziKucuktenBuyugeSiralama {
    public static void main(String[] args) {
        int[] dizi ={300,4,5,7,11,100,89,200};
        Arrays.sort(dizi); //Array kütüphanesi ile dizileri sort ederek küçükten büyüğe sıralayabiliriz.

        for (int i : dizi) {
            System.out.println(i);
        }
    }
}
