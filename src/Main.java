import Models.PizzaMenu;
import Models.PizzaMenuItem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello World!");
        System.out.println("Hello there!");

        int num1 = 10;
        int num2 = 15;
        if(num1 == num2){
            System.out.println("num1 == num2");
        }else if(num1<num2){
            System.out.println("num1 < num2");
        }else{
            System.out.println("num1 > num2");
        }

        boolean b1 = false;


        PizzaMenuItem item1 = new PizzaMenuItem(190, "Hawai", "Pineapple pizza");
        PizzaMenuItem item2 = new PizzaMenuItem(190, "Hawai", "Pineapple pizza");
        PizzaMenuItem item3 = item1;

        item3.setPrice(200);

        if(item1 == item3){
            System.out.println("Yep");
        }else{
            System.out.println("Nope");
        }
        System.out.println(item1.getPrice());

        System.out.println(item1);

        List<PizzaMenuItem> pizzaItems = new ArrayList<>();
        pizzaItems.add(item1);
        pizzaItems.add(item2);
        pizzaItems.add(new PizzaMenuItem(250, "Polo", "Chicken pizza"));

        for (PizzaMenuItem item :
                pizzaItems) {
            System.out.println(item);
        }
        PizzaMenuItem itemFromList = pizzaItems.get(2);
        System.out.println(itemFromList);

        System.out.println("------------------");
        PizzaMenu menu1 = new PizzaMenu();
        menu1.addItem(new PizzaMenuItem(150,"Hawai",""));
        menu1.addItem(new PizzaMenuItem(200,"Polo",""));
        menu1.addItem(new PizzaMenuItem(220,"Tuna",""));

        PizzaMenu menu2 = new PizzaMenu();
        menu2.addItem(new PizzaMenuItem(150,"Hawai",""));
        menu2.addItem(new PizzaMenuItem(200,"Polo",""));
        menu2.addItem(new PizzaMenuItem(220,"Tuna",""));

        System.out.println("Lat update: " + menu1.getLastUpdate());
        System.out.println("Size of the menu: " + menu1.getMenuSize());
        for (PizzaMenuItem pizza :
                menu1.getMenuItems()) {
            System.out.println(pizza);

        }
        if (menu1.equals(menu2)){
            System.out.println("true");
        }
    }
}
