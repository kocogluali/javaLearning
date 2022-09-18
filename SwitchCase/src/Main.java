package SwitchCase.src;

public class Main {
    public static void main(String[] args) {
        char grade='E';
        switch (grade) {
            case 'A':
                System.out.print("Tebrikler A ile sınıfı geçtiniz");
                break;
            case 'B':
                System.out.print("Tebrikler B ile sınıfı geçtiniz");
                break;    
            case 'C':
                System.out.print("Tebrikler C ile sınıfı geçtiniz");
                break;    
            default:
                System.out.print("Kaldınız..");
                break;
        }
    }
}
