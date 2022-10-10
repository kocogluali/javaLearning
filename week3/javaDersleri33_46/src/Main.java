public class Main {
    public static void main(String[] args) {
      //  BaseLogger[] loggers = new  BaseLogger[]{new FileLogger(),new MailLogger(),new DatabaseLogger()};
    CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
    customerManager.Add();
    }
}