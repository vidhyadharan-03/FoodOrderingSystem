package org.example.Model;

import org.example.service.OrderServices;

public interface CartService {
    void addToCart(FoodItem fi);
    void showList();
    void placeOrder(int foodId, int quan);
}
