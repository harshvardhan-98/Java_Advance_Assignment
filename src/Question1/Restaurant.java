package Question1;

import java.util.ArrayList;
import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
//        Getting the menuList variable of Menu class
        ArrayList<Dish> dishes = Menu.dishes;

//        The loop will run until user press 0 to Exit
        do {
            System.out.println("===================== Restaurant =====================" +
                    "\nPress 1 to display Dishes."+
                    "\nPress 2 to search Dish."+
                    "\nPress 0 to Exit");
            choice = scanner.nextInt();
            if (choice == 1) {
                dishes.forEach((Dish dish)->System.out.println(dish));
            }else if(choice == 2){
                System.out.println("Enter Dish ID");
                int id = scanner.nextInt();
                if(id < 1 || id > dishes.size()){
                    System.out.println("Dish is not available");
                }else {
                    for (int i=0; i<dishes.size();i++){
                        if (dishes.get(i).dishID == id){
                            System.out.println("Dish found successfully...");
                            System.out.println(dishes.get(i));
                        }
                    }
                }
            }
        }while (choice != 0);
    }
}