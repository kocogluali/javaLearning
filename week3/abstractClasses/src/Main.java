public class Main {
    public static void main(String[] args) {
        //abstarct sınıflar asla newlenemez , tek başına kullanılamaz

        GameCalc gameCalcs = new ChildGameCalc();
        gameCalcs.hesapla();
        GameCalc womanCalc = new WomanGameCalc();
        womanCalc.hesapla();

        GameCalc manCalc  = new ManGameCalc();
        manCalc.hesapla();
    }
}