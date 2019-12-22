package com.example.android4a;

public class Product {
    private int id;
    private String title;
    private String shortdesc;
    private String rating;
    // private double price;
    private int image;

    public Product(int id, String title, String shortdesc, String rating, int image) {
        this.id = id;
        this.title = title;
        this.shortdesc = shortdesc;
        this.rating = rating;
//        this.price = price;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getShortdesc() {
        return shortdesc;
    }

    public String getRating() {
        return rating;
    }

//    public double getPrice() {
//        return price;
//    }

    public int getImage() {
        return image;
    }
}