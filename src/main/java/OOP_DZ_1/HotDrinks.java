package OOP_DZ_1;

public class HotDrinks extends Drinks {
    private final int temp;
    public HotDrinks(String name, int price, int volume, int temp) {
        super(name, price, volume);
        this.temp = temp;
    }
    public int getTemp() {
        return temp;
    }
    @Override
    public String toString() {
        return super.toString() + "\nТемпература: " + temp + "℃\n";
    }
}