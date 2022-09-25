package classesWithAttribute.src;


public class Main{
    public static void main(String[] args) {
       /* Product product =new Product();
        product.setId(1);
        product.setName("Laptop");
        product.setDescription("asus laptop");
        product.setPrice(123);
        product.setStockAmount(10);*/
        
        Product product = new Product(1, "Notebook", "Asus Laptop", 14500, 150);
        ProductManager productManager =  new ProductManager();
        productManager.Add(product);
        System.out.println(product.getKod());
    }
}