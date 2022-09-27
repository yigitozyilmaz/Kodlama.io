public class Main {
    public static void main(String[] args) {
        Product product = new Product("Laptop", "Asus Laptop", 5000 , 3 ,1 ,"Siyah" ,"L1");

        product.setName("Laptop");
        product.setId(1);
        product.setPrice(5000);
        product.setDescription("Asus Laptop");
        product.setStockAmount(3);
        product.setColor("Kırmızı");

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.print(product.getKod());

    }
}
