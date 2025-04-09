package org.example.service;

import org.example.Model.FoodItem;
import org.example.Model.OrderService;
import org.example.Model.Orders;

import java.util.HashMap;
import java.util.Map;

public class OrderServices extends Orders implements OrderService
{
    public OrderServices()
    {
        this.finalOrder= new HashMap<>();
    }

    // This is for DirectOrder form food list....
public void takeOrder(StoreFoodItems storeFoodItems , int foodId, String foodName, int quan)
{
    for(FoodItem fis : storeFoodItems.items)
    {
        if(fis.getFoodId() == foodId)
        {
            if(fis.getFoodName().equalsIgnoreCase(foodName))
            {
                finalOrder.put(fis,quan);
            }
        }
    }
}

// This is for taking order from Cart interface.....
public void takeOrder(FoodItem fi,int quan)
    {
        finalOrder.put(fi,quan);

    }



    public void printBill()
    {

        int totalPrice=0;
        for(Map.Entry<FoodItem,Integer>entry : finalOrder.entrySet())
        {
            System.out.println("Food Id : "+entry.getKey().getFoodId());
            System.out.println("Food Name : "+entry.getKey().getFoodName());
            System.out.println("Food Price"+entry.getKey().getPrice());
            int eachDishPrice = (int)entry.getKey().getPrice()*entry.getValue();
            System.out.println("Total dish price "+eachDishPrice+"("+entry.getValue()+")");
            //System.out.println("Like : "+fi.getLikes());
            totalPrice+=eachDishPrice;
            System.out.println("-------------------------------------------");
        }
        System.out.println("Total Price : "+totalPrice);
    }
    //public void printBill()
}
