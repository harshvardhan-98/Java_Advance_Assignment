package Question1;

import java.time.LocalTime;
import java.util.ArrayList;

public class Menu {

    //    Here we are declaring an arraylist of menuList as class variable
    static ArrayList<Dish> dishes;

    //     Using static block
    static {
//       Adding some dishes by using Dish class
        Dish burger= new Dish(1, "Burger", LocalTime.now());
        Dish paneerTikka= new Dish(2, "Paneer Tikka", LocalTime.now());
        Dish chicken_tandoori= new Dish(3, "Chicken Tandoori", LocalTime.now());
        Dish pizza= new Dish(4, "Pizza", LocalTime.now());
        Dish dal_makhni= new Dish(5, "Dal Makhni", LocalTime.now());


//        Adding all created dishes to arraylist
        dishes = new ArrayList<Dish>();
        dishes.add(burger);
        dishes.add(paneerTikka);
        dishes.add(chicken_tandoori);
        dishes.add(pizza);
        dishes.add(dal_makhni);
    }
}