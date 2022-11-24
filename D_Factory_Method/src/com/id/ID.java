package com.id;

import com.framework.Product;

public class ID extends Product {

    private String id;

    public ID(String id){
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void use(){
        System.out.println("use id: " + id);
    }
}
