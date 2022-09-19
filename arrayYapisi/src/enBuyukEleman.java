package arrayYapisi.src;

public class enBuyukEleman {
    public static void main(String[] args) {
        int[] dizi ={3,4,5,7,11,100,89,200};
        int enbuyuk=0;
        for (int i : dizi) {
            if(i>enbuyuk){
                enbuyuk=i;
            }
        }
        System.out.println("Dizinin en büyük elamanı:"+enbuyuk);
    }
}
