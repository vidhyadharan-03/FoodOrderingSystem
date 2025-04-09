package org.example.service;
import org.example.Model.FoodItem;

import java.util.ArrayList;
import java.util.List;
public class StoreFoodItems {
   public List<FoodItem>items;

    public StoreFoodItems()
    {
        this.items=new ArrayList<>();
    }

    public void addItem(FoodItem fi)
    {
        items.add(fi);
        System.out.println("Successfully Dish added in the Menu");
        System.out.println();
    }
    public void showItems()
    {
        for(FoodItem fi : items)
        {
            System.out.println("Food Id : "+fi.getFoodId());
            System.out.println("Food Name : "+fi.getFoodName());
            System.out.println("Food Price : "+fi.getPrice());
            System.out.println("Like : "+fi.getLikes());

            System.out.println("-------------------------------------------");
        }
    }



}
