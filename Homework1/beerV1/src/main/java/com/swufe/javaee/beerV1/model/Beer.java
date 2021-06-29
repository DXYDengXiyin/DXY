package com.swufe.javaee.beerV1.model;

public class Beer {
    private String brand;
    private String color;
    private String country;

    Beer(String brand,String country,String color){
        this.brand = brand;
        this.country = country;
        this.color = color;
            }

    public String toString(){
        return ("The brand is "+brand +
                "the price is " + country +
                "the color is " + color );
    }

}
