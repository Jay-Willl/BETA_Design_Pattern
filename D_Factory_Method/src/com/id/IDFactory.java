package com.id;

import com.framework.Factory;
import com.framework.Product;

import java.util.ArrayList;

public class IDFactory extends Factory {

    private ArrayList<String> ids;

    @Override
    public Product createProduct(String str) {
        return new ID(str);
    }

    @Override
    public void registerProduct(Product product) {
        ids.add(((ID)product).getId());
    }
}
