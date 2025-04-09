package org.example.service;

import org.example.Model.Cart;
import org.example.Model.FoodItem;

import java.util.ArrayList;

public class CartService extends Cart implements org.example.Model.CartService {



    public CartService()
    {
        this.cartList = new ArrayList<>();
    }
    public void addToCart(FoodItem wish)
    {
        this.cartList.add(wish);
    }

    public void showList()
    {
        for(FoodItem fi : cartList)
        {
            System.out.println("Food Id : "+fi.getFoodId());
            System.out.println("Food Name : "+fi.getFoodName());
            System.out.println("Food Price"+fi.getPrice());
            System.out.println("Like : "+fi.getLikes());

            System.out.println("-------------------------------------------");
        }
    }
    public void removeItem(int deleteId)
    {


        for(FoodItem fi : cartList)
        {
            if(fi.getFoodId()==deleteId)
            {
                cartList.remove(fi);
                System.out.println("Item Successfully Removed from Cart !! ");
                break;
            }
        }
    }
    public void placeOrder( int foodId,int quan,OrderServices ord)
    {
            for (FoodItem fi : cartList) {
                if (fi.getFoodId() == foodId) {
                    ord.takeOrder(fi, quan);
                }
            }
    }





}
