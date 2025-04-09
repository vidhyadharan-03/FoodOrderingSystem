package org.example;
import org.example.Model.FoodItem;
import java.util.*;

import org.example.service.CartService;
import org.example.service.OrderServices;
import org.example.service.StoreFoodItems;

public class Main {

    public static void main(String[] args) {
        System.out.println("                                         Welcome to Niggy Ordering App                              ");
        StoreFoodItems storeFoodItems = new StoreFoodItems();
        OrderServices ord=new OrderServices();
        CartService cart = new CartService(ord);

        // FoodItem fooditem = new FoodItem();
        Scanner scan = new Scanner(System.in);
        for (int iter = 0; iter < 5; iter++) {
            FoodItem fooditem = new FoodItem();
            System.out.println("Enter food id");
            fooditem.setFoodId(scan.nextInt());
            System.out.println("Enter food Name");
            fooditem.setFoodName(scan.next());
            System.out.println("Enter Food Price");
            fooditem.setPrice(scan.nextDouble());
            storeFoodItems.addItem(fooditem);
        }
        System.out.println();
        System.out.println();
        storeFoodItems.showItems();

        //cartInput(storeFoodItems,cart);
//        System.out.println("-----------------------------------");


        System.out.println("1. Add to Cart");
        System.out.println("2. Order food");
        int choice = scan.nextInt();
        String input;
        int flag=0;
        switch (choice) {

            case 1:
                do {
                    cartInput(storeFoodItems, cart, choice);
                    System.out.print("Do you want to add More : ");
                    input = scan.next();
                }
                while (input.equalsIgnoreCase("yes"));
                cart.showList();
                System.out.println();
                System.out.print("Do you Like to Place an Order");
                String inputOrder = scan.next();
                if(inputOrder.equalsIgnoreCase("yes"))
                {


                    String inputForOrder;
                    do {
                        System.out.print("Enter the food Id : ");
                        int foodId = scan.nextInt();
                        System.out.println();
                        System.out.print("Enter the quanity : ");
                        int quantity = scan.nextInt();
                        cart.placeOrder(foodId, quantity);
                        System.out.println();
                        System.out.print("You can still order More : ");
                        inputForOrder=scan.next();
                        flag=1;
                    }
                    while(inputForOrder.equalsIgnoreCase("yes"));
                    ord.printBill();



                }
                break;
            case 2:
                orderInput(storeFoodItems);



        }
        if(flag==0) {
            cart.showList();
        }
        else {

        }
    }


    public static void cartInput(StoreFoodItems storeFoodItems, CartService cs, int choice) {
        Scanner scan = new Scanner(System.in);
        int flag = 0;

//           int choice = scan.nextInt();

        System.out.print("Enter the food Id : ");
        int foodId = scan.nextInt();
        System.out.println();
        System.out.print("Enter the Food Name : ");
        String foodName = scan.next();

        for (FoodItem item : storeFoodItems.items) {
            if ((item.getFoodId() == foodId) && (item.getFoodName().equalsIgnoreCase(foodName))) {
                cs.addToCart(item);
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Kindly Check the Food Details....");
        } else {
            System.out.println("Food has been successfully added to Cart");
            System.out.println();
        }
    }

    public static void orderInput(StoreFoodItems sfi)
    {
        OrderServices ord = new OrderServices();
        Scanner scan = new Scanner(System.in);
        String input;
        do {
            System.out.print("Enter the food Id : ");
            int foodId = scan.nextInt();
            System.out.println();
            System.out.print("Enter the Food Name : ");
            String foodName = scan.next();
            System.out.println();
            System.out.print("Enter the quanity : ");
            int quantity = scan.nextInt();

            //ord.setQuantity(quantity);

            ord.takeOrder(sfi, foodId, foodName,(Integer) quantity);

            System.out.print("Do you want more : ");
            input=scan.next();

        }while(input.equalsIgnoreCase("yes"));

        ord.printBill();


    }

}