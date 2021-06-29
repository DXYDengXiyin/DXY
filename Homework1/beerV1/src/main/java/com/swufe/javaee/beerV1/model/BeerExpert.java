package com.swufe.javaee.beerV1.model;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {

    public List getBrands(String color) {
        List<Beer> beer = new ArrayList<>();
        if (color.equals("amber")) {
            beer.add(new Beer("Xuehua","China","green"));
        } else {
            beer.add(new Beer("Wine","America","red"));
        }
        return (beer);
    }

}
