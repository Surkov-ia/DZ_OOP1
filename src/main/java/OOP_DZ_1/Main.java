package OOP_DZ_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        System.out.println("█".repeat(50));
        AuthomatHotDrinks Drinks = new AuthomatHotDrinks();
        List<HotDrinks> hotDrinksList = new ArrayList<>(Arrays.asList(
                new HotDrinks("шоколад", 150, 450, 80),
                new HotDrinks("шоколад", 100, 300, 80),
                new HotDrinks("шоколад", 70, 250, 80),
                new HotDrinks("кофе", 150, 450, 90),
                new HotDrinks("кофе", 100, 300, 90),
                new HotDrinks("кофе", 70, 250, 90),
                new HotDrinks("чай", 150, 450, 70),
                new HotDrinks("чай", 100, 30, 70),
                new HotDrinks("чай", 70, 250, 70)));
        Drinks.initProduct(hotDrinksList);
        System.out.println("Поиск по названию: " + Drinks.getProduct("шоколад")
                .replace("[", "").replace("]", ""));
        System.out.println("█".repeat(50));
        System.out.println("Поиск по цене: " + Drinks.getProductPrice(80)
                .replace("[", "").replace("]", ""));
        System.out.println("█".repeat(50));
        System.out.println("Поиск по температуре: " + Drinks.getProduct(70)
                .replace("[", "").replace("]", ""));
        System.out.println("█".repeat(50));
    }
}