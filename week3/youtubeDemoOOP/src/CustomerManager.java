public class CustomerManager {
 private  Customer customer;
 private IBaseCreditManager iBaseCreditManager;

    public CustomerManager(Customer customer, IBaseCreditManager iBaseCreditManager) {
        this.customer = customer;
        this.iBaseCreditManager = iBaseCreditManager;
    }
    public void Add(Customer customer){
        System.out.println("Müşteri Eklendi. "+ customer.getId());
    }
    public void Delete(Customer customer){
        System.out.println("Müşteri Silindi. "+ customer.getId());
    }
    public void giveCredit(){
        iBaseCreditManager.Calc();
        iBaseCreditManager.Save();
    }
}
