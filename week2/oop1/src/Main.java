package oop1.src;

public class Main {
    public static void main(String[] args) {
        
        Product produck1 = new Product();
        produck1.setName("Kahve Makinesi");
        produck1.setDiscount(11);
        produck1.setUnitPrice(400);
        produck1.setUnitsInStock(3);
        produck1.setImageURL("benimlink1.pjg");

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setCustomerNumber("58582828");
        individualCustomer.setPhone("05353586058");
        individualCustomer.setFirstName("Ali Kemal");
        individualCustomer.setLastName("Koçoğlu");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setCompanyName("KodlamaIO");
        corporateCustomer.setTaxNumber("380960");
        corporateCustomer.setId(2);
        corporateCustomer.setCustomerNumber("123");
        corporateCustomer.setPhone("05333333");

        Customer[] customers = {individualCustomer,corporateCustomer};

        for (Customer customer : customers) {
            System.out.println(customer.getId());
        }
    }
}
