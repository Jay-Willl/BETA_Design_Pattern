package com.framework;

public abstract class Factory {
    public final Product create(String str){
        Product p = createProduct(str);
        registerProduct(p);
        return p;
    }

    public abstract Product createProduct(String str);

    public abstract void registerProduct(Product product);

}
