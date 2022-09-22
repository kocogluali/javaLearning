package SwitchCase.src;

public class enumGun {
    public static void main(String[] args) {
        enum gun{Paz, Sal, Çar, Per, Cum, Cts, Pzr};
        gun[] DayNow=gun.values();
        for (gun Now: DayNow) {
            
            switch (Now) {
                case Paz:    
                    System.out.println("Pazartesi");    
                    break;    
                case Sal:    
                    System.out.println("Salı");    
                    break;    
                case Çar:    
                    System.out.println("Çarşamba");    
                    break;         
                case Per:    
                    System.out.println("Perşembe");    
                    break;    
                 case Cum:    
                    System.out.println("Cuma");    
                    break;    
                case Cts:    
                    System.out.println("Cumartesi");    
                    break;    
                case Pzr:    
                    System.out.println("Pazar");    
                    break;    
            }
        } 
    }
}
