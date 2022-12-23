package com.mycompany.ass2;

public class Ass2 {

    public static void main(String[] args) {
        // create an object as array
        Product[] arr = new Product[3];

        //first index that create object from book class 
        arr[0] = new Book(40);
        //call the method getprice 
        System.out.println("price of book is :" + arr[0].getPrice());

        //second index that create object from children book class
        arr[1] = new ChildrenBook(20);
        //call the method getprice 
        System.out.println("price of childrenbook is :" + arr[1].getPrice());

        //third index that create object from cartoon book class
        arr[2] = new CartoonBook(600);
        //call the method getprice
        System.out.println("price of cartoonbook is :" + arr[2].getPrice());
    }
}
