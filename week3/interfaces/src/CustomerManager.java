public class CustomerManager {
    private ICustomerDal iCustomerDal;

    public CustomerManager(ICustomerDal iCustomerDal) {
        this.iCustomerDal = iCustomerDal;
    }

    public void Add(){
        //burada iş kodları yazılır
        //müşterinin adı girilmiş gibi şeyleri kontrol ederiz. IDALda da add var ön kontrol gibi
        iCustomerDal.Add();
    }
}
