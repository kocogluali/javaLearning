public abstract class GameCalc {
    public  abstract void hesapla(); //burası değişecek yer , burası override edilmek zorunda
    public final void gameOver(){ //burası standart tüm herkes için geçerli ve final sayesinde bunu override edemiyoruz
        System.out.println("Oyun bitti");
    }
}
