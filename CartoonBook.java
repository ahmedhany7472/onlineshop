package com.mycompany.ass2;

public class CartoonBook implements Product {//subclass from prduct class

    double price;

    // a constructor of the class
    public CartoonBook(double pr) {
        this.price = pr;
    }

    // a setter method to pass the value of the price
    @Override
    public void setPrice(double pr) {
        this.price = pr;
    }

    //a getter method to get the value of the price mult. in 0.2
    @Override

    public double getPrice() {
        return (price * 0.2);
    }
}
