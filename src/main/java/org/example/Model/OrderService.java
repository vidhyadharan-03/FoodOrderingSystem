package org.example.Model;

import org.example.service.StoreFoodItems;

public interface OrderService {
    void takeOrder(StoreFoodItems storeFoodItems , int foodId, String foodName, int quan);
    void printBill();
}
