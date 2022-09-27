public class Product {
    public Product(String name, String description, double price, int stockAmount, int id, String color, String kod){
        System.out.println("Yapıcı Bloklar çalıştı.");
        this.id = id ;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockAmount = stockAmount;
        this.color = color;
        this.kod= kod;

    }
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private int id;
    private String color;
    private String kod;
    //private o blokta geçerli demek onun dışına çıkamaz

    //getter
    public int getId() {
        return id;
    }

    //setter
    public void setId(int id) {
        id = id;
        //veya this._id =id; olarak da kullanılabilir.
        //this benim içerisinde bulunduğum class içinde geçerli olan komut
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {

        this.price = price;
    }

    public int getStockAmount() {

        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {

        this.stockAmount = stockAmount;
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public String getKod() {
        return this.name.substring(0, 1) + id;
    }
}
