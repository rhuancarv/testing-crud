package io.github.rhuancarv.testingcrud.entity;

/**
 * Created by Rhuan on 11/09/2015.
 */
public class Product {

    private int idProduct;
    private String name;
    private int quantity;
    private double price;

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
