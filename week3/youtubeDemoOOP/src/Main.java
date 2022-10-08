public class Main {
    public static void main(String[] args) {

       Company company = new Company();
       company.setId(1);
       company.setCity("Suşehri");
       company.setCompanyName("Arçelik");
       company.setEmail("kocogluali@yandex.com.tr");
       company.setTaxNumber("123456");

        CustomerManager customerManager = new CustomerManager(company,new MilitaryCreditManager() );
        customerManager.giveCredit();

    }
}