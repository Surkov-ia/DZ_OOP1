package OOP_DZ_1;

public class Drinks extends Product {
    private final int volume;
    public Drinks(String name, int price, int volume) {
        super(name, price);
        this.volume = volume;
    }
    public int getVolume() {
        return volume;
    }
    @Override
    public String toString() {
        return super.toString() + "\nОбъем: " + volume + "ml";
    }
}