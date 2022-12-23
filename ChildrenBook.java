package com.mycompany.ass2;

public class ChildrenBook implements Product{//subclass from prduct class

    double price;

    // a constractor of the class
    public ChildrenBook(double pr) {
        this.price = pr;
    }

    // setter method to pass the value of the price
    @Override

    public void setPrice(double pr) {
        this.price = pr;
    }

    //a getter method to get the price mult. in 0.3
    @Override

    public double getPrice() {
        return (price * 0.3);

    }

}
