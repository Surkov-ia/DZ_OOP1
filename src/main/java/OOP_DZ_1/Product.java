package OOP_DZ_1;
public abstract class Product {
    private String name;
    private int price;
    public Product() {
    }
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public Product(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return  "\nНазвание: " + name + "\nЦена: " + price + "₽";
    }
}