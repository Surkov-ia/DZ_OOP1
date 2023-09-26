package OOP_DZ_1;

import java.util.ArrayList;
import java.util.List;
public class AuthomatHotDrinks implements Authomat {
    List<HotDrinks> hotDrinksList = new ArrayList<>();
    List<HotDrinks> list = new ArrayList<>();
    @Override
    public void initProduct() {
    }
    public void initProduct(List<HotDrinks> list) {
        this.hotDrinksList = list;
    }
    @Override
    public String getProduct() {
        return null;
    }
    public String getProduct(String name) {
        list.clear();
        for (HotDrinks el : hotDrinksList) {
            if (el.getName().equals(name)) list.add(el);
        }
        return list.toString();
    }
    public String getProduct(int temp) {
        list.clear();
        for (HotDrinks el : hotDrinksList) {
            if (el.getTemp() <= temp) list.add(el);
        }
        return list.toString();
    }
    public String getProductPrice(int Price) {
        list.clear();
        for (HotDrinks el : hotDrinksList) {
            if (el.getPrice() <= Price) list.add(el);
        }
        return list.toString();
    }
}