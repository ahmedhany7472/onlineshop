package com.mycompany.ass2;

public class Book implements Product {//subclass from prduct class

    double price;

    // a constractor of the  class
    public Book(double pr) {
        this.price = pr;
    }

    // a setter method to pass a value of the price
    @Override
    public void setPrice(double pr) {
        this.price = pr;

    }

    //a getter method to return the value of price mult. in 0.5
    @Override

    public double getPrice() {
        return (price * 0.5);

    }

}
