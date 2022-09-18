package SwitchCase.src;

public class sesliSessizHarf {
    public static void main(String[] args) {
        char harf='g';
        switch (harf) {
            case 'a':
                System.out.println("Bu harf:"+harf +" sesli harftir.");
                break;
            case 'e':
                System.out.println("Bu harf:"+harf +" sesli harftir.");
                break;
            case 'ı':
                System.out.println("Bu harf:"+harf +" sesli harftir.");
                break;
            case 'i':
                System.out.println("Bu harf:"+harf +" sesli harftir.");
                break;
            case 'o':
                System.out.println("Bu harf:"+harf +" sesli harftir.");
                break;
            case 'ö':
                System.out.println("Bu harf:"+harf +" sesli harftir.");
                break;
            case 'u':
                System.out.println("Bu harf:"+harf +" sesli harftir.");
                break;
            case 'ü':
                System.out.println("Bu harf:"+harf +" sesli harftir.");
                break;
            default:
            System.out.println("Sessiz bir harf girdiniz:"+harf);
                break;
        }
    }
}
